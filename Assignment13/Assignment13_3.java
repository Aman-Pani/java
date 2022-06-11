import java.util.*;

class Assignment13_3{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		char ch=' ';
		System.out.print("INPUT  : ");
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++){
			if(ch==' ' && str.charAt(i)!=' ')
				sb.append(Character.toUpperCase(str.charAt(i)));
            else
                sb.append(str.charAt(i));
            ch = str.charAt(i);
		}
		System.out.println("OUTPUT : "+sb);
	}
}