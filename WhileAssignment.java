import java.util.*;
class WhileAssignment
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int n=sc.nextInt();
	int i=2;
	int count=0;	
	  while(i<=n/2)   //(i<n)
	       {
		     if(n%i==0)
		      {
		        count++;
		      }
		     i++;
	       }
		
	        if(count==0)
	        {
	         System.out.println(n+" is a prime number");
	        }
	        else 
	         {
	         System.out.println(n+" is not a prime number");
	         }
	 }
}
