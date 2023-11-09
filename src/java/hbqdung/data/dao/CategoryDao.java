/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hbqdung.data.dao;
import hbqdung.data.model.Category;
import java.util.List;
public interface CategoryDao {
   public List<Category> findAll();
   public boolean insert(Category category);
   public boolean update(Category category);
   public boolean delete(Category category);
   public Category find(Category category);
}
