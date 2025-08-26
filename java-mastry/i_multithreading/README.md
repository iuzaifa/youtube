

explain ->  Start , run ,
explain ->  sleep , join,
explain ->  thread States(NEW , RUNNABLE, RUNNING, BLOCKED, WAITING, TIMED_WAITING, TERMINATED)
explain ->  priority (low , mid, height),  
explain -> setName,
explain ->  interrupt,
explain ->  yield
explain -> Daemon Threads
explain -> Synchronization
explain -> Lock ( new ReentrantLock()), TryLock(300, TimeUnit.MILLISECONDS); AND  lock.unlock();
explain -> LockIntruptibly()
explain -> 1. Fair Locks 2. Unfair Locks
explain -> read and Write Locks 
explain -> Deadlock (-- )
explain -> Thread Communication Done in Java? ( Inter-thread Communication) ( -- )
explain -> Thread Safety in Java 
explain -> ThreadPool










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



