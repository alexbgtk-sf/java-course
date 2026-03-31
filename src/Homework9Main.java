import java.util.Scanner;

/**
 * @author alexandrabogatko
 * @date 31/03/2026 3:31 pm
 */

public class Homework9Main {

/*
Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
или другую строку то он будет недоволен.
 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Animal[] zoo = {new Dog(), new Tiger(), new Rabbit()};
    for (Animal a : zoo) {
        a.voice();
        }
    System.out.println("What do you want to feed the animal?");
    String userFood = sc.nextLine();
    for (Animal b : zoo) {
        b.eat(userFood);
        }
    }
}