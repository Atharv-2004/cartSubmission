package com.example.cart.Cart.models;

import java.util.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class cart {
    long id;
    long userId;
    String date;
    ArrayList<product> products;
}
