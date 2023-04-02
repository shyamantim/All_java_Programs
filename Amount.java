import java.util.*;
class Amount
{
   public static void main(String[] args)
    {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter Price of 1st item:");
	  int n1=sc.nextInt();
	  System.out.print("Enter Price of 2nd item:");
	  int n2=sc.nextInt();
	  System.out.print("Enter Price of 3rd item:");
	  int n3=sc.nextInt();
	  int n=n1+n2+n3;
	  System.out.println("Total Price is: "+n);
	  if(n>=10000)
	  {
	     System.out.println("Total Discount is 40%");
		 System.out.println("You have to pay:"+n*0.60);
	  }
	  else if(n>=6000)
	  {
	    System.out.println("Total Discount is 30%");
	    System.out.println("You have to pay:"+n*0.70);
	  }
	    else if(n>=3000)
		{
		  System.out.println("Total Discount is 20%");
	      System.out.println("You have to pay:"+n*0.80);
		}
		else
		{
          System.out.println("Total Discount is 8%");
	      System.out.println("You have to pay:"+n*0.92);
        }		  
	}
}