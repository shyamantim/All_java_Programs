import java.util.*;
class ForHcf
  {
    public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd number: ");
		int c=sc.nextInt();
		//int i;
		if(a>b&&a>c)
		{
		 for(int i=a;i>0;i--)
		 {
			if(a%i==0&&b%i==0&&c%i==0)
			{
				System.out.println("HCM of "+a+","+b+" and "+c+" is :"+i);
			     break;
			}
		 }
		}
		else if(b>c)
		{
			for(int i=b;i>0;i--)
		 {
			if(a%i==0&&b%i==0&&c%i==0)
			{
				System.out.println("HCM of "+a+","+b+" and "+c+" is :"+i);
			     break;
			}
		 }
		}
		else
		{
			for(int i=c;i>0;i--)
		 {
			if(a%i==0&&b%i==0&&c%i==0)
			{
				System.out.println("HCM of "+a+","+b+" and "+c+" is :"+i);
			    break;
			}
		 }
		}
	}
  }