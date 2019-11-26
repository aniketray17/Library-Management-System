package lib;
import java.util.Scanner;
public class Project{

	public static void main(String[] args) {
		char r;
	do {
		
		System.out.println("*******************Library Management System***************");
		System.out.println("Press 1 To Add To Add Book");
		System.out.println("Press 2 To Issue a book");
		System.out.println("Press 3 to return a book");
		System.out.println("Press 4 to print complete issue details");
		System.out.println("Press 5 to exit");
		
		System.out.println("Enter Your Choice...");
		Scanner obj1=new Scanner(System.in);
		int aa=obj1.nextInt();
		Library lib=new Library();
		switch(aa)
		{
		case 1:
			lib.add();
			break;
		case 2:
			lib.iss();
			break;
		case 3:
			lib.ret();
		case 4:
			lib.detail();
		case 5:
			lib.exit();
		default:
			System.out.println("Invalid Selection,Please try again");
		}
		System.out.println("Do you want to select next option :: Y/N");
		r=obj1.next().charAt(0);}
		
		while(r=='y'||r=='Y');
		if(r=='n'||r=='N') {
			System.exit(0);}
	
}
static class Library
{	static String str,b,date;
	static int a,c;
	int o;
	
	void add()
	{
		System.out.println("Enter book name,price and Book no");
		Scanner obj2=new Scanner(System.in);
		String str=obj2.nextLine();
		float price=obj2.nextInt();
		int bookno=obj2.nextInt();
		System.out.println("Your details are "+"Book Name::"+str+"\nPrice::"+price+"\nBook no::"+bookno);
	}
	
	void iss() 
	{
	Scanner obj3=new Scanner(System.in);
	System.out.println("Book Name\n");
	str=obj3.nextLine();
	System.out.println("Book Id");
	a=obj3.nextInt();
	obj3.nextLine();
	System.out.println("Issue Date");  
	b=obj3.nextLine();
	System.out.println("No of books issued");
	c=obj3.nextInt();
	obj3.nextLine();
	System.out.println("Return Book date");
	date=obj3.nextLine();
	}
	int getid()
	{
		return a;
	}
	
	void ret()
	{
		System.out.println("Enter student name and book id");
		Scanner c=new Scanner(System.in);
		String name=c.nextLine();
		int bookid=c.nextInt();
		if(a==bookid)
		{
			System.out.println("All Details");
			System.out.println("Book name:: "+Library.str);
			System.out.println("Book id:: "+Library.a);
			System.out.println("Issue date:: "+Library.b);
			System.out.println("No of books issued:: "+Library.c);
			System.out.println("Book Return Date:: "+Library.date);
		}
		else
		{
			System.out.println("Wrong details,Please try again...");
		}
		
	}
	void detail()
	{
		System.out.println("Book name:: "+Library.str);
		System.out.println("Book id:: "+Library.a);
		System.out.println("Issue date:: "+Library.b);
		System.out.println("No of books issued:: "+Library.c);
		System.out.println("Book Return Date:: "+Library.date);
	}
	void exit()
	{
		System.exit(0);
	}
}}