import java.util.*;
class WhileAssignment
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int n=sc.nextInt();
	int i=1;
	int f=1;
	while(i<=n)
	{
		f=f*i;
		i++;	
	}
	System.out.println("Factorial is: "+f);
  }
}
