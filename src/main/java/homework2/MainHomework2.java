package homework2;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.io.FileNotFoundException;



public class MainHomework2 {
    public static void main(String[] args) {
//        work0ne();
        workTwo();

    }
    private static void work0ne() {
    /*
    1. Напишите метод, который принимает на вход строку (String)
    и определяет является ли строка палиндромом (возвращает boolean значение).
     */
        Scanner Scanner = new Scanner(System.in);
        String name = Scanner.next();
        System.out.println(name.equals((new StringBuilder(name)).reverse().toString()));
    }

    private static void workTwo() {
        /*
        2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
        который запишет эту строку в простой текстовый файл, обработайте исключения.
         */
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append("TEST");
        }
//        try {
//            File newTextFile = new File("C:/thetextfile.txt");
//
//            FileWriter fw = new FileWriter(newTextFile);
//            fw.write(str);
//            fw.close();
//
//        } catch (IOException iox) {
//            iox.printStackTrace();
//        }
        String newStr = str.toString();
        System.out.println(newStr);
    }




}
