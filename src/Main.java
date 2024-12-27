import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Задача 1 Класс "Человек"
// Создайте класс Person с полями name, age, gender.
// Реализуйте методы для вывода информации о человеке и увеличения его возраста.
// Добавьте метод для изменения имени.

class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void PersonInfo(){
        System.out.println("Имя - " + name + "\nвозраст - " + age + "\nПол - " + gender);
    }
    public void AddAge(int age){
        this.age += age;
    }
    public void ChangeName(String name) {
        this.name = name;
    }
}

// Задача 2 Наследование: Класс "Работник" и "Менеджер"
// Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary.
// Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.

class Worker extends Person {
    int salary;
    public Worker(String name, int age, char gender, int salary) {
        super(name,age,gender);
        this.salary = salary;
    }
}

class Manager extends Worker {
    Worker[] slaves;
    public Manager(String name, int age, char gender, int salary, Worker[] slaves) {
        super(name,age,gender,salary);
        this.slaves = slaves;
    }
}

// Задача 3 Полиморфизм: Животные
// Создайте интерфейс Animal с методом makeSound().
// Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс.
// Продемонстрируйте полиморфизм на примере массива животных.

interface Animal {
    void makeSound();
}
class Dog implements Animal{
    public void makeSound() {
        System.out.println("Гав, гав");
    }
}

class Cat implements Animal{
    public void makeSound() {
        System.out.println("Мяу, мяу");
    }
}

class Cow implements Animal{
    public void makeSound() {
        System.out.println("Му, му");;
    }
}

// Задача 4 Абстрактный класс "Транспорт"
// Создайте абстрактный класс Transport с абстрактным методом move().
// Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().

abstract class Transport {
    abstract void move();
}

class Car extends Transport {
    public void move() {
        System.out.println("Едет машина");
    }
}

class Bike extends Transport {
    public void move() {
        System.out.println("Едет мотоцикл");
    }
}

// Задача 5 Класс "Книга" и "Библиотека"
// Создайте класс Book с полями title, author, и year.
// Создайте класс Library, который содержит коллекцию книг и методы для добавления книг,
// поиска по автору и году публикации.

class Book {
    String title;
    String author;
    int year;
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    public void addBook(String title, String author, int year) {
        Book book = new Book(title,author,year);
        books.add(book);
    }
    public void bookSelect(String author,int year) {
        for (Book book : books) {
            if (book.year == year && book.author == author) {
                System.out.println(book.title);
            }
        }
    }
}

// Задача 6 Инкапсуляция: Банк
// Создайте класс BankAccount с полями accountNumber, balance,
// и методами для пополнения и снятия средств.
// Обеспечьте инкапсуляцию для безопасности данных счета.

class BankAccount {
    private final int accountNumber;
    private int balance;
    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void addBalance(int balance)
    {
        this.balance += balance;
    }
    public void getBalance(int balance)
    {
        this.balance -= balance;
    }
    public void vjb() {
        System.out.println(this.balance + " " + this.accountNumber);
    }
}

// Задача 7 Счетчик объектов
// Создайте класс Counter, который хранит количество созданных объектов данного класса.
// Реализуйте статическое поле для учета количества объектов и метод для его увеличения
// при каждом создании объекта.

class Counter {
    static int count;
    public Counter() {
        addObject();
    }
    private static void addObject() {
        count += 1;
    }
}

// Задача 8 Площадь фигур
// Создайте абстрактный класс Shape с абстрактным методом getArea().
// Реализуйте классы Circle и Rectangle,
// которые наследуют от Shape и вычисляют площадь круга и прямоугольника соответственно.

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}

class Rectangle extends Shape {
    double height;
    double weight;
    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    double getArea() {
        return weight*height;
    }
}

// Задача 9 Наследование: Животные и их движения
// Создайте класс Animal с методом move().
// Реализуйте классы Fish, Bird и Dog, которые наследуют Animal и переопределяют метод move()
// (рыба плавает, птица летает, собака бегает).

class Animal1{
    public void move() {
        System.out.println("Я иду");
    }
}

class Fish extends Animal1 {
    @Override
    public void move() {
        System.out.println("Рыба плавает");
    }
}

class Bird extends Animal1 {
    @Override
    public void move() {
        System.out.println("Птица летает");
    }
}

class Dog1 extends Animal1 {
    @Override
    public void move() {
        System.out.println("Собака бегает");
    }
}

// Задача 10 Работа с коллекциями: Университет
// Создайте класс Student с полями name, group, grade. Создайте класс University,
// который содержит список студентов и методы для добавления студентов,
// сортировки по имени и фильтрации по успеваемости.

