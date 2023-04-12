package homework1;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Arrays;

public class MainClassFromHomeworkOne {
    public static void main(String[] args) {
//        work0ne();
        workTwo();
//        workTree();

    }

    private static void workTree() {
        /*
         3*. В консоли запросить имя пользователя. В зависимости от текущего времени,
         вывести приветствие вида:
         "Доброе утро, <Имя>!", если время от 05:00 до 11:59
         "Добрый день, <Имя>!", если время от 12:00 до 17:59;
         "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
         "Доброй ночи, <Имя>!", если время от 23:00 до 4:59.
        */
        LocalDateTime now = LocalDateTime.now();
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(now);
        System.out.println("Введите имя!");
        Scanner Scanner = new Scanner(System.in);
        String name = Scanner.nextLine();
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.println("Доброй ночи, " + name + "!");
        }

    }

    private static void workTwo() {
        /*
         2. Дан массив nums = [3,2,2,3] и число val = 3.
         Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец
         массива.
         Таким образом, первые несколько (или все) элементов массива должны быть отличны
         от заданного, а остальные - равны ему.
        */
        int[] nums = new int[]{3, 2, 2, 3, 1, 3};
        /* sort
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums, 0, 5);
        System.out.println(Arrays.toString(nums));
        */
        int val = 3;
        int left = 0;
        int right = nums.length-1;
        int temp;
        while (left<right) {
            if (nums[left] != val) {
                left++;
            }
            if (nums[right] == val) {
                right--;
            }
            if (nums[left] == val && nums[right] != val) {
                temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right--;
            }
        }
        System.out.print(Arrays.toString(nums));
    }

    private static void work0ne() {
        /*
         1. Задать одномерный массив и найти в нем минимальный и максимальный элементы.
        */
        int[] arr = new int[]{10, 5, 8, 2, 6, 18, 1};
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
//        System.out.printf("Минимальный элемент в массиве = %s", min);
//        System.out.printf("Максимальный элемент в массиве = %s", max);
        System.out.printf("Минимальное число в массиве: %d, максимальное число в массиве: %d", min, max);

        /*
        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));
        */
    }
}
