import java.util.*;
class EvenOdd
{
   public static void main(String[] args)
    {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the number:");
	  int n=sc.nextInt();
	  if(n%2==0)
	  {
	    System.out.println(n+" Is an Even number");
	  }
	  else
	  {
	    System.out.println(n+" Is an Odd number");
	  }
	}
}