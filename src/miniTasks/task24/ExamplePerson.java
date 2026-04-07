package miniTasks.task24;

public class ExamplePerson {
    public static void main(String[] args) {
        Person person = new Person(new Address("nagornaya", 21));
        System.out.println(person.toString());
    }
}
