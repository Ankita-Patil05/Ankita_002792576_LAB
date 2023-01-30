/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeliveryPackage;

import java.util.ArrayList;

/**
 *
 * @author ankitapatil
 */
public class Package {
    int packageId;
    float weight;
    Customer customer;
    ArrayList<Product> productlist;
    
 public Package(){
     this.productlist = new ArrayList<Product> ();
     this.customer = new Customer();
 }

  public ArrayList<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(ArrayList<Product> productlist) {
        this.productlist = productlist;
    } 

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public Product createProduct(int productID, String productName, double productPrice){
       Product product = new Product();
       
       product.setProductID(productID);
       product.setProductName(productName);
       product.setProductPrice(productPrice);
       
       this.productlist.add(product);
       return product;
    }
     public Product findProduct(int pid) {
        for (Product prod : this.productlist) {
            if (prod.getProductID() == pid) {
                return prod;
            }
        }
        return null;
    }
       
        
    }


