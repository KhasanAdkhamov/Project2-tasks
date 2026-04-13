package miniTasks.task26;

import miniTasks.task9and10.Rectangle9;

public class ExampleAbstract {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println(rectangle.area());
        System.out.println(circle.area());
    }
}
