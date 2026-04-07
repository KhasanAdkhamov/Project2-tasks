package miniTasks.task24;

import java.util.Arrays;

public class Address {
    private String street;
    private int flat;

    public Address(String street, int flat) {
        this.street = street;
        this.flat = flat;
    }

    public String getStreet() {
        return street;
    }

    public int getFlat() {
        return flat;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", flat=" + flat +
                '}';
    }
}
