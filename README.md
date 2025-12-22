# Java Foundation & Data Structures - Learning Notes

________________MY LEARNINGS IN THE JOURNEY OF CRACKING THE DSA COURSE_________________

---

## 📑 Table of Contents
1. [Programming Foundations & Memory Management](#1-programming-foundations--memory-management)
2. [Program Flow: Flowcharts & Pseudocode](#2-program-flow-flowcharts--pseudocode)
3. [Java Architecture & Execution](#3-java-architecture--execution)
4. [Data Types & Input/Output](#4-data-types--inputoutput)
5. [Arrays & ArrayLists](#5-arrays--arraylists)
6. [Conditionals: Switch Statements](#6-conditionals-switch-statements)
7. [Functions / Methods](#7-functions--methods)

---

## 1. Programming Foundations & Memory Management
Understanding how high-level code interacts with hardware.

* **Language Types:**
    * **Procedural:** Step-by-step logic (e.g., C, Java).
    * **Functional:** Focuses on pure functions; doesn't modify original data.
    * **Object-Oriented (OOP):** Uses "Classes" (templates) and "Objects" (instances) to bundle data and behavior.
* **Static vs. Dynamic Typing:**
    * **Static (Java):** Types are checked at compile-time. Better performance and fewer runtime errors.
    * **Dynamic (Python):** Types are checked during execution.
* **Memory Model:**
    * **Stack:** Stores reference variables (names) and method calls.
    * **Heap:** Stores the actual objects and array values.
    * **Garbage Collection:** Automatic process in Java that clears heap memory for objects with no active references.

---

## 2. Program Flow: Flowcharts & Pseudocode
Visualizing logic before implementation.

* **Standard Symbols:**
    * `Oval`: Start/End.
    * `Parallelogram`: Input/Output.
    * `Rectangle`: Process/Calculation.
    * `Diamond`: Decision/Condition.
* **Optimization Example:** In a Prime Number check, instead of checking from $2$ to $n-1$, checking up to $\sqrt{n}$ significantly reduces time complexity.

---

## 3. Java Architecture & Execution
The "Write Once, Run Anywhere" (WORA) philosophy.

| Component | Description |
| :--- | :--- |
| **JDK** | Java Development Kit (Tools to write + JRE). |
| **JRE** | Java Runtime Environment (Libraries + JVM). |
| **JVM** | Java Virtual Machine (Executes the Bytecode). |
| **JIT** | Just-In-Time Compiler; optimizes performance by compiling hot code segments into machine code. |

**Execution Flow:** `.java` (Source) $\rightarrow$ `javac` (Compiler) $\rightarrow$ `.class` (**Bytecode**) $\rightarrow$ `JVM` $\rightarrow$ Machine Code.

---

## 4. Data Types & Input/Output
The building blocks of Java programs.

* **Primitives:** (`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.)
  
* **Type Casting:**
    * **Widening (Implicit):** `int` $\rightarrow$ `float` (Automatic).
    * **Narrowing (Explicit):** `(int)5.67` $\rightarrow$ `5` (Manual; loses decimal data).
* **Input:** Handled by the `Scanner` class (`import java.util.Scanner`).
    * Example: `Scanner in = new Scanner(System.in); int a = in.nextInt();`

---

## 5. Arrays & ArrayLists
Managing collections of data.

### Arrays (Fixed Size)
* Stored in contiguous memory (theoretically).
* Index starts at `0`. Last index is `length - 1`.
* **2D Arrays:** Treated as an "array of arrays." Java supports **Jagged Arrays** where each row has a different number of columns.

### ArrayList (Dynamic Size)
* Part of the Collections Framework.
* **Internal Working:** When the array reaches capacity, Java creates a new array (usually 2x size) and copies elements over.
* **Methods:** `.add()`, `.get(index)`, `.set(index, value)`, `.remove(index)`.

---

## 6. Conditionals: Switch Statements
Streamlining multi-way branching.

* **String Comparison:** Always use `.equals()` instead of `==` for checking content.
* **Old Switch:** Requires `break` to prevent "fall-through."
* **Enhanced Switch (Java 12+):**
    ```java
    switch (fruit) {
        case "Mango" -> System.out.println("King of fruits");
        case "Apple" -> System.out.println("Red fruit");
        default -> System.out.println("Enter valid fruit");
    }
    ```

---

## 7. Functions / Methods
Encapsulating logic for reusability.

* **Pass-by-Value:**
    * **Primitives:** A copy of the value is passed. Original remains unchanged.
    * **Objects/Arrays:** A copy of the **reference** is passed. Changing the object's content inside the method **will** affect the original object.
* **Method Overloading:** Multiple methods with the same name but different parameters (e.g., different count or different types).
* **Shadowing:** A local variable with the same name as a class-level variable "shadows" or hides the class variable within that scope.
* **Varargs:** Use `int... v` to accept an arbitrary number of arguments.
  
---
