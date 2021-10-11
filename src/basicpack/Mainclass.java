package basicpack;

import java.util.Scanner;

//Author class
class author
{
	void a_details() 
	{
		System.out.println("Welcome to our Libary!....");
		Scanner sc=new Scanner(System.in);
		String a_name;
		System.out.println("Enter Author name:");
		a_name=sc.nextLine();
		switch(a_name)
		{
		case "Kalki":
			System.out.println("Book:Ponniyin selvan");
			System.out.println("Total books available:5");
			System.out.println("Available:3");
			break;
		case "Elangovan":
			System.out.println("Book:Silapthigaram");
			System.out.println("Total books available:25");
			System.out.println("Available:21");
			break;
		case "William S":
			System.out.println("Book:Romeo Juliet");
			System.out.println("Total books available:56");
			System.out.println("Available:32");
			break;
		case "Sangeetha":
			System.out.println("Book:Mahanadhi");
			System.out.println("Total books available:40");
			System.out.println("Available:19");
			break;
		case "APJ":
			System.out.println("Book:Wings of fire");
			System.out.println("Total books available:67");
			System.out.println("Available:30");
			break;
	    default:System.out.println("Oops!Give available author name.."); 
	   
	 
		}
			
	}
}

//User login to access the book details and renewal
class userAccount extends author{
	

	void user()
	{
		Scanner sc=new Scanner(System.in);
		String username;
		
		System.out.println("Enter your name:");
		username=sc.nextLine();
		
		switch(username)
		{
		
		case "CS0033":
			String password;
			System.out.println("Enter your password:");
			password=sc.nextLine();
			if(password.equals("cse23"))
			{    
				System.out.println("Book you received:Ponniyin Selvan");
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				super.a_details();
				
			}
			else
			{
				System.out.println("Not an valid password");
			}
			break;
			
		case "EC0023":
			
			System.out.println("Enter your password:");
			password=sc.nextLine();
			if(password.equals("eee23"))
			{    
				System.out.println("Book you received:Romeo Juliet");
				System.out.println("Total renewed:1");
				System.out.println("Last date for return:2-10-2020");
				super.a_details();
				
			}
			else
			{
				System.out.println("Not an valid password");
			}
		    break;
		  default:System.out.println("Oops!enter your username correctly !.."); 
		}
		fine f=new fine();
		f.fineCalculate();
		
	}
	
	
} 

//both admin and user can count fine and access this class
 
class fine
 {
	 void fineCalculate()
	 
	 {
       Scanner sc=new Scanner(System.in);
       int fine;
       int delaydays;
       System.out.println("Enter delayed days:");
       delaydays=sc.nextInt();
       if(delaydays<7) 
       {
    	  fine=delaydays*1;
    	  System.out.println("Your fine is:" +fine);
       }
       else if(delaydays <14 && delaydays>7 )
       {
    	   fine=delaydays*3;
    	   System.out.println("Your fine is:" +fine);
       }
       
       else {
    	   
    	   fine=delaydays*5;
    	   System.out.println("Your fine is:" +fine);
       }
	 }
	 
 }






//book class-admin only access this class

class book 
{
 void bookdetails()
 
	{
		Scanner sc=new Scanner(System.in);
		String b_name;
		System.out.println("Enter book name:");//If you give book name
		b_name=sc.nextLine();
		switch(b_name)
		{
		case "Ponniyin selvan":
		
			//know the details of book 
			
			System.out.println("Total stocks:5");
			System.out.println("Available:3");
			System.out.println();
			String lib_no;
			
			//If we want to know who taking this book
			
			System.out.println("Enter student lib_no:");
			lib_no=sc.nextLine();
			switch(lib_no)
			{
			case "CS0033" :
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				break;
			case "EE0023":
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				break;
			
			 default:System.out.println("Oops!Give responsible student id.."); 
			}
			break;
			
		
		case "Silapthigaram":
		
			System.out.println("Total stocks:3");
			System.out.println("Available:2");
			System.out.println("");
			String lib_no1;
			System.out.println("Enter student lib_no:");
			lib_no1=sc.nextLine();
			switch(lib_no1)
			{
			case "CS0033" :
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				break;
			case "EE0023":
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				break;
			
			 default:System.out.println("Oops!Give responsible student id.."); 
			}
			break;
		case "Romeo Juliet":
		
			System.out.println("Total stocks:56");
			System.out.println("Available:32");
			System.out.println("");
			String lib_no11;
			System.out.println("Enter student lib_no:");
			lib_no11=sc.nextLine();
			switch(lib_no11)
			{
			case "CS0035" :
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				break;
			case "EC0023":
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				break;
			
			 default:System.out.println("Oops!Give responsible student id.."); 
			}
			break;
		case "Mahanadhi":
			
			System.out.println("Total stocks:40");
			System.out.println("Available:19");
			System.out.println("");
			String lib_no2;
			System.out.println("Enter student lib_no:");
			lib_no2=sc.nextLine();
			switch(lib_no2)
			{
			case "CS0023" :
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				break;
			case "EE0012":
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				break;
			
			 default:System.out.println("Oops!Give responsible student id.."); 
			}
			break;
			
			
		case "Wings of fire":
			
			System.out.println("Total stocks:67");
			System.out.println("Available:30");
			
			String lib_no3;
			System.out.println("Enter student lib_no:");
			lib_no3=sc.nextLine();
			switch(lib_no3)
			{
			case "CS0033" :
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				break;
			case "EE0023":
				System.out.println("Total renewed:2");
				System.out.println("Last date for return:23-10-2020");
				break;
			
			 default:System.out.println("Oops!Give responsible student id.."); 
			}
			break;
			
			//Not match means 
			
	    default:System.out.println("Oops!Give available book name.."); 
	   
	 
		}
	}	
		
}

// role authentication 
class role extends author
   {
	Scanner sc=new Scanner(System.in);
	void a_details()
	{
		String role;
		System.out.println("Enter your role:");
		role=sc.nextLine();
		
		//Checks the role
		
		if(role.equals("Admin"))
		{
			super.a_details();//access author details
			
			book b1=new book();//access book's entire details
			b1.bookdetails();
			fine f=new fine();
			f.fineCalculate();
			
		}
		
		else // u r not an admin your a user 
		{
			System.out.println("Access denied you are not an Admin Give your user name below");
			
			// access the user class
			userAccount u= new userAccount();
			u.user();	
			
			
		}
		
	}
}


public class Mainclass {

	public static void main(String[] args)
	{
		
	      role r=new role();
	      r.a_details();
		
		
		
		}
	

}
