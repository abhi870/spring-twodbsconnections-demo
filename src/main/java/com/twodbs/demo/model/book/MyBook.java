package com.twodbs.demo.model.book;

import javax.persistence.*;

@Entity
@Table(name = "mybook")
public class MyBook {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "author")
    private String author;



    public MyBook() {
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public MyBook(Long book_id, String bookName, String author) {
        this.book_id = book_id;
        this.bookName = bookName;
        this.author = author;
    }
}
