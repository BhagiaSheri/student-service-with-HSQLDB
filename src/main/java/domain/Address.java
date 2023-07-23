package domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private int id;
    private String street;
    private String city;
    private String zip;

    public Address() {
    }

    public Address(int id, String street, String city, String zip) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
