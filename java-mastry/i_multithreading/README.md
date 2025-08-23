
---

## Basics

**Description**
A thread is the smallest unit of execution. Every Java program starts on the “main” thread. You can create additional threads to run tasks concurrently.

**Code Example**

```java
public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello from: " + Thread.currentThread().getName()); // main
    }
}
```

---

## Multithreading in Java

**Description**
Multithreading runs multiple threads in the same process, improving responsiveness and throughput when tasks are independent.

**Code Example**

```java
public class MultithreadingDemo {
    static class Worker extends Thread {
        private final String label;
        Worker(String label) { this.label = label; }
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(label + " step " + i + " on " + Thread.currentThread().getName());
            }
        }
    }
    public static void main(String[] args) {
        new Worker("Download").start();
        new Worker("Upload").start();
    }
}
```

---

## Thread States

**Description**
A Java thread goes through a well-defined lifecycle. States are defined in the `Thread.State` enum:

* **NEW** → created but not started.
* **RUNNABLE** → eligible to run, but may or may not be running.
* **RUNNING** → actually executing on the CPU (part of RUNNABLE).
* **BLOCKED** → waiting to acquire a monitor lock.
* **WAITING** → waiting indefinitely for another thread’s signal.
* **TIMED\_WAITING** → waiting for a specific amount of time.
* **TERMINATED** → finished execution, cannot be restarted.

**State Table**

| **State**          | **When it happens**                                  | **Enter by**                        | **Exit by**                               |
| ------------------ | ---------------------------------------------------- | ----------------------------------- | ----------------------------------------- |
| **NEW**            | Thread created but not started                       | `new Thread(runnable)`              | `start()` → RUNNABLE                      |
| **RUNNABLE**       | Eligible to run, may or may not be running           | After `start()`                     | Scheduler picks → RUNNING / stays queued  |
| **RUNNING**        | Actively executing on CPU (subset of RUNNABLE)       | Chosen by scheduler                 | Finishes / waits / blocked                |
| **BLOCKED**        | Waiting to acquire a lock on a synchronized resource | Another thread owns the lock        | Lock released → back to RUNNABLE          |
| **WAITING**        | Waiting indefinitely until notified                  | `obj.wait()`                        | `notify()` / `notifyAll()`                |
| **TIMED\_WAITING** | Waiting for a limited time                           | `sleep(ms)`, `join(ms)`, `wait(ms)` | Timeout expires / notified                |
| **TERMINATED**     | Thread has completed execution                       | `run()` finishes                    | Cannot restart (need a new Thread object) |

**Code Example**

```java
public class ThreadStatesDemo {
    static class Worker extends Thread {
        public void run() {
            try {
                Thread.sleep(200); // TIMED_WAITING
                synchronized (this) { wait(); } // WAITING
            } catch (Exception ignored) {}
        }
    }

    public static void main(String[] args) throws Exception {
        Worker t = new Worker();
        System.out.println("State after creation: " + t.getState()); // NEW
        t.start();
        Thread.sleep(50);
        System.out.println("State after start: " + t.getState());   // RUNNABLE or TIMED_WAITING
        Thread.sleep(300);
        System.out.println("State in wait: " + t.getState());       // WAITING
        synchronized (t) { t.notify(); }                            // wake up
        t.join();
        System.out.println("State after termination: " + t.getState()); // TERMINATED
    }
}
```



---




## How to create thread

**Description**
Two ways: extend `Thread` or implement `Runnable` and pass it to a `Thread`. Prefer `Runnable` to decouple task from thread and keep inheritance free.

**Code Example**

```java
public class CreateThread {
    static class ExtendsThread extends Thread {
        public void run() { System.out.println("ExtendsThread on " + getName()); }
    }
    static class ImplementsRunnable implements Runnable {
        public void run() { System.out.println("ImplementsRunnable on " + Thread.currentThread().getName()); }
    }
    public static void main(String[] args) {
        new ExtendsThread().start();
        new Thread(new ImplementsRunnable()).start();
    }
}
```

---

## Thread Lifecycle

**Description**
States: New → Runnable → Running → Waiting/Timed Waiting/Blocked → Terminated.

**Code Example**

