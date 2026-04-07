package miniTasks.task20;

public class ExampleBox {
    public static void main(String[] args) {
        Box<String> objectBox = new Box<>("abc");
        System.out.println(objectBox.toString());
        System.out.println(objectBox.getValue());
    }
}
