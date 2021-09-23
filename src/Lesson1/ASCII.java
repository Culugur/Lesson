package Lesson1;

import java.io.IOException;
import java.util.Scanner;

public class ASCII {
    private static Object character;

    /* Код ASCII символов нижнего регистра отличается от кода соответствующих символов
         верхнего регистра на величину 32. Следовательно, для преобразования
         строчной буквы в прописную нужно уменьшить ее код на 32. Используйте это обстоятельство
         для написания программы, осуществляющей получение символов с
         клавиатуры. При выводе результатов данная программа должна преобразовывать
         строчные буквы в прописные, а прописные - в строчные. Остальные символы не
         должны изменяться. Работа программы должна завершаться после того, как пользователь
         введет с клавиатуры точку. И наконец, сделайте так, чтобы программа
         отображала число символов, для которых бьш изменен регистр.*/
    public static void main(String[] args) throws IOException {
        char ch, tohka = '.';
        int i = 0;
        System.out.println("Нажмите любую клавишу при нажатии точка программа завершится ");
        do {
            ch = (char) System.in.read();

            if (ch >= 65 & ch <= 90) {
                ch = (char) (ch + 32);
                System.out.println(ch);
                i = i + 1;

            } else {
                if (ch >= 97 & ch <= 122) {
                    ch = (char) (ch - 32);
                    System.out.println(ch);
                    i = i + 1;
                }
            }
        }
            while (ch != '.');
        System.out.println("Число символов с измененным регистром" + i);


    }
    }








