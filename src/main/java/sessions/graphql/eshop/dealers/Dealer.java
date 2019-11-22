package sessions.graphql.eshop.dealers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dealer {
    String name;
    String location;
    Long id;
    String phone;
    String address;


    public Dealer(Long id, String name, String address, String location, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.location = location;
        this.phone = phone;
    }

    public Dealer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
