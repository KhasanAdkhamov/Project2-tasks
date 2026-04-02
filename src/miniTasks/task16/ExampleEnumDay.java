package miniTasks.task16;

public class ExampleEnumDay {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        Day tuesday = Day.TUESDAY;
        Day wednesday = Day.WEDNESDAY;
        Day thurday = Day.THURDAY;
        Day friday = Day.FRIDAY;
        Day saturday = Day.SATURDAY;
        Day sunday = Day.SUNDAY;
        System.out.println(monday.isWeekend());
        System.out.println(sunday.isWeekend());
    }
}
