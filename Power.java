import java.util.*;
class WhileAssignment
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number to add the digit:");
	int n=sc.nextInt();
	int sum=0;
	while(n>0)
	{
	  int digit=n%10;
	    if(digit%2!=0)
		{
	       sum=sum+digit;
		}
		n=n/10;	
	}
	System.out.println("Sum of digits is which are odd: "+sum);
  }
}
