/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverloading;

/**
 *
 * @author DEAN MARC PECHAYCO
 */
public class Calcu {
    
    private int int1, int2, intAdd;
    private double dou1, dou2, douAdd;
    private String s1, s2, stringadd;
    
    public void add(int int1, int int2){
        intAdd = int1 + int2;
        System.out.println("The sum of 2 integer is: " + intAdd);
    
    }
    public void add (double dou1, double dou2){
        douAdd = dou1 + dou2;
        System.out.println("The sum of double is: " + douAdd);
    
    }
    public void add (String s1, String s2){
        stringadd = s1+s2;
        System.out.println("Ayoko na sayo" + stringadd);
    }
    
}
