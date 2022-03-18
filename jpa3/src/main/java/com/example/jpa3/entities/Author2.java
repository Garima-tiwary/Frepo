package com.example.jpa3.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author2 {
    @Id
    private  int id;
    private  String author;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "authors_book",
            joinColumns = @JoinColumn(name="author_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
    private List<Book2> book2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Book2> getBook1s() {
        return book2;
    }

    public void setBook1s(List<Book2> book2) {
        this.book2 = book2;
    }

    public Author2(int id, String author, List<Book2> book2) {
        super();
        this.id = id;
        this.author = author;
        this.book2 = book2;
    }

    public Author2(){
        super();
    }
}



