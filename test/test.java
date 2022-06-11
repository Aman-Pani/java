import java.lang.*;
import org.shapes.*;

class test{
    public static void main(String[] args){
        circle m1= new circle(5);
        m1.area();
        m1.perimeter();

        square m2= new square(6);
        m2.area();
        m2.perimeter();

        triangle m3= new triangle(5,12,13);
        m3.area();
        m3.perimeter();
    }
}