

### **Q1. What is Java and why is it not considered a pure object-oriented programming language?**

* **Java** is a high-level, object-oriented, platform-independent programming language.
* It supports **OOPs concepts** like encapsulation, inheritance, abstraction, and polymorphism.
* **Not pure OOP** because Java uses **primitive data types** (`int`, `char`, `boolean`, etc.) which are not objects.
* Example:

  ```java
  int a = 10;  // primitive, not an object
  Integer b = 20; // wrapper class makes it an object
  ```

---

### **Q2. Key components to run a Java Program**

* **JDK (Java Development Kit):** Contains tools (compiler, debugger) + JRE. Used by developers.
* **JRE (Java Runtime Environment):** Contains JVM + libraries to run applications.
* **JVM (Java Virtual Machine):** Executes the bytecode and makes Java platform-independent.

👉 Flow: `.java` → **javac** compiler → `.class` (bytecode) → JVM executes.

---

### **Q3. Main Features of Java**

* Simple
* Object-Oriented
* Platform Independent ("Write Once, Run Anywhere")
* Secure
* Robust (strong memory management, exception handling)
* Multithreaded (supports concurrency)
* High Performance (JIT compiler)

---

### **Q4. Java String Pool**

* **String Pool** is a special memory area inside the heap where string literals are stored.
* If a string already exists in the pool, Java will reuse it instead of creating a new object → saves memory.

```java
String s1 = "Hello";
String s2 = "Hello"; // reuses existing object from pool
System.out.println(s1 == s2); // true (same reference)
```

---

### **Q5. Wrapper Class**
* Primitive date type `int → Integer`, `double → Double`. 
* Wrapper classes provide aditional feature that primitive don't have it convert primitive types into objects
* Example: `int → Integer`, `double → Double`.
* Useful in collections (`ArrayList`, `HashMap`) which only store objects.

```java
int a = 5;
Integer obj = a; // Autoboxing
int b = obj;     // Unboxing
```

---

### **Q6. Scenario-based question on Collections in Java**

👉 Example: You need to store student roll numbers **without duplicates**. Which collection will you use?

* Use a **Set** (`HashSet`) → because it doesn’t allow duplicates.

👉 Example: You need to maintain **insertion order + allow duplicates**?

* Use a **List** (`ArrayList`, `LinkedList`).

---

### **Q7. Use of `this` and `super` keyword**

* **this** → Refers to the current object.

  ```java
  class Student {
      String name;
      Student(String name) {
          this.name = name; // differentiate variable and parameter
      }
  }
  ```
* **super** → Refers to parent class members (variables, methods, constructors).

  ```java
  class Parent {
      void display() { System.out.println("Parent"); }
  }
  class Child extends Parent {
      void display() {
          super.display(); // calls Parent method
          System.out.println("Child");
      }
  }
  ```

---

### **Q8. Difference between static and instance method**

* **Static Method:** Belongs to class, can be called without creating an object.
* **Instance Method:** Belongs to object, needs object creation to call.

```java
class Test {
    static void staticMethod() { System.out.println("Static"); }
    void instanceMethod() { System.out.println("Instance"); }
}
Test.staticMethod();   // no object needed
new Test().instanceMethod(); // object needed
```

---

### **Q9. Constructors and their types**

* **Constructor** is used to initialize objects. Same name as class, no return type.
* **Types:**

  1. Default Constructor (created by compiler if none is defined).
  2. No-arg Constructor.
  3. Parameterized Constructor.

```java
class Student {
    Student() { System.out.println("Default constructor"); }
    Student(String name) { System.out.println("Name: " + name); }
}
```

---

### **Q10. StringBuffer vs StringBuilder**

* Both are mutable (can change values after creation).
* **StringBuffer** → Thread-safe (synchronized), slower.
* **StringBuilder** → Not synchronized, faster (better in single-threaded).

```java
StringBuffer sb1 = new StringBuffer("Hello");
sb1.append(" World"); // safe in multithreading

StringBuilder sb2 = new StringBuilder("Hello");
sb2.append(" World"); // faster in single-threading
```

--- 

### 2. **Explain each intermediate-level Java question clearly with examples** 

---

### **Q11. Abstract Classes vs Interfaces**

* **Abstract Class**

  * Can have **abstract methods** (no body) and **non-abstract methods** (with body).
  * Supports **constructors**.
  * Can have **instance variables**.
  * A class can extend only **one** abstract class.

  ```java
  abstract class Animal {
      abstract void sound();
      void sleep() { System.out.println("Sleeping"); }
  }
  class Dog extends Animal {
      void sound() { System.out.println("Bark"); }
  }
  ```

