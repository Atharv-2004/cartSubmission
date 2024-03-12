package com.example.cart.Cart.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.example.cart.Cart.dtos.FakeStoreCartDto;
import com.example.cart.Cart.dtos.FakeStoreProductDtos;
import com.example.cart.Cart.models.Category;
import com.example.cart.Cart.models.product;

@Service
public class productService {
    private RestTemplate restTemplate = new RestTemplate();

    public FakeStoreCartDto[] getAllCarts() {
        var response = restTemplate.getForObject(
                "https://fakestoreapi.com/carts",
                FakeStoreCartDto[].class);

        return response;
    }

    public product getProductById(@PathVariable Long id) {
        FakeStoreProductDtos fakeStoreProductDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products" + id,
                FakeStoreProductDtos.class);
        product products = new product();
        products.setId(fakeStoreProductDto.getId());
        products.setTitle(fakeStoreProductDto.getTitle());
        products.setPrice(fakeStoreProductDto.getPrice());
        products.setImageUrl(fakeStoreProductDto.getImage());
        products.setDescription(fakeStoreProductDto.getDescription());
        products.setCategory(new Category());
        products.getCategory().setName(fakeStoreProductDto.getCategory());

        return products;
    }

  

    

}
