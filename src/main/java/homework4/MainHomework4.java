package homework4;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class MainHomework4 {
    public static void main(String[] args) {
        work0ne();
//        workTwo();

    }
    private static void work0ne() {
        /*
            1. Реализовать консольное приложение, которое:
            Принимает от пользователя и “запоминает” строки.
            Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
            а первая - последней.
            Если введено revert, удаляет предыдущую введенную строку из памяти.
         */
        LinkedList<String> inputList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String srt;
        System.out.println("Введите значение для строки.\n Для выхода используйте 'print': ");

        while (!(srt = scanner.nextLine()).equals("print"))
            inputList.addFirst(srt);

//        inputList.remove(1);
        System.out.println("Результат. Перевёрнутый LinkedList: " + inputList.toString());

    }
    private static void workTwo() {
        /*
            2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
         */
        Random random = new Random();
        List<Integer> List = new LinkedList<>();
        int count = 15;
        for (int i = 0; i < count; i++) {
            List.add(random.nextInt(1, count));
        }

        System.out.println("Случайный список: " + List.toString());

        List<Integer> reversList = new LinkedList<>();

        for (int i = List.size() - 1; i >= 0; i--) {
            reversList.add(List.get(i));
        }
        System.out.println("Перевёрнутый список: " + reversList.toString());
    }


}
