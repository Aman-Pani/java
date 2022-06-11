import java.util.*;

class ValidDateException extends Exception{
	public ValidDateException(String s){
		super(s);
	}
}
class Assignment9_3{
	public static void main (String args[]) throws ValidDateException{
		Scanner sc = new Scanner(System.in);
		boolean isDate = false;
		System.out.print("Enter date in dd/mm/yyyy format : ");
		String date = sc.next();
		String dateFormat = "\\d{2}/\\d{2}/\\d{4}";
		try{
			isDate = date.matches(dateFormat); 
			if(isDate==true){
				System.out.println("The entered date is of correct format.");
			}
			else{
				throw new ValidDateException("ERROR: ***incorrect format!***");
			}
		}
		catch (ValidDateException e) {
			System.out.println(e.getMessage());
		}
	}
}