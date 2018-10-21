package pl.sda.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class BorrowerDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idBorrowerDetails;
    @Column(name = "ADDRESS")
    String address;
    @Column(name = "EMAIL")
    String email;
    @Column(name = "PHONE")
    int phone;

    public BorrowerDetails() {
    }

    public BorrowerDetails(String address, String email, int phone) {
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Long getIdBorrowerDetails() {
        return idBorrowerDetails;
    }

    public void setIdBorrowerDetails(Long idBorrowerDetails) {
        this.idBorrowerDetails = idBorrowerDetails;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
