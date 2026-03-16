import java.util.Arrays;

/**
 * @author alexandrabogatko
 * @date 10/03/2026 9:17 pm
 */

public class Homework3Main {
    public static void main(String[] args) {

        /*Задача 1:
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        */

//        int[] array = {1, 3, 9, 7, 92, 22, 12};
//        Arrays.sort(array);
//        for (int j : array) {
//            System.out.print(j + " ");
//            //вывели весь массив в прямом порядке
//        }
//        Integer[] array1 = {1, 3, 9, 7, 92, 22, 12};
//        Arrays.sort(array1, Collections.reverseOrder());
//        for (int k : array1) {
//            System.out.print(k + " ");
//            //вывели весь массив в обратном порядке
//        }

        /*Задача 2:
        Найти минимальный-максимальный элементы и вывести в консоль
         */
//        int[] maxVal = {567, 7346, 8536, 32, 5, 843, 23};
//        int max = maxVal[0];
//        for (int i = 1; i < maxval.length; i++) {
//            if (maxVal[i] > max) {
//                max = maxVal[i];
//            }
//        }
//        System.out.println("Максимальное значение в массиве: " + max);
//
//        int[] minVal = {567, 7346, 8536, 32, 5, 843, 23};
//        int min = minVal[0];
//        for (int i = 1; i < minval.length; i++) {
//            if (minVal[i] < min) {
//                min = minVal[i];
//            }
//        }
//        System.out.println("Минимальное значение в массиве: " + min);
//    }

        //2-ой укороченный вариант
//        int[] minMaxArr = {567, 7346, 8536, 32, 5, 843, 23};
//        int max = minMaxArr[0];
//        int min = minMaxArr[0];
//        for (int p : minMaxArr) {
//            if (p > max) {
//                max = p;
//            }
//            if (p < min) {
//                min = p;
//            }
//        }
//        System.out.println("Максимальное значение в массиве: " + max);
//        System.out.println("Минимальное значение в массиве: " + min);
        /*Задача 3:
        Найти индексы минимального и максимального элементов и вывести в консоль
        */
//        int indexMax = 0;
//        int indexMin = 0;
//        for (int t = 0; t < minmaxarr.length; t++) {
//            if (minMaxArr[t] == max) {
//                indexMax = t;
//            }
//            if (minMaxArr [t] == min) {
//                indexMin = t;
//            }
//        }
//        System.out.println("Индекс максимального значения: " + indexMax);
//        System.out.println("Индекс минимального значения: " + indexMin);
//    }
    /*
    Задача 4:
    Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
    сообщение, что их нет.
     */
//        int[] zeroArray = {567, 7346, 8536, 32, 5, 843, 10};
//        int count = 0;
//        for (int w : zeroArray) {
//            if (w == 0) {
//                count++;
//                System.out.println("Ответ на задачу 4: " + count);
//            }
//        }
//        if (count == 0) {
//            System.out.println("Ответ на задачу 4: нулевых элементов нет");
//        }
        /*Задача 5:
        Пройти по массиву и поменять местами элементы первый и последний, второй и
        предпоследний и т.д.
         */
//        int[] intArray5 = {567, 7346, 8536, 32, 5, 843, 10};
//        for (int i = 0; i < intArray5.length / 2; i++) { // делим на 2, чтобы дойти только до середины
//            int temp = intArray5[i]; //создаем временное хранилище, чтобы не потерялось текущее значение левое значение
//            intArray5[i] = intArray5[intArray5.length - 1 - i]; //находим зеркальный индекс справа
//            intArray5[intArray5.length - 1 - i] = temp;
//        }
//        System.out.println(Arrays.toString(intArray5));
//        }
        /*
        Задача 6:
        Проверить, является ли массив возрастающей последовательностью (каждое следующее
        число больше предыдущего).
         */
        int[] intArray6 = {567, 7346, 8536, 32, 5, 843, 10};
        boolean flag = true;
        for (int i = 1; i < intArray6.length; i++) {
            if (intArray6[i] <= intArray6[i-1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("возрастающая");
        }
        else {
            System.out.println("точно не возрастающая");
        }
    }
}
