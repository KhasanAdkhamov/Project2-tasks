package miniTasks.task26;

public class Rectangle extends Figure{
    private int height;

    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
    }

    @Override
    public int area() {
        return height * super.size;
    }
}
