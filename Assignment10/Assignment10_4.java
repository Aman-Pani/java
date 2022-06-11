import java.util.Scanner;

class MyThread1 extends Thread{
	public void run(){
		int i;
		for(i=0;i<50;i++){
			System.out.println("X");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		int j;
		for(j=0;j<50;j++){
			System.out.println("Y");
		}
	}
}
class MyThread3 extends Thread{
	public void run(){
		int i;
		for(i=1;i<=100;i++){
			System.out.println(i);
		}
	}
}
class Assignment10_4{
	public static void main(String [] args){
		MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        MyThread3 th3 = new MyThread3();
		th1.start();
		try{
            th1.join();
        }catch(InterruptedException ie){}
		th2.start();
		try{
            th2.join();
        }catch(InterruptedException ie){}
		th3.start();
	}
}