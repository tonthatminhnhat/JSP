/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hbqdung.data.dao;
import hbqdung.data.impl.CateforyImpl;
import hbqdung.data.impl.ProductImpl;
import hbqdung.data.impl.UserImpl;
public class Database {
    public static CategoryDao getCategoryDao(){
        return new CateforyImpl();
    }
     public static ProductDao getProductDao(){
        return new ProductImpl();
    }
     public static UserDao getUserDao(){
        return new UserImpl();
    }
}
