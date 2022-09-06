package com.ekimbasoglu2019230496.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "user")
public class User implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Integer?
    private String name;
    private String surname;
    private int age;
    private boolean status; // 1 active - default
    @OneToMany(mappedBy = "user")
    private List<Book> booksLiked = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Movie> moviesLiked = new ArrayList<>();

    // Constructor
    public User() {
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Book> getBooksLiked() {
        return booksLiked;
    }

    public void setBooksLiked(List<Book> booksLiked) {
        this.booksLiked = booksLiked;
    }

    public List<Movie> getMoviesLiked() {
        return moviesLiked;
    }

    public void setMoviesLiked(List<Movie> moviesLiked) {
        this.moviesLiked = moviesLiked;
    }
}
