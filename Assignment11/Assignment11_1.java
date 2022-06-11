import java.util.*;

class repeat{
	synchronized void printLetter(String x){
		for(int i=0; i<100; i++){
			System.out.println(x);
		}
	}
}
//443 074 843
class AThread extends Thread{
	repeat l; 
	AThread(repeat l){
		this.l=l;
	}
	public void run(){
		l.printLetter("A");
	}
}

class BThread extends Thread{
	repeat l;
	BThread(repeat l){
		this.l=l;
	}
	public void run(){
		l.printLetter("B");
	}
}

class Assignment11_1{
	public static void main(String args[]){
		repeat letter = new repeat();
		AThread t1 = new AThread(letter);
		BThread t2 = new BThread(letter);
		t1.start();
		t2.start();
	}
}
