package pl.sda.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_book;
    @Column(name = "BORROW", nullable = false)
    boolean borrow;
    @Column(name = "CATEGORY")
    String category;
    @Column(name = "ISBN")
    String isbn;
    @Column(name = "PAGES")
    int pages;
    @Column(name = "RELEASE_DATE")
    Date releaseDate;
    @Column(name = "DESCRIPTION")
    String description;
    @Column(name = "TITLE")
    String title;

    public Book() {
    }

    public Book(Long id_book, boolean borrow, String category, String isbn, int pages, Date releaseDate, String description, String title) {
        this.id_book = id_book;
        this.borrow = borrow;
        this.category = category;
        this.isbn = isbn;
        this.pages = pages;
        this.releaseDate = releaseDate;
        this.description = description;
        this.title = title;
    }

    public Long getId_book() {
        return id_book;
    }

    public void setId_book(Long id_book) {
        this.id_book = id_book;
    }

    public boolean isBorrow() {
        return borrow;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }

}
