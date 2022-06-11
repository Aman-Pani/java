package org.shapes;
import java.lang.*;

public class triangle{
    public int a,b,c,s;
    public triangle(int n1,int n2,int n3){
        a=n1;
        b=n2;
        c=n3;
        //s=(a+b+c)/2;
    }

    public void perimeter(){
        System.out.println("Perimeter of triangle = " + (a+b+c));
    }
    public void area(){
        s=(a+b+c)/2;
        System.out.println("Area of triangle = " + ( Math.sqrt(s*(s-a)*(s-b)*(s-c)) ));
    }
}