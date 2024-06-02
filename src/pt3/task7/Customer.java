package pt3.task7;
public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        if (address != null) {
            return address;
        } else {
            return Address.nullAddress();
        }
    }
}