package com.weist.Q1_2025_software_dev_project_challenge.models;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import jakarta.persistence.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int Id;

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String pwHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User (){

    }
    public User(String name,String email,String username,String password) {
    this.name = name;
    this.username = username;
    this.email = email;
    this.pwHash = encoder.encode(password);
}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPwHash() {
        return pwHash;
    }

    public void setPwHash(String pwHash) {
        this.pwHash = pwHash;
    }
}
