/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author OOI ZHENG YUE
 */
public class product {
    private int product_id;
    private String product_name;
    private int product_qty;
    private double priceunit;
    private String enterpricename;
    private double total;
    
    
    public product(int product_id, String product_name, int product_qty, double priceunit, String enterpricename,double total){
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_qty = product_qty;
        this.priceunit = priceunit;
        this.enterpricename = enterpricename;
        this.total = total;
    }
    
    public int getproductId(){
        return product_id;
    }
    
    public String getproductName(){
        return product_name;
    }
    public int getproductQuantity(){
        return product_qty;
    }
    public double getpriceUnit(){
        return priceunit;
    }
    public String getenterPrice(){
        return enterpricename;
    }
    public double gettotal(){
        return total = getproductQuantity()*getpriceUnit();
    }
}
