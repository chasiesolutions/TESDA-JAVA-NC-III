package chapter1;

import java.util.*;
import otherFolder.*;

/* order of elements in a class
P - package
I - import
C - class
        properties
        methods
        constructor

*/ 




public class Main{
    
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        A a = new A();
        A a2 = new A();
        B b;
        C c;
        otherFolder.a.Makahiya makahiya;
        toy1.brand="";
        toy1.name="";
        toy1.price=0;
        toy1.quantity=12;
        Random r = new Random();
        ArrayList p;
        Scanner o;
        System.out.println(r.nextInt(10));
        // toy1.setPrice(price);
        System.out.println("Main");
        System.out.println(a.msg);


    }
    
}

//Flight-id
//Plane-type
//Cap
//Crew
//Passengers


//Person-id,Name
//Name-first,Lastname
//Lastname-id
