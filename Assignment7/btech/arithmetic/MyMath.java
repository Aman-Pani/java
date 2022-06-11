package btech.arithmetic;
import java.lang.*;

public class MyMath{
    public int a,b;
    public MyMath(int n1,int n2){
        a=n1;
        b=n2;
    }
    public void disply(){
        System.out.println("num1+num2= " + (a+b));
        System.out.println("num1-num2= " + (a-b));
        System.out.println("num1*num2= " + (a*b));
        System.out.println("num1/num2= " + (a/b));
        System.out.println("num1%num2= " + (a%b));
    }
}