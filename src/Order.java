/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MALSHANI
 */
public class Order {
  
    
    public double calculateTotal (double unitPrice ,double quantity){
    return unitPrice * quantity;
}
    public double getdiscountPrecentage (double total){
        if (total <500){
            return 0.10;
        } else if (total < 1000){
            return 0.15;
        } else if (total < 1500){
            return 0.20;
        } else {
        return 0.25;
    }
    }
    public double calculateGrandTotal (double total, double discount_precentage){
        double discountAmount = total* discount_precentage;
        return total - discountAmount;
    }
    
}
