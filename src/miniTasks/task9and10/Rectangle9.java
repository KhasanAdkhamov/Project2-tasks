package miniTasks.task9and10;

public class Rectangle9 {
    protected int width;
    protected int height;
    private static int counter;

    public Rectangle9() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle9(int width, int height) {
        setWidth(width);
        setHeight(height);
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

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new NullPointerException("0");
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new NullPointerException("0");
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle9{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
