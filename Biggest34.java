import java.util.*;
class CheckLeapYear
 {
   public static void main(String[] args)
    {  
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the a year: ");
      int n=sc.nextInt();
	  if(n%100!=0)
	  {
		  System.out.println(n+" is a normal year");
		  if(n%4==0)
		  {
			System.out.println(n+" is a leap year");  
		  }
		  else
		  {
			System.out.println(n+" is not a leap year");
		  }
	  }
	  else
	  {
		 System.out.println(n+" is a century year");
		 if(n%400==0)
		 {
			 System.out.println(n+" is a leap year");
		 }
		 else
		 {
			 System.out.println(n+" is not a leap year");
		 }
	  }
	}
 }
		 
	 