/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MethodOverloading;

/**
 *
 * @author DEAN MARC PECHAYCO
 */
    public class MainCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator cal = new Calculator();
        cal.add("Java", "Fun");
        cal.add(4.5, 5.0);
        cal.add(10, 20); 
    }
    
}