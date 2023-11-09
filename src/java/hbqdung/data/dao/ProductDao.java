/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hbqdung.data.dao;
import hbqdung.data.model.Product;
import java.util.List;
public interface ProductDao {
     public List<Product> findAll();
   public boolean insert(Product Product);
   public boolean update(Product Product);
   public boolean delete(Product Product);
   public Product find(Product Product);
}
