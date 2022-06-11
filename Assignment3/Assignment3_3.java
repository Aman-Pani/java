import java.util.Scanner;
import java.lang.*;
class Library{
	String bookName,AuthorName;
    int bookNo,NoofPages,price;
	void addBook(String n,int num,int np,int p,String na){
		bookName=n;
		bookNo=num;
		NoofPages=np;
		price=p;
		AuthorName=na;
	}
	void showBookInfo(){
		System.out.println(bookName+"\t"+bookNo+"\t"+NoofPages+
                                "\t"+price+"\t"+AuthorName);
	}
}
class Assignment3_3{
    public static void main(String args[]){
		int i,N,p,bno,nop;
		String bn,an;
		Scanner in= new Scanner(System.in);
		System.out.print("Number of books :: ");
		N=in.nextInt();
		in.nextLine();
		Library S[]=new Library[N];
		for(i=0;i<N;i++){
            System.out.println("Enter book -> " + (i+1) + " details:");
			S[i]=new Library();
			System.out.print("Book name     :: ");
			bn=in.next();
			System.out.print("Book No.      :: ");
			bno=in.nextInt();
			System.out.print("No of pages   :: ");
			nop=in.nextInt();
			System.out.print("Book price    :: ");
			p=in.nextInt();
			System.out.print("Author Name   :: ");
			an=in.next();
			in.nextLine();
			S[i].addBook(bn,bno,nop,p,an);
		}
		System.out.println("NAME    BOOKNo  NoPAGE  PRICE   AutNAME");
		for(i=0;i<N;i++)
			S[i].showBookInfo();
	}
}