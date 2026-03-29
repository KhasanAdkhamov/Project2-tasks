package miniTasks.task8;

public class Rectangle {
    private int width;
    private int height;
    private static int counter;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        counter++;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * (width + height);
    }

    public static int getCounter() {
        return counter;
    }
}
