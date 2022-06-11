import java.lang.*;
abstract class Shape{
	Shape(){
	}
	abstract void draw();
	abstract void erase();
}
class Circle extends Shape{
	Circle(){
	}
	void draw(){
		System.out.println("Drawing Circle");
	}
	void erase(){
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape{
	Triangle(){
	}
	void draw(){
		System.out.println("Drawing Triangle");
	}
	void erase(){
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	Square(){
	}
	void draw(){
		System.out.println("Drawing Square");
	}
	void erase(){
		System.out.println("Erasing Square");
	}	
}
class Assignment6_3{
	public static void main(String[] args){
		Shape s1,s2,s3;
		
		s1 = new Circle();
		s1.draw();
		s1.erase();
		
		s2 = new Triangle();
		s2.draw();
		s2.erase();
		
		s3 = new Square();
		s3.draw();
		s3.erase();
	}
}