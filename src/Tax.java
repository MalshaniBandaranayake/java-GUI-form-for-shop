/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MALSHANI
 */
public class Tax {
    private double Tax_precentage;
    
 public double getTaxPrecentage (String productType){
     switch(productType){
         case "food":
             Tax_precentage =0.00;
             break;
         case "electronic":
             Tax_precentage =0.15;
             break;
         case "medical":
             Tax_precentage =0.20;
             break;
         case "cosmetics":
             Tax_precentage =0.25;
             break;
         default:
             break;
     }
     
     return Tax_precentage;
 }
 public void setTaxPrecentage (double Tax_prec){
     Tax_precentage = Tax_prec;
 }
   public double calculateTaxAmount(double total, double Tax_precentage) {
       double TaxAmount = total* Tax_precentage;
       return TaxAmount;
   }
 public double calculateFinalTotal(double grand_total, double TaxAmount){
     return grand_total + TaxAmount;
     
 }
 
}
