package miniTasks.task12;

import miniTasks.task11.Square;
import miniTasks.task9and10.Rectangle9;

import java.util.ArrayList;
import java.util.List;

public class ExamplePolim {
    public static void main(String[] args) {
        List<Rectangle9> rectangle9List = List.of(new Rectangle9(1, 2),
         new Rectangle9(5, 5), new Rectangle9(4, 4), new Square(2, 2), new Square(10,10));
        areaP(rectangle9List);
    }

    public static void areaP(List<Rectangle9> list) {
        for (Rectangle9 rectangle9 : list) {
            System.out.println(rectangle9.area());
        }
    }
}
