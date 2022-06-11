import java.util.*;
class MyException extends Exception{
	int amt;
	public MyException(int amt){
		this.amt = amt;
	}
	public String toString(){
		return ("Withdrawal amount is greater than net balance");
	}
}
class Assignment9_1{
	public static void main(String [] args){
		try{
			int amount;
			int withdraw;
			Scanner in = new Scanner(System.in);
			System.out.print("Enter net balance :: ");
			amount = in.nextInt();
			System.out.print("Enter widthdrawal amount :: ");
			withdraw = in.nextInt();
			if(withdraw > amount){
				throw new MyException(amount);
			}
		}
		catch(MyException e){
			System.out.println("*error found ->"+e);
		}
		finally{
			System.out.println("***THANK YOU***");
		}
	}
}