package miniTasks.task3;

import java.util.ArrayList;
import java.util.List;

public class CtoF {
    public static void main(String[] args) {
        System.out.println(temperature(0));
        System.out.println(temperature(100));
    }

    public static List<Double> temperature(double c) {
        List<Double> fAndC = new ArrayList<>();
        double f = c * 1.8 + 32;
        double k = c + 273.15;
        fAndC.add(f);
        fAndC.add(k);
        return fAndC;
    }
}
