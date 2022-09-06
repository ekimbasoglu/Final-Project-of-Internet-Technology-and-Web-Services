package com.ekimbasoglu2019230496.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "review")
public class Review implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Integer?
    @Column(name="TYPE")
    private String typeOfTheReview;
    private Integer rating;
    private String comment;

    // Constructor
    public Review() {
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeOfTheReview() {
        return typeOfTheReview;
    }

    public void setTypeOfTheReview(String typeOfTheReview) {
        this.typeOfTheReview = typeOfTheReview;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
