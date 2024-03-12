package com.example.cart.Cart.models;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class user {
    String username;
    long id;
    String email;
    String password;
    String name;

    public user(String name, int id,String username, String email, String password) {
        this.name = name;
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
}
