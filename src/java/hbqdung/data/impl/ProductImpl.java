/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hbqdung.data.impl;
import hbqdung.data.dao.ProductDao;
import hbqdung.data.driver.MySQLDriver;
import hbqdung.data.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class ProductImpl implements ProductDao{
    Connection conn= MySQLDriver.getConnection();
    @Override
    public List<Product> findAll() {
          List<Product> listProduct = new ArrayList<>();
       String sql="select * from products";
         try {
             PreparedStatement sttm= conn.prepareStatement(sql);
             ResultSet rs=sttm.executeQuery();
             while(rs.next()){
                      int id,id_category;  String name,image; double price;
                     int  quantity;  boolean status;
                  id =rs.getInt("id");  id_category=rs.getInt("id_category");
                  name=rs.getString("name");  price=rs.getDouble("price");
                  image=rs.getString("image");  quantity=rs.getInt("quantity");
                  status=rs.getBoolean("status");
                 listProduct.add(new Product( id,  id_category,  price,  name,  image,  quantity,  status));
             }
         } catch (SQLException ex) {
             Logger.getLogger(CateforyImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return listProduct;
         }
    
    @Override
    public boolean insert(Product Product) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Product Product) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Product Product) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Product find(Product Product) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
