package miniTasks.task17;

import java.util.*;

public class ListRandom {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 7, 8, 4, 9, 13, 123, 1231, 64, 456, 245, 22, 232, 89, 67, 0);
        Collections.sort(list);
        System.out.println(list);

    }
}