* **Interface**

  * By default, all methods are **abstract (till Java 7)**, but from Java 8 → **default & static methods** allowed.
  * Can’t have constructors or instance variables (only constants).
  * A class can **implement multiple interfaces**.

  ```java
  interface Animal {
      void sound();
  }
  class Cat implements Animal {
      public void sound() { System.out.println("Meow"); }
  }
  ```

👉 **When to use?**

* Use **abstract class** when classes share common behavior.
* Use **interface** when you want multiple unrelated classes to follow a contract.

---

### **Q12. Method Overloading & Can we overload `main()`?**

* **Method Overloading**

  * Same method name but **different parameter list** (number or type).
  * Resolved at **compile-time** (compile-time polymorphism).

  ```java
  class Calculator {
      int add(int a, int b) { return a+b; }
      double add(double a, double b) { return a+b; }
  }
  ```

* **Overloading `main()`**

  * Yes, we can overload `main()` method.
  * But **JVM always calls** only the `public static void main(String[] args)` method.

  ```java
  public class Test {
      public static void main(String[] args) {
          System.out.println("Main with String[]");
          main(10); // calling overloaded version
      }
      public static void main(int x) {
          System.out.println("Main with int: " + x);
      }
  }
  ```

---

### **Q13. Method Overriding**

* Subclass provides a **specific implementation** of a method already defined in parent class.
* Rules:

  * Method name & parameters must be same.
  * Access modifier should not be more restrictive.
  * Can’t override `final` or `static` methods.
* Resolved at **runtime** (runtime polymorphism).

  ```java
  class Parent {
      void show() { System.out.println("Parent"); }
  }
  class Child extends Parent {
      @Override
      void show() { System.out.println("Child"); }
  }
  ```

---

### **Q14. Exception Handling in Java**

* **Exception** → unwanted event that disrupts normal flow.

* **Checked Exception:** Must be handled (e.g., IOException).

* **Unchecked Exception:** Runtime errors (e.g., NullPointerException).

* Keywords:

  * `try` → risky code
  * `catch` → handle exception
  * `finally` → always executes
  * `throw` → to throw exception
  * `throws` → declare exception

```java
try {
    int x = 10/0; // risky
} catch (ArithmeticException e) {
    System.out.println("Can't divide by zero");
} finally {
    System.out.println("Always runs");
}
```

---

### **Q15. Lifecycle of a Thread**

1. **New** → Created but not started (`Thread t = new Thread()`).
2. **Runnable** → After calling `start()`, ready to run.
3. **Running** → Actually executing `run()`.
4. **Waiting/Timed Waiting** → Waiting for another thread/signal.
5. **Terminated** → Finished execution.

```java
class MyThread extends Thread {
    public void run() { System.out.println("Thread running"); }
}
MyThread t = new MyThread();
t.start(); // thread goes from New → Runnable → Running
```

---

### **Q16. Singleton Class**

* A class with **only one instance** in the whole JVM.
* Commonly used for logging, DB connections, config settings.

```java
class Singleton {
    private static Singleton instance;
    private Singleton() {} // private constructor
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

### **Q17. Aggregation vs Composition**

* **Aggregation (Has-A relationship)**

  * Weak relationship.
  * Child object can exist without parent.

  ```java
  class Address { String city; }
  class Employee {
      Address address; // employee has an address
  }
  ```

* **Composition (Strong Has-A relationship)**

  * Strong relationship.
  * Child object **cannot** exist without parent.

  ```java
  class Engine {}
  class Car {
      private Engine engine = new Engine(); // Car cannot exist without engine
  }
  ```

---

### **Q18. Anonymous Inner Class**

* Class without a name, used for **quick implementation**.
* Commonly used in **event handling** or creating short objects.

```java
abstract class Animal {
    abstract void sound();
}
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            void sound() { System.out.println("Meow"); }
        };
        a.sound();
    }
}
```

---

### **Q19. Implicit vs Explicit Type Conversion**

* **Implicit (Type Casting / Widening)**

  * Done automatically by compiler.
  * Smaller → Larger data type.

  ```java
  int x = 10;
  double y = x; // implicit conversion
  ```

* **Explicit (Type Casting / Narrowing)**

  * Done manually by programmer.
  * Larger → Smaller data type (possible data loss).

  ```java
  double d = 9.8;
  int i = (int) d; // explicit conversion
  ```

---

### **Q20. Purpose of `volatile` Keyword**

* Ensures **visibility of variable changes across threads**.
* Without `volatile`, one thread may not see updated value of variable by another thread.
* Used in **multithreading** to prevent thread caching.

```java
class Shared {
    volatile boolean flag = true;
}
```


