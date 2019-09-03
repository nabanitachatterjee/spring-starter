package com.sample.nabanita.shoppinglist.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class ProductInfo {
    private double price;
    private int size;
    private Gender gender;
    private Colour colour;
    private Product product;
    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ProductInfo() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

enum Product {
    DRESS, BIKINI, LINGERIE, SHIRT, JEANS
}

enum Gender {
    MALE, FEMALE
}

enum Colour {
    RED, GREEN, YELLOW, BLUE
}
