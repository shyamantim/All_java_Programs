import java.util.*;
class DigitFactorial
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	
	while(n>0)
	{
		int digit=n%10;
	    int f=1;
		int i=1;
		while(i<=digit)
		{
			f=f*i;
			i++;
		}
		System.out.println(f);
		n=n/10;
	}
}
}