```java
public class LifecycleDemo extends Thread {
    public void run() {
        try { Thread.sleep(200); } catch (InterruptedException ignored) {}
        System.out.println("Running then finishing");
    }
    public static void main(String[] args) throws Exception {
        LifecycleDemo t = new LifecycleDemo();          // New
        System.out.println("New: " + t.getState());
        t.start();                                       // Runnable/Running
        Thread.sleep(50);
        System.out.println("After start: " + t.getState());
        t.join();                                        // Wait main for t
        System.out.println("After join: " + t.getState());// Terminated
    }
}
```

---

## Thread vs Runnable

**Description**
`Thread` couples task and thread; `Runnable` separates the task from the executing thread, enabling reuse and pooling.

**Code Example**

```java
public class ThreadVsRunnable {
    static class Task implements Runnable {
        private final int id;
        Task(int id) { this.id = id; }
        public void run() { System.out.println("Task " + id + " on " + Thread.currentThread().getName()); }
    }
    public static void main(String[] args) {
        new Thread(new Task(1)).start();
        new Thread(new Task(2)).start();
    }
}
```

---

## Thread Class Methods

**Description**
Common methods: `start`, `run`, `sleep`, `join`, `interrupt`, `isAlive`, `setName`, `setPriority`, `yield`.

**Code Example**

```java
public class ThreadMethods extends Thread {
    public void run() {
        try { Thread.sleep(100); } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Done: " + getName());
    }
    public static void main(String[] args) throws Exception {
        ThreadMethods t = new ThreadMethods();
        t.setName("Worker-1");
        t.setPriority(Thread.NORM_PRIORITY + 1);
        t.start();
        System.out.println("Alive? " + t.isAlive());
        t.join();
        System.out.println("Alive after join? " + t.isAlive());
    }
}
```

---

## Synchronization

**Description**
Prevents race conditions when multiple threads access and mutate shared data. Use `synchronized` blocks or methods.

**Code Example**

```java
public class SyncCounter {
    private int count = 0;
    public synchronized void inc() { count++; }
    public int get() { return count; }

    public static void main(String[] args) throws Exception {
        SyncCounter c = new SyncCounter();
        Runnable r = () -> { for (int i = 0; i < 10000; i++) c.inc(); };
        Thread t1 = new Thread(r), t2 = new Thread(r);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Count = " + c.get()); // 20000
    }
}
```

---

## Locks

**Description**
`ReentrantLock` offers explicit locking with features like try-locking, timed waits, and condition variables.

**Code Example**

```java
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    private static final ReentrantLock lock = new ReentrantLock();
    private static int value = 0;
    public static void main(String[] args) throws Exception {
        Runnable r = () -> {
            lock.lock();
            try { value++; } finally { lock.unlock(); }
        };
        Thread t1 = new Thread(r), t2 = new Thread(r);
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("value = " + value);
    }
}
```

---

## Fairness of locks

**Description**
Fair locks grant access roughly in request order to avoid starvation. Use only if you need fairness; it can reduce throughput.

**Code Example**

```java
import java.util.concurrent.locks.ReentrantLock;

public class FairLockDemo {
    private static final ReentrantLock fairLock = new ReentrantLock(true); // fair
    public static void main(String[] args) {
        Runnable r = () -> {
            fairLock.lock();
            try { System.out.println("Acquired by " + Thread.currentThread().getName()); }
            finally { fairLock.unlock(); }
        };
        for (int i = 0; i < 5; i++) new Thread(r, "T"+i).start();
    }
}
```

---

## Read Write Lock

**Description**
`ReentrantReadWriteLock` allows many readers or one writer, improving performance for read-heavy workloads.

**Code Example**

```java
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    private static final ReentrantReadWriteLock rw = new ReentrantReadWriteLock();
    private static int data = 0;

    public static void main(String[] args) throws Exception {
        Thread writer = new Thread(() -> {
            rw.writeLock().lock();
            try { data++; System.out.println("Write data=" + data); }
            finally { rw.writeLock().unlock(); }
        });
        Runnable readerTask = () -> {
            rw.readLock().lock();
            try { System.out.println("Read data=" + data); }
            finally { rw.readLock().unlock(); }
        };
        writer.start();
        writer.join();
        new Thread(readerTask).start();
        new Thread(readerTask).start();
    }
}
```

---

## Deadlock

**Description**
Occurs when threads hold locks in conflicting order and wait forever. Avoid with consistent lock ordering, `tryLock`, or timeouts.

**Code Example (demonstrates risk; may hang)**

