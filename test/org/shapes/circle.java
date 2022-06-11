package org.shapes;
import java.lang.*;

public class circle{
    public int r;
    public circle(int n1){
        r=n1;
    }
    public void perimeter(){
        System.out.println("Perimeter of circle = " + (2*3.14*r));
    }
    public void area(){
        System.out.println("Area of circle = " + (3.14*r*r));
    }
}