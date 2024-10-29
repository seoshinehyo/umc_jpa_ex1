package umc.jpa_ex1.domain.embedded;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable // 어딘가 내장이 될 수 있다.
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
