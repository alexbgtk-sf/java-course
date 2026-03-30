/**
 * @author alexandrabogatko
 * @date 22/03/2026 8:48 pm
 */

public class Homework7Main {
        /*
        Задача 1:
        Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
        который печатает название должности и имплементировать этот метод в созданные
        классы
        */
    public static void main (String[] args) throws CloneNotSupportedException {
        Printable director = new Director();
        Printable accountant = new Accountant();
        Printable worker = new Worker();
        Printable [] jobTitles = {director, accountant, worker};
        for (Printable printable: jobTitles) {
            printable.print();
        }
        /*Задача 2:
        Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
        периметра всех фигур в массиве.
         */
        Circle circle = new Circle(6.3);
        Circle copyCircle = (Circle) circle.clone();//создаем еще один Круг путем клонирования
        Rectangle rectangle = new Rectangle(1.13,2.42);
        Square square = new Square(9);
        Triangle triangle = new Triangle(5,7,9.4);
        Figure [] figures = {circle, rectangle, square,triangle, copyCircle}; //добавлен copy в массив
        double sumPerimetr = 0; //копилка
        for (Figure figure: figures) {
            sumPerimetr += figure.calculatePerimeter(); //добавление к копилке
            figure.calculateArea();
        System.out.printf("Площадь фигуры %s: %.2f", figure.getFigureName(), figure.calculateArea()); //обрезаю до двух знаков после зпт
        System.out.println("   ");
        }
        System.out.printf("Сумма всех периметров: %.2f", sumPerimetr);
    }
    /*
    Задача 3: ... пример работы интерфейса-маркера Cloneable
    (интерефейс имплементирован в абстрактный класс Figure и склонирован класс Circle)
     */
}