class Student {
    String name;
    int group;
    double grade;
    public Student(String name,int group,double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }
}

class University {
    ArrayList<Student> students = new ArrayList<Student>();
    public void addStudent(String name,int group,double grad) {
        students.add(new Student(name, group, grad));
    }

    public void sortByName() {
        Collections.sort(students, Comparator.comparing(student -> student.name));
        for (Student student : students) {
            System.out.println(student.name);
        }
    }

    public void filterByGrade(double minGrade) {
        for (Student student : students) {
            if (student.grade >= minGrade) {
                System.out.println(student.name);;
            }
        }
    }

}

// Задача 11 Класс "Магазин"
// Реализуйте класс Product с полями name, price, и quantity.
// Создайте класс Store, который содержит список продуктов и методы для добавления,
// удаления и поиска товаров по имени.

class Product {
    String name;
    int price;
    int quantity;
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

class Store {
    ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(String name, int price, int quantity){
        products.add(new Product(name, price, quantity));
    }

    public void deleteProduct(String name) {
        products.removeIf(product -> product.name.equals(name));
    }
}

// Задача 12 Интерфейс "Платежная система"
// Создайте интерфейс PaymentSystem с методами pay() и refund().
// Реализуйте классы CreditCard и PayPal, которые реализуют этот интерфейс.

interface PaymentSystem {
    public void pay(int money);
    public void refund(int money);
}

class CreditCard implements PaymentSystem {
    int money;
    public void pay(int money) {
        this.money -= money;
    }

    public void refund(int money) {
        this.money += money;
    }
}

class PayPal implements PaymentSystem{
    int money;
    public void pay(int money) {
        this.money -= money;
    }
    public void refund(int money) {
        this.money += money;
    }
}

// Задача 13 Генерация уникальных идентификаторов
// Создайте класс UniqueID, который генерирует уникальные идентификаторы для объектов каждого созданного класса.
// Реализуйте этот функционал через статическое поле и метод.

class UniqueID {
    int id;
    static ArrayList<Integer> ids = new ArrayList<Integer>();
    public UniqueID() {
        this.id = CreateID();
        ids.add(id);
    }
    private static int CreateID() {
        if (ids.isEmpty()) {
            return 1;
        }
        else {
            return ids.get(ids.size() + 1);
        }
    }
}

// Задача 14 Класс "Точка" и "Прямоугольник"
// Создайте класс Point с координатами x и y. Реализуйте класс Rectangle,
// который содержит две точки (левая верхняя и правая нижняя).
// Реализуйте метод для вычисления площади прямоугольника.

class  Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Rectangle1 {
    public int square(Point one, Point two) {
        return (one.x - two.x) * (one.y - one.x);
    }
}

// Задача 15 Комплексные числа
// Создайте класс ComplexNumber с полями для действительной и мнимой частей.
// Реализуйте методы для сложения, вычитания, умножения и деления комплексных чисел.

class ComplexNumber {
    private final double real;  // Действительная часть
    private final double imaginary;  // Мнимая часть

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary);
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary);
        return new ComplexNumber(newReal, newImaginary);
    }
}

// Задача 16 Перегрузка операторов: Матрица
// Создайте класс Matrix, представляющий двумерную матрицу.
// Реализуйте методы для сложения и умножения матриц.
// Продемонстрируйте перегрузку методов.

class Matrix {
    int[][] matrix;
    int column;
    int row;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    public Matrix(int[][] matrix) {
        this.row = matrix.length;
        this.column = matrix[0].length;
        this.matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++)
            {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    public Matrix add(Matrix other) {
        if (this.row != other.row || this.column != other.column) {
            return null;
        }
        Matrix result = new Matrix(this.row, this.column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (this.column != other.row) {
            return null;
        }

        Matrix result = new Matrix(this.row, other.column);

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < other.column; j++) {
                int sum = 0;
                for (int k = 0; k < this.column; k++) {
                    sum += this.matrix[i][k] * other.matrix[k][j];
                }
                result.matrix[i][j] = sum;
            }
        }

        return result;
    }
}

// Задача 17 Создание игры с использованием ООП
// Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon,
// с полями и методами, описывающими их поведение.

class Player {
    int healt;
    int damage;
    Weapon weapon;
    public Player(int healt, int damage, Weapon weapon) {
        this.healt = healt;
        this.damage = damage;
        this.weapon = weapon;
    }
    public void Fight(Enemy enemy) {
        int alldmg = this.damage + this.weapon.damage;
        enemy.healt -= alldmg;
        if (enemy.healt <= 0)
        {
            System.out.println("Победа игрока");
        }
        else {
            System.out.println("Игрок нанес " + alldmg + " урона у противника осталось " + enemy.healt + " здоровья");
            enemy.Fight(this);
        }
    }
}

