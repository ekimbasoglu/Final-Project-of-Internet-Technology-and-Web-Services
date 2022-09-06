package com.ekimbasoglu2019230496.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Integer?
    private String name;
    private String director;
    private String summarizedDescription;
    private String length;
    private Integer rating;
    @OneToMany(mappedBy = "review")
    private List<Review> reviews = new ArrayList<>();

    // Constructor
    public Movie() {
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSummarizedDescription() {
        return summarizedDescription;
    }

    public void setSummarizedDescription(String summarizedDescription) {
        this.summarizedDescription = summarizedDescription;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
