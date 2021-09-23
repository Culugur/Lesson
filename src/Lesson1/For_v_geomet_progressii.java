package Lesson1;
/*Напишите программу, использующую цикл for
 для вывода чисел в геометрической прогрессии: 1, 2, 4, 8, 16, 32 и т.д.*/

import java.util.Scanner;

public class For_v_geomet_progressii {
    public static void main(String[] args) {
        int i;
        int chislo = requestNumber();
        for (i = 1; i < chislo; ) {

            System.out.println(i);
            i += i;
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число до которого будет происходить геом. прогрессия:");
        return scanner.nextInt();
    }
}

