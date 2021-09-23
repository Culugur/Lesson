package Lesson1;

import java.util.Scanner;

public class yt {
    public static void main(String[] args) {
        Scanner stroka = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = stroka.nextLine();
      //  char numbers = 0;
        String latyn = str;
       // for (int i = 0; i < str.length(); i++) {
            //  numbers = str.charAt(i);
            if (str.equalsIgnoreCase("а"))
                latyn = "a";
            if (str.equalsIgnoreCase("б"))
                latyn = "b";
            if (str.equalsIgnoreCase("в"))
                latyn = "v";
            if (str.equalsIgnoreCase("г"))
                latyn = "g";
            if (str.equalsIgnoreCase("д"))
                latyn = "d";
            if (str.equalsIgnoreCase("е"))
                latyn = "e";
            if (str.equalsIgnoreCase("ж"))
                latyn = "zh";
            if (str.equalsIgnoreCase("з"))
                latyn = "z";
            if (str.equalsIgnoreCase("и"))
                latyn = "i";
            if (str.equalsIgnoreCase("й"))
                latyn = "j";
            if (str.equalsIgnoreCase("к"))
                latyn = "k";
            if (str.equalsIgnoreCase("л"))
                latyn = "l";
            if (str.equalsIgnoreCase("м"))
                latyn = "m";
            if (str.equalsIgnoreCase("н"))
                latyn = "n";
            if (str.equalsIgnoreCase("о"))
                latyn = "o";
            if (str.equalsIgnoreCase("п"))
                latyn = "p";
            if (str.equalsIgnoreCase("р"))
                latyn = "r";
            if (str.equalsIgnoreCase("с"))
                latyn = "s";
            if (str.equalsIgnoreCase("т"))
                latyn = "t";
            if (str.equalsIgnoreCase("у"))
                latyn = "u";
            if (str.equalsIgnoreCase("ф"))
                latyn = "f";
            if (str.equalsIgnoreCase("х"))
                latyn = "x";
            if (str.equalsIgnoreCase("ц"))
                latyn = "c";
            if (str.equalsIgnoreCase("ч"))
                latyn = "ch";
            if (str.equalsIgnoreCase("ш"))
                latyn = "sh";
            if (str.equalsIgnoreCase("щ"))
                latyn = "shh";
            if (str.equalsIgnoreCase("ы"))
                latyn = "y";
            if (str.equalsIgnoreCase("э"))
                latyn = "e";
            if (str.equalsIgnoreCase("ю"))
                latyn = "yu";
            if (str.equalsIgnoreCase("я"))
                latyn = "ya";

            str = latyn;

          System.out.print(str);
            System.out.println();
          System.out.println(latyn);
        }

    }


