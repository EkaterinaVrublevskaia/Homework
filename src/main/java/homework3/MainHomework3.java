package homework3;
import java.lang.reflect.Array;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainHomework3 {
    public static void main(String[] args) {
//        work0ne();
//        workTwo();
        workThree();
//        workFour();

    }

    private static void work0ne() {
        /*
        1. Пусть дан произвольный список целых чисел, удалить из него четные числа
        (в языке уже есть что-то готовое для этого)
         */

        System.out.print("Введите длину списка: ");
        try (Scanner Scanner = new Scanner(System.in)) {
            int num = Scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            Random random = new Random();
            for (int i = 0; i < num; i++) {
                int res = random.nextInt(num);
                array.add(res);
            }
            System.out.println("Произвольный список целых чисел: \n " + array);

            for (int i = array.size() - 1; i >= 0; i--) {
                int even = array.get(i) % 2;
                if (even == 0) {
                    array.remove(i);
                }
            }
            Collections.sort(array);
            System.out.println("Конечный список без четных чисел: \n " + array);
        }

    }
    private static void workTwo() {
        /*
        2. Задан целочисленный список ArrayList. Найти минимальное,
        максимальное и среднее арифметическое из этого списка.
         */
        System.out.print("Введите длину списка: ");
        try (Scanner Scanner = new Scanner(System.in)) {
            int num = Scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            Random random = new Random();
            for (int i = 0; i < num; i++) {
                int res = random.nextInt(num);
                array.add(res);
            }
            System.out.println("Произвольный список целых чисел: \n " + array);

            int min = array.get(0);
            int max = array.get(0);
            float sum = 0;
            for (int i = 0; i < array.size(); i++) {
                int number = array.get(i);
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
                sum += number;
            }
            float average = sum / array.size();
            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее арифметическое значение: " + average);
        }
    }

    private static void workThree() {
        /*
        3. Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.
         */
//        String[] arrPlanet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter","Saturn", "Uranus", "Neptun", "Pluto"};
        List<String> planetNames = List
                .of("Mercury", "Venus", "Earth", "Mars", "Jupiter","Saturn", "Uranus", "Neptun", "Pluto");
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            list.add(planetNames.get(random.nextInt(9)));
        }
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        System.out.println(list);
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++){
            if(list.get(i).equals(list.get(i+1))){
                count++;
            }else {
                sb.append(list.get(i))
                        .append(": ")
                        .append(count)
                        .append("; ");
                count = 1;
            }
        }
        sb.append((list.get(list.size() - 1) + ": ")).append(count).append(".");
        System.out.println(sb);
        /*
        Через преобразование в множество
         */
        Set<String> set = new LinkedHashSet<>(planetNames);
        List<String> listRes = new ArrayList<>(set);
        listRes.sort(Comparator.naturalOrder());
        System.out.println(listRes);
    }

    private static void workFour() {
        /*
        4*. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
         */
        System.out.print("Введите длину списка: ");
        ArrayList<String> array = new ArrayList<String>();
        Collections.addAll(array, "2", "work", "4", "sun", "16", "24", "слово", "string", "int", "java", "10", "cat", "20");
        System.out.println("Cписок: \n " + array);
        for (String i : array) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < array.size(); i++) {
            array.remove(i);
        }
        System.out.println("Конечный список без четных чисел: \n " + array);
    }




}
