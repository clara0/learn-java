package clara;

import java.util.Objects;

public class Address {
    private String street;
    private String zipcode;
    private String city;
    private String state;
    private String country;

    @Override
    public String toString() {
        return "Street: " + this.street + ", Zipcode: " + this.zipcode + ", City: " + this.city + ", State: " + this.state + ", Country: " + this.country;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Address) {
            Address otherAddress = (Address) other;
            return Objects.equals(this.street, otherAddress.street) &&
                    Objects.equals(this.zipcode, otherAddress.zipcode) &&
                    Objects.equals(this.city, otherAddress.city) &&
                    Objects.equals(this.state, otherAddress.state) &&
                    Objects.equals(this.country, otherAddress.country);
        }
        return false;
    }

    public Address() {
    }

    public Address(String street, String zip, String city, String state, String country) {
        this.street = street;
        this.zipcode = zip;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
