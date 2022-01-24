package com.devsuperior.hroauth.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long Id;
    private String email;
    private String name;
    private String password;

    private Set<Role> roles = new HashSet<>();

    public User(Long id, String email, String name, String password) {
        Id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}
