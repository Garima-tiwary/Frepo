package com.example.jpa3.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book2 {

    @Id
    private int id;
    private  String Book;

    @ManyToMany(mappedBy = "book2s")
    private List<Author2> author2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook() {
        return Book;
    }

    public void setBook(String book) {
        Book = book;
    }

    public List<Author2> getAuthor1() {
        return author2;
    }

    public void setAuthor1(List<Author2> author1) {
        this.author2 = author2;
    }

    public Book2(int id, String book, List<Author2> author2) {
        super();
        this.id = id;
        Book = book;
        this.author2 = author2;
    }

    public Book2(){
        super();
    }
}
