package homework6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task{
    /*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
    Реализовать в java.
    Создать множество ноутбуков (ArrayList).
    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
    Выводить только те ноутбуки, что соответствуют условию

     */

    public static void main(String[] args) throws Exception {

        Notebook Notebook1 = new Notebook("HP 15-dw1018nq Gray", 4, 256, "Windows 10",
                "серый", 15.6);
        Notebook Notebook2 = new Notebook("ASUS Vivobook Go 14 E410MA-BV1841W, 14", 4, 128,
                "без ОС","белый", 14);
        Notebook Notebook3 = new Notebook("Apple MacBook Pro A2338", 8, 256, "MacOs",
                "серый космоо", 13.3);
        Notebook Notebook4 = new Notebook("Lenovo V15 G2 ALC", 8, 256, "Windows 10",
                "черный", 15.6);
        Notebook Notebook5 = new Notebook("HONOR MAGICBOOK R5-5500U", 8, 256, "Windows 10",
                "серый", 14);
        Notebook Notebook6 = Notebook1;

        Set<Notebook> unNotebook = new HashSet<Notebook>();
        unNotebook.add(Notebook1);
        unNotebook.add(Notebook2);
        unNotebook.add(Notebook3);
        unNotebook.add(Notebook4);
        unNotebook.add(Notebook5);
        unNotebook.add(Notebook6);
        System.out.println(Notebook1.equals(Notebook6));
        System.out.printf("Уникальных ноутбуков: %d \n", unNotebook.size());


        Map<Integer, String> mapInfo = new HashMap<>();
        mapInfo.put(1, "объем оперативной памяти");
        mapInfo.put(2, "объем накопителя");
        mapInfo.put(3, "ОС");
        mapInfo.put(4, "цвет");
        mapInfo.put(5, "диагональ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти: ");
        int ram = scanner.nextInt();
        System.out.println("объем накопителя: ");
        int storСap = scanner.nextInt();

        System.out.println("диагональ");
        double diagonal = scanner.nextDouble();

        for (Notebook notebook : unNotebook) {
            if ((notebook.getRam() >= ram) && (notebook.getStorageCap() >= storСap) && notebook.getDiagonal() >= diagonal) {
                System.out.println(notebook.toString());
            }
        }
    }

}

