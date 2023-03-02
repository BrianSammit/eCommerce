package com.brian.eCommerce.domain.catalog.command;

import com.brian.eCommerce.generic.Command;

public class CreateProductCommand extends Command {

    private String productID;
    private  String name;
    private  Float price;
    private  Boolean inStock;
    private  String description;
    private  String publisher;
    private  String location;

    public CreateProductCommand(String productID, String name, Float price, Boolean inStock, String description, String publisher, String location) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.description = description;
        this.publisher = publisher;
        this.location = location;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
