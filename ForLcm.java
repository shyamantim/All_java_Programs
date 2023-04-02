import java.util.*;
class ForLcm
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
		int i;
		for(i=1; ;i++)
		{
			if(i%a==0&&i%b==0&&i%c==0)
			{
				System.out.println("LCM of "+a+","+b+" and "+c+" is :"+i);
			    break;
			}
		}
	}
  }