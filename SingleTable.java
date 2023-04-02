import java.util.*;
class SingleTable
  {
    public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print table");
		int n=sc.nextInt();
		int i=1;
		
		System.out.println("The table of "+n+" is: ");
		while(i<=10)
		{
		 int table=i*n;
		 System.out.println(n+"*"+i+" = "+table);
		 i++;
		}
	}
  }
          		 