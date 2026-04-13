package miniTasks.task27;

public class Exception27 {
    public static void main(String[] args) {
        System.out.println(divide(2, 2));
    }


    public static int divide(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("деление на ноль невозможно");
        }
        return a / b;
    }
}
