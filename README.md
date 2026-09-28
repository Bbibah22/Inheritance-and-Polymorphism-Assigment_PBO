# OOP Exercise 1-3

## Informasi Kode

Hubungan antar-class dalam program:

```text
Shape
├── Square
├── Circle
    └── Cylinder
```

Program ini menerapkan tiga konsep utama OOP, yakni Encapsulation, Inheritance, dan Polymorphism.

### 1. Encapsulation

Encapsulation diterapkan dengan membatasi akses langsung terhadap atribut dan menggunakan method untuk mengakses atau mengubah nilai atribut tersebut.

Contohnya pada class `Shape`:

```java
protected String color;

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}
```

Atribut `color` dibuat `protected` (atau `private`), sehingga tidak dapat diakses secara bebas dari luar hierarki class. Untuk mengakses atau mengubah nilainya digunakan method `getColor()` dan `setColor()`.

Konsep yang sama juga diterapkan pada atribut `side` pada class `Square`, `radius` pada class `Circle`, dan `height` pada class `Cylinder`.

### 2. Inheritance

Inheritance atau pewarisan diterapkan menggunakan keyword `extends`.

Class `Square` merupakan turunan dari class `Shape`:

```java
public class Square extends Shape
```

Class `Circle` juga merupakan turunan dari class `Shape`:

```java
public class Circle extends Shape
```

Class `Cylinder` merupakan turunan dari class `Circle`:

```java
public class Cylinder extends Circle
```

Dengan inheritance, class turunan dapat menggunakan atribut dan method yang diwariskan dari class induknya.

Contohnya pada constructor `Cylinder`:

```java
public Cylinder(double height, double radius, String color) {
    super(radius, color);
    this.height = height;
}
```

`super()` digunakan untuk memanggil constructor dari class induk, yaitu `Circle`.

### 3. Polymorphism

Polymorphism diterapkan melalui method `printInfo()` yang terdapat pada beberapa class.

Pada class `Shape`:

```java
public void printInfo() {
    // Default implementation
}
```

Method `printInfo()` dibuat kembali (override) pada class turunannya dengan isi yang berbeda.

Contohnya pada class `Square`:

```java
@Override
public void printInfo() {
    System.out.println("Square colored " + color + ", area = " + area());
}
```

Class `Circle` dan `Cylinder` juga memiliki method `printInfo()` dengan output yang disesuaikan dengan masing-masing bentuk.

## Screenshot

### Hasil Program

```text
=== Shape Menu ===
1. Add Square
2. Add Circle
3. Add Cylinder
4. Print All Shapes Info
0. Exit
Choose option: 4

--- Shapes Info ---
Square colored Merah, area = 36.0
Circle colored Biru, area = 201.06192982974676
Cylinder colored Hijau, volume = 2010.6192982974676
```
