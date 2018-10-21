package pl.sda.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "book")
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAuthor;
    @Column(name = "FIRST_NAME", nullable = false, length = 20)
    String firstName;
    @Column(name = "LAST_NAME", nullable = false, length = 30)
    String lastName;
    @Column(name = "BIRTHDAY_PLACE", length = 30)
    Date birthPlace;

    public Author() {
    }

    public Author(Long idAuthor, String firstName, String lastName, Date birthPlace) {
        this.idAuthor = idAuthor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthPlace = birthPlace;
    }

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
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

    public Date getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(Date birthPlace) {
        this.birthPlace = birthPlace;
    }
}
