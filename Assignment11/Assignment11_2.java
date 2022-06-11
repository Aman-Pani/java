import java.util.*;

class repeat{
	synchronized void printLetter(String x){
		for(int i=0; i<50; i++){
			System.out.println(x);
		}
	}
}


class HelloThread extends Thread{
	repeat b;
	HelloThread(repeat b){
		this.b=b;
	}
	public void run(){
		b.printLetter("Hello");
	}
}


class HiThread extends Thread{
	repeat b;
	HiThread(repeat b){
		this.b=b;
	}
	public void run(){
		b.printLetter("Hi");
	}
}

class Assignment11_2{
	public static void main(String args[]){
		repeat letter = new repeat();
		HelloThread t1 = new HelloThread(letter);
		HiThread    t2 = new HiThread(letter);
		t1.start();
		t2.start();
	}
}