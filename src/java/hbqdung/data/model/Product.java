/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hbqdung.data.model;

public class Product {
      private int id, id_category;
      private double price;
     private String name,image;
     private int quantity;
     private boolean status;
    public Product(int id, int id_category, double price, String name, String image, int quantity, boolean status) {
        this.id = id;
        this.id_category = id_category;
        this.price = price;
        this.name = name;
        this.image = image;
        this.quantity = quantity;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public int getId_category() {
        return id_category;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public double getQuantity() {
        return quantity;
    }
    public boolean isStatus() {
        return status;
    }
}
