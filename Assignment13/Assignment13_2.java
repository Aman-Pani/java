import java.util.*;

class Assignment13_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("INPUT  : ");
		String str = sc.nextLine();
		System.out.println("OUTPUT : "+str.replaceAll("\\s+"," "));
	}
}