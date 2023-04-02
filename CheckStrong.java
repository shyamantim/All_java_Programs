import java.util.*;
class CheckStrong
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int m=n;
	int sum=0;
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
		sum=sum+f;
		n=n/10;
	}
	if(m==sum)
	{
		System.out.println("Entered number is a Strong ");
	}
	else
	{
	System.out.println("Entered number is not a Strong ");
	}	
}
}