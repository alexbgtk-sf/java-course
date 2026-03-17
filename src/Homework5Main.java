/**
 * @author alexandrabogatko
 * @date 16/03/2026 12:42 pm
 */

public class Homework5Main {
    public static void main(String[] args) {
        /*
        Задача 1:
        1.1 Создать двумерный массив, заполнить его случайными числами.
         */
//        int rows = 5;
//        int cols = 4;
//        int [] [] twoMassives = new int [rows] [cols];
//        for (int i = 0; i<rows; i++) {
//            for (int k = 0; k<cols; k++) {
//                twoMassives [i] [k] = (int) (Math.random()*100);
//            }
//        }
//        System.out.println(Arrays.deepToString(twoMassives));
//        // 1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Число, которое нужно добавить к каждому элементу: ");
//        int number = sc.nextInt();
//        for (int i = 0; i < rows; i++) {
//            for (int k = 0; k < cols; k++) {
//                twoMassives[i][k] += number; // увеличиваем каждый элемент
//            }
//        }
//        System.out.println("Массив после добавления числа " + number + ":");
//        System.out.println(Arrays.deepToString(twoMassives));
//        //1.3 Найти сумму всех получившихся элементов и вывести в консоль.
//        int sum = 0;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                sum += twoMassives[i][j];
//            }
//        }
//        System.out.println("Сумма всех элементов: " + sum);
//    }
    /*
    Задача 2:
    Создать программу для раскраски шахматной доски с помощью цикла. Создать
    двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    B(Black) или W(White). При выводе результат работы программы должен быть
     */
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int k = 0; k < chessBoard[0].length; k++) {
                if ((i + k) % 2 == 0) chessBoard[i][k] = "W";
                else chessBoard[i][k] = "B";
            }
        }
        for (int i = 0; i < 8; i++) {  //по строкам
            for (int j = 0; j < 8; j++) {//по столбцам
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}