package miniTasks.task24;

public class Person {
    private Address address;

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                '}';
    }
}
