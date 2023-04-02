import java.util.*;
class SumDigitFactorial
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int x;
	  do
	  {
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int sum=0;
	do
	{
		int digit=n%10;
		int f=1;
		int i=1;
 
	   do
		{
			f=f*i;
			i++;
		}while(i<=digit);
			//System.out.println(f);
			sum=sum+f;
			n=n/10;
	}while(n>0);
	   System.out.println("Sum of factorial of the digit of the number is: "+sum);
	   System.out.print("Press 1 for continue or any other key to stop:");
	   x=sc.nextInt();
    }while(x==1);
     System.out.println("Program Ends.");
	}
}