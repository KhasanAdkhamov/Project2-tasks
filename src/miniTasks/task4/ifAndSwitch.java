package miniTasks.task4;

public class ifAndSwitch {
    public static void main(String[] args) {
        String grade = grade(2);
        System.out.println(grade);
    }

    /**
     *
     * @param score int 1 to 5
     * @return A, B, C, D, F
     */
    public static String grade(int score) {
        if (score > 5 || score < 1) {
            throw new IllegalArgumentException("1 to 5");
        }
        switch (score) {
            case 1 : return "F";
            case 2 : return "D";
            case 3 : return "C";
            case 4 : return "B";
            case 5 : return "A";
            default: throw new IllegalArgumentException("it is wrong" + score);
        }
    }
}
