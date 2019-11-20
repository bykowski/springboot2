package pl.bykowski.ksb2;

public class Order {
    private Customer customer;
    private Address shippingAddress;

    public Order() {
    }

    public Order(Customer customer, Address shippingAddress) {
        this.customer = customer;
        this.shippingAddress = shippingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
