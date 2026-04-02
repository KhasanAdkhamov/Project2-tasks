package miniTasks.task13a14a15;

import miniTasks.task9and10.Rectangle9;

public class Square13 extends Rectangle9 {


    public Square13(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public String toString() {
        return "Square13{" +
                "width=" + width +
                '}';
    }
}
