import java.util.*;
class Grade
{
   public static void main(String[] args)
    {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the Maths mark:");
	  int n1=sc.nextInt();
	  System.out.print("Enter the Science mark:");
	  int n2=sc.nextInt();
	  System.out.print("Enter the Social Science mark:");
	  int n3=sc.nextInt();
	  System.out.print("Enter the English mark:");
	  int n4=sc.nextInt();
	  System.out.print("Enter the Hindi mark:");
	  int n5=sc.nextInt();
	  int n=(n1+n2+n3+n4+n5);
	  int p=n*100/500;
	  System.out.println("Total Marks Obtained is: "+n);
	  System.out.println("Total Marks Percentage is: "+p);
	  if(p>90)
	  {
	     System.out.println("You are in Grade A++");
	  }
	  else if(p>75)
	      {
	      System.out.println("You are in Grade A+");
	      }
	       else if(p>60)
		    {
		    System.out.println("You are in Grade A");
		    }
		     else if(p>45)
		     {
              System.out.println("You are in Grade B");
             }
              else if(p>30)
               {
               System.out.println("You are in Grade C");
               }
			    else 
				{
				 System.out.println("You are in Grade D");
				}
              			 
	}
}