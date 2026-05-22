# Java Static and Non-Static Method Calling

## Overview

This project demonstrates how static methods and non-static methods interact in Java. It shows how one static method can call another static method and how a static method can access a non-static method through object creation.

## Concepts Practiced

- Static methods
- Non-static methods
- Object creation
- Method calling
- Method execution flow
- Static vs Non-static behavior

## Code Flow

### Step 1
`main()` calls:

```java
method1();
```

### Step 2
`method1()` calls:

```java
method2();
```

### Step 3
Inside `method2()`, an object is created:

```java
solution1 sol = new solution1();
```

### Step 4
The object calls the non-static method:

```java
sol.nonStaticMethod2();
```

### Step 5
Control returns to `method2()` and then back to `method1()`.

### Step 6
`main()` calls:

```java
method2();
```

again and the same process repeats.

## Output

```text
non static Method1
method2
Method1
non static Method1
method2
```

## Key Learning

### Static Methods

- Belong to the class
- Can be called directly from other static methods
- Do not require object creation
- Cannot directly access non-static methods

### Non-Static Methods

- Belong to objects
- Require object creation before calling
- Can access both static and non-static members

### Important Point

A static method cannot directly call a non-static method because non-static methods belong to objects. Therefore, an object must be created first:

```java
solution1 sol = new solution1();
sol.nonStaticMethod2();
```

## Technologies Used

- Java
- JDK
- Command Prompt

## Author

Ajay Chintala
