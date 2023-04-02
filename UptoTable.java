import java.util.*;
class UptoTable
  {
    public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to print table: ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=10)
		     {
		        int table=i*j;
		        System.out.println(i+"*"+j+" = "+table);
		        j++;
			 }
			 System.out.println("====================");
			 i++;
		}
	}
  }
          		 