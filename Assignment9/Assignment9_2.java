import java.util.*;

class NameFormatException extends Exception{
	char ch;
	public NameFormatException(char ch){
		this.ch = ch;
	}
	public String toString(){
		return ("invalid name format");
	}
}
class Assignment9_2{
	static void validity(String str)throws NameFormatException{
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i)>=65 && str.charAt(i)<= 90){
            }
			else if(str.charAt(i) >= 97 && str.charAt(i)<= 122){
            }
			else{
				throw new NameFormatException(str.charAt(i));
			}
		}
		System.out.println("***Name entered contain only alphabets");
	}
	public static void main(String [] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a name :: ");
			String str = sc.nextLine();
			validity(str);
		}
		catch(NameFormatException e){
			System.out.println("***error found -> "+e);
		}
		finally{
			System.out.println("***THANK YOU***");
		}
	}
}