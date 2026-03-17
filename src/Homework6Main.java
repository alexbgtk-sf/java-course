/**
 * @author alexandrabogatko
 * @date 17/03/2026 3:52 pm
 */

public class Homework6Main {
    /*
    Задача 1:
    Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    Добавьте метод, который выводит текущую информацию о карточке.
    Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
    Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
    Выведите на экран текущее состояние всех трех карточек.
     */
    public static void main(String[] args) {
        CreditCard alexandra = new CreditCard("7462 8343 8743 3874", 4562.13, "Alexandra");
        CreditCard irina = new CreditCard("4835 9434 2451 9584", 74372.8, "Irina");
        CreditCard zhenya = new CreditCard("5437 3278 4342 7533", 3244.2, "Zhenya");
        double addCashAlexandra = alexandra.addAmount(); //начисление суммы на кредитную карточку
        double addCashIrina = irina.addAmount(); //начисление суммы на кредитную карточку
        System.out.println("Alexandra's added amount: " + addCashAlexandra); //вывод начисленной суммы Александре
        System.out.println("Irina's added amount: " + addCashIrina); //вывод начисленной суммы Ирине
        //alexandra.printCurrentAmount(); //вывод суммы после начисления Александре
        //irina.printCurrentAmount(); //вывод суммы после начисления Ирине
        double cash = zhenya.cashOut(); //списание суммы у Жени
        System.out.println("Zhenya's written-off amount: " + cash); //вывод списанной суммы
        //zhenya.printCurrentAmount(); //вывод суммы после списания
        alexandra.printCardInfo();
        irina.printCardInfo();
        zhenya.printCardInfo();
    }
}
//со * попробую решить и докину отдельно