package pl.sda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "book")
public class Author implements Serializable {
    @Id
    Long idAuthor;
    String firstName;
    String lastName;
    Date birthPlace;

    public Author() {
    }

    public Author(Long idAuthor, String firstName, String lastName, Date birthPlace) {
        this.idAuthor = idAuthor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthPlace = birthPlace;
    }

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Column(name = "FIRST_NAME", nullable = false, length = 20)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME", nullable = false, length = 30)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column(name = "BIRTHDAY_PLACE", length = 30)
    public Date getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(Date birthPlace) {
        this.birthPlace = birthPlace;
    }
}
