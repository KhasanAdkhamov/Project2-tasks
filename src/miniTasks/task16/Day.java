package miniTasks.task16;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY, SUNDAY;


    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
