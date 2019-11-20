package pl.bykowski.ksb2;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Customer {

    private String name;

    @JsonIgnore
    private String idCard;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}