/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adhit_301122;

/**
 *
 * @author ACER
 */
public class student extends person {
    public student (){
        super("Adhit","Padang");
        super.name = "Awan"; 
        super.address = "Padang";
        System.out.println("Inside student:Constructor");
    }
    
    
    public String getName(){ 
        System.out.println("student: getName"); 
        return name; 
    } 
    
    public static void main(String[] args) {
        student anna = new student();
        anna.name = "Anna";
        System.out.println(anna.name);
    }
}
