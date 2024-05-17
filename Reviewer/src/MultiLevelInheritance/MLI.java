/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MultiLevelInheritance;

/**
 *
 * @author DEAN MARC PECHAYCO
 */
class Grandparent {
    void display() {
        System.out.println("Grandparent class");
    }
}

class Parent extends Grandparent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("Child class");
    }
}

public class MLI {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();
        c.print();
    }
}