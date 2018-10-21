package pl.sda.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Borrower implements Serializable {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idBorrower;
    @Column(name = "FIRST_NAME")
    String firstName;
    @Column(name = "LAST_NAME")
    String lastName;
    @Column(name = "BORROWER_DETAILS_ID")
    long borrowerDetailsId;

    public Borrower() {
    }

    public Borrower(String firstName, String lastName, long borrowerDetailsId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowerDetailsId = borrowerDetailsId;
    }

    public long getIdBorrower() {
        return idBorrower;
    }

    public void setIdBorrower(long idBorrower) {
        this.idBorrower = idBorrower;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getBorrowerDetailsId() {
        return borrowerDetailsId;
    }

    public void setBorrowerDetailsId(long borrowerDetailsId) {
        this.borrowerDetailsId = borrowerDetailsId;
    }
}
