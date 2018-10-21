import java.util.Date;

public class Author {
    Long idAuthor;
    String firstName;
    String lastName;
    Date birthPlace;

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
