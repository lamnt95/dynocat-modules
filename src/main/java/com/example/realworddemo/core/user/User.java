package com.example.realworddemo.core.user;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String username;
    private String password;
    private String email;
    private String bio;
    private String image;

    public User() {
    }

    public User(String username, String password, String email, String bio, String image) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.bio = bio;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
