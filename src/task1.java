// 1.Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class task1 {

    public static List<Integer> createRandomList() {
        Random random = new Random();
        int size = 10;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        return list;
    }

    public static List<Integer> deleteEvenNumers(List<Integer> list) {
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        deleteEvenNumers(createRandomList());
    }
}
