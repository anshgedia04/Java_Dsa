# How Java Code Executes

This document explains the process of how Java code is executed, step by step.
## Diagram Representation

```plaintext
  +---------------+        +---------------+         +------------------+         +------------------+
  | .java file    |        | Compiler      |         | Bytecode (.class)|         | Machine Code     |
  | (Human Readable) |----->| (javac)       |-------> | (Platform-Independent) |----->| (Binary: 0s and 1s) |
  +---------------+        +---------------+         +------------------+         +------------------+
         |                                                             |
   This is the                                                    Interpreted by
   Source Code                                                   JVM (line-by-line)


## Execution Flow
1. **Source Code (`.java` file)**: This is the human-readable Java code written by developers.
2. **Compiler**: The Java compiler (`javac`) compiles the entire `.java` file into a `.class` file (bytecode).
3. **Bytecode (`.class` file)**: A platform-independent intermediate code that cannot run directly on the system.
4. **Interpreter (JVM)**: Reads the bytecode line-by-line and converts it into machine code.
5. **Machine Code (Binary)**: The code in `0` and `1` format, which is executed by the hardware.

### Key Notes:
- Bytecode cannot run directly on any system.
- JVM is required to interpret the bytecode into machine code.
- This is the reason Java is platform-independent

---

# Understanding JDK, JRE, and JVM

## 1. **JDK (Java Development Kit)**
The **JDK** is a software development environment used for developing Java applications. It mainly contains:
- **JRE (Java Runtime Environment):** For running Java programs.
- **Development Tools:** Includes compilers (like `javac`), debuggers, and other tools required for writing and debugging Java applications.

### Key Responsibilities:
- Compiles `.java` files into **bytecode** (`.class` files) using the Java compiler (`javac`).
- Provides tools for development, such as debuggers and profilers.
- Once the **bytecode** is generated, it hands over the `.class` file to the **JVM** for execution.

---

## 2. **JVM (Java Virtual Machine)**
The **JVM** is a virtual runtime environment responsible for executing Java bytecode. 

### Key Responsibilities:
- **Bytecode Verification:** Ensures that the `.class` file conforms to the Java bytecode format and security standards.
- **Class Loading:** Loads the `.class` files into memory for execution.
- **Execution:** Interprets and executes the bytecode line-by-line using an interpreter or compiles it into native machine code using the Just-In-Time (JIT) compiler for optimized performance.
- **Memory Management:** Handles memory allocation, garbage collection, and deallocation during program execution.

The JVM is platform-dependent, meaning each operating system has its specific JVM implementation, but the bytecode it executes is platform-independent.

---

## 3. **JRE (Java Runtime Environment)**
The **JRE** provides the libraries, Java Virtual Machine, and other components required to run Java programs. It is essentially the runtime part of the Java ecosystem.

### Key Responsibilities:
- **Class Loading:** Loads the `.class` file into memory.
- **Bytecode Validation:** Ensures the `.class` file conforms to the bytecode format.
- **Runtime Libraries:** Provides the essential Java libraries (like `java.lang`, `java.util`, etc.) needed for program execution.

---

### Summary
- **JDK:** A complete package that includes JRE + Development tools for Java application development and compilation.
- **JVM:** The heart of Java, responsible for executing the bytecode, managing memory, and ensuring platform independence.
- **JRE:** A subset of JDK used for running Java programs by providing the JVM and necessary libraries.

This structure ensures Java’s **“Write Once, Run Anywhere”** philosophy, making it one of the most versatile programming platforms in the world.
