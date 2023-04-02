import java.util.*;
class CheckWhile
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Main method starts");
	System.out.println("Enter the number number upto which print");
	int n=sc.nextInt();
	int i=1;
	while(i<=n)
	  {
	    System.out.println("Java Program :"+i);
		i++;
	  }
	  System.out.println("End of the Program");
  }
}