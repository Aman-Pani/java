package org.shapes;
import java.lang.*;

public class square{
    public int a;
    public square(int n1){
        a=n1;
    }
    public void perimeter(){
        System.out.println("Perimeter of square = " + (4*a));
    }
    public void area(){
        System.out.println("Area of square = " + (a*a));
    }
}