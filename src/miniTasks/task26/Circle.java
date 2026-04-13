package miniTasks.task26;

public class Circle extends Figure{

    public Circle(int size) {
        super(size);
    }

    @Override
    public int area() {
        return size * size;
    }
}