class Enemy {
    int healt;
    int damage;
    Weapon weapon;
    public Enemy(int healt, int damage, Weapon weapon) {
        this.healt = healt;
        this.damage = damage;
        this.weapon = weapon;
    }
    public void Fight(Player enemy) {
        int alldmg = this.damage + this.weapon.damage;
        enemy.healt -= alldmg;
        if (enemy.healt <= 0)
        {
            System.out.println("Победа противника");
        }
        else {
            System.out.println("Противник нанес " + alldmg + " урона у игрока осталось " + enemy.healt + " здоровья");
            enemy.Fight(this);
        }
    }
}

class Weapon {
    String name;
    int damage;
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}

// Задача 18 Автоматизированная система заказов
// Создайте классы Order, Customer, и Product.
// Реализуйте систему, где можно добавлять заказы, отображать общую стоимость
// заказа и просматривать историю заказов.

class Product1 {
    String name;
    int cost;
    public Product1(String name, int cost) {
        this.cost = cost;
        this.name = name;
    }
}
class Order {
    int orderNum;
    int sumCost;
    ArrayList<Product1> products = new ArrayList<Product1>();
    public Order(int orderNum, int sumCost, ArrayList<Product1> products) {
        this.orderNum = orderNum;
        this.products = products;
        for (Product1 product : products)
        {
            this.sumCost += product.cost;
        }
    }
    public void getCost(){
        System.out.println(this.sumCost);
    }
}

class Customers {
    String name;
    ArrayList<Order> orders = new ArrayList<Order>();
    public void CreateOrder(int orderNum, ArrayList<Product1> products){
        int sumCost = 0;
        for (Product1 product : products)
        {
            sumCost += product.cost;
        }
        Order newOrder = new Order(orderNum,sumCost,products);
        orders.add(newOrder);
    }
    public void history(){
        for (Order order : orders){
            System.out.println(order.orderNum);
        }
    }
}

// Задача 19 Наследование: Электроника
// Создайте класс Device с полем brand и методами turnOn() и turnOff().
// Реализуйте классы Smartphone и Laptop, которые наследуют от Device и добавляют уникальные методы,
// например, takePhoto() для смартфона.

class Device {
    String brand;
    public void turnOn() {
        System.out.println("Включить");
    }
    public void turnOff() {
        System.out.println("Выключить");
    }
}

class Smartphone extends Device {
    public void takePhoto() {
        System.out.println("Фото");
    }
}

class Laptop extends Device {
    public void Disk() {
        System.out.println("Диск");
    }
}

// Задача 20 Игра "Крестики-нолики"
// Разработайте классы для игры "Крестики-нолики".
// Создайте класс Game, который управляет логикой игры, и классы Player,
// описывающие поведение игроков.

class Player1 {
    private final String name;
    private final char symbol; // Символ игрока (X или O)

    public Player1(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int[] makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + " (" + symbol + "), введите координаты вашего хода (строка и столбец): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[]{row, col};
    }
}

class Game {
    private final char[][] board;
    private final Player1 player1;
    private final Player1 player2;
    private Player1 currentPlayer;

    public Game(Player1 player1, Player1 player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("Текущая доска:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    public boolean makeMove(int row, int col) {
        if (isValidMove(row, col)) {
            board[row][col] = currentPlayer.getSymbol();
            return true;
        } else {
            System.out.println("Неверный ход! Попробуйте снова.");
            return false;
        }
    }

    public boolean checkWin() {
        char symbol = currentPlayer.getSymbol();

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public void start() {
        while (true) {
            printBoard();
            int[] move;
            boolean validMove;
            do {
                move = currentPlayer.makeMove();
                validMove = makeMove(move[0], move[1]);
            } while (!validMove);

            if (checkWin()) {
                printBoard();
                System.out.println("Поздравляем, " + currentPlayer.getName() + " (" + currentPlayer.getSymbol() + ") с победой!");
                break;
            }

            if (checkDraw()) {
                printBoard();
                System.out.println("Ничья!");
                break;
            }

            switchPlayer();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        /*Weapon axe = new Weapon("Nature'sProphet",6);
        Weapon bow = new Weapon("bow",2);
        Weapon knife = new Weapon("knife",4);
        Player player = new Player(100,4,Nature'sProphet);
        Enemy enemy = new Enemy(100,10,bow);
        player.Fight(enemy);*/
    }
}