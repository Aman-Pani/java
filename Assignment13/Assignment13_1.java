import java.util.*;

class Assignment13_1{
	public static void main(String args[]){
		String days = "Sunday Monday Tuesday Wednesday Thursday Friday Saturday";
		String rev="  ";
		StringTokenizer st = new StringTokenizer(days);
		while(st.hasMoreTokens()){
			rev = st.nextToken()+" "+rev;
		}
		System.out.println("The output : "+rev);
	}
}