```java
public class DeadlockDemo {
    public static void main(String[] args) {
        final Object A = new Object(), B = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (A) {
                sleep(100);
                synchronized (B) { System.out.println("t1 done"); }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (B) {
                sleep(100);
                synchronized (A) { System.out.println("t2 done"); }
            }
        });

        t1.start(); t2.start();
    }
    static void sleep(long ms){ try { Thread.sleep(ms); } catch (InterruptedException ignored) {} }
}
```

---

## Thread Communication

**Description**
`wait`, `notify`, `notifyAll` let threads coordinate when sharing a monitor. Must be called inside synchronized sections on the same object.

**Code Example (producer/consumer, single item)**

```java
public class WaitNotifyDemo {
    static class Box {
        private Integer item = null;
        public synchronized void put(int v) throws InterruptedException {
            while (item != null) wait();
            item = v;
            notifyAll();
        }
        public synchronized int take() throws InterruptedException {
            while (item == null) wait();
            int v = item; item = null;
            notifyAll();
            return v;
        }
    }
    public static void main(String[] args) throws Exception {
        Box box = new Box();
        Thread producer = new Thread(() -> { try { box.put(42); } catch (Exception ignored) {} });
        Thread consumer = new Thread(() -> { try { System.out.println("Got " + box.take()); } catch (Exception ignored) {} });
        consumer.start(); Thread.sleep(50); producer.start();
        producer.join(); consumer.join();
    }
}
```

---

## Thread safety

**Description**
Ensures correctness under concurrency. Tools: `synchronized`, `volatile` for visibility, atomic variables for lock-free updates, concurrent collections.

**Code Example (atomic counter)**

```java
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeCounter {
    public static void main(String[] args) throws Exception {
        AtomicInteger count = new AtomicInteger(0);
        Runnable r = () -> { for (int i = 0; i < 10000; i++) count.incrementAndGet(); };
        Thread t1 = new Thread(r), t2 = new Thread(r);
        t1.start(); t2.start(); t1.join(); t2.join();
        System.out.println("count = " + count.get()); // 20000
    }
}
```

---

## Thread using Lambda expression

**Description**
Since Java 8, `Runnable` is a functional interface, so you can use lambdas to create concise thread tasks.

**Code Example**

```java
public class LambdaThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Work on " + Thread.currentThread().getName()));
        t.start();
    }
}
```

---

## Thread Pooling

**Description**
Reuses a fixed number of worker threads to execute many short tasks efficiently.

**Code Example**

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 5; i++) {
            final int id = i;
            pool.submit(() -> System.out.println("Task " + id + " on " + Thread.currentThread().getName()));
        }
        pool.shutdown();
    }
}
```

---

## Executors framework

**Description**
High-level API for task submission, scheduling, futures, and thread pools (`Executor`, `ExecutorService`, `ScheduledExecutorService`).

**Code Example (Callable + Future + Scheduled)**

```java
import java.util.concurrent.*;

public class ExecutorsDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future<Integer> f = exec.submit(() -> 2 * 21); // Callable
        System.out.println("Result: " + f.get());
        exec.shutdown();

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(() -> System.out.println("Delayed run"), 300, TimeUnit.MILLISECONDS);
        scheduler.shutdown();
    }
}
```

---

## CountDownLatch

**Description**
Allows one or more threads to wait until a set of operations performed in other threads complete.

**Code Example**

```java
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(3);
        for (int i = 1; i <= 3; i++) {
            final int id = i;
            new Thread(() -> {
                System.out.println("Worker " + id + " done");
                latch.countDown();
            }).start();
        }
        latch.await();
        System.out.println("All workers finished");
    }
}
```

---

## Cyclic Barrier

**Description**
Lets a group of threads wait for each other to reach a common barrier point; reusable after it trips.

**Code Example**

```java
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("Barrier tripped"));
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println("Arrived: " + Thread.currentThread().getName());
                try { barrier.await(); } catch (Exception ignored) {}
            }).start();
        }
    }
}
```

---

## CompletableFuture

**Description**
Asynchronous programming without manual threads. Supports composition, chaining, combining results, and non-blocking callbacks.

**Code Example**

```java
import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> f =
            CompletableFuture.supplyAsync(() -> "Hello")
                             .thenApply(s -> s + " Concurrency")
                             .thenApply(String::toUpperCase);

        f.thenAccept(System.out::println);
        Thread.sleep(300); // give async chain time to finish in this demo
    }
}
```

---

