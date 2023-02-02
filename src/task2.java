//2.Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task2 {
    public static List<Integer> createRandomList(int size) {

        Random random = new Random();
        List<Integer> randomList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100));
        }

        System.out.println(randomList);
        return randomList;
    }

    public static void Rezults(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        int count = list.size();
        float sum = 0;

        for (Integer i : list) {
            sum += i;
        }

        float result = sum / count;

        System.out.printf("Минимальное значение: %d, максимальное значение: %d, " +
                "среднее арифметичское значение: %f", min, max, result);

    }

    public static void main(String[] args) {
        Rezults(createRandomList(10));
    }

}