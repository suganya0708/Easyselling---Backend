package com.app.easyselling.Model;

import javax.persistence.*;


@Entity
@Table(name = "product")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    Integer id;

    @Column(name = "name")
    String name;


    @Column(name = "image")
    String image;

    @Column(name = "price")
    Float price;


    @Column(name = "description")
    String description;


    @Column(name = "is_available")
    Boolean is_available;

    @Column(name = "quantity")
    Double quantity;


    @Column(name = "brand")
    String brand;

    @Column(name = "color")
    String color;


    @Column(name = "category_id")
    int category_id;

    public ProductModel() {
    }

    public ProductModel(Integer id, String name, String image, Float price, String description, Boolean is_available, Double quantity, String brand, String color, int category_id) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
        this.is_available = is_available;
        this.quantity = quantity;
        this.brand = brand;
        this.color = color;
        this.category_id = category_id;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIs_available() {
        return is_available;
    }

    public void setIs_available(Boolean is_available) {
        this.is_available = is_available;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
//
//    @Override
//    public String toString() {
//        return "ProductModel{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", image='" + image + '\'' +
//                ", price=" + price +
//                ", description='" + description + '\'' +
//                ", is_available=" + is_available +
//                ", quantity=" + quantity +
//                ", brand='" + brand + '\'' +
//                ", color='" + color + '\'' +
//                ", category_id=" + category_id +
//                '}';
//    }
}
