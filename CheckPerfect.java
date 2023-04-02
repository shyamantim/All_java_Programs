import java.util.*;
class CheckPerfect
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the number to check perfect number: ");
	  int n=sc.nextInt();
	  int m=n;
	  int i=1;
	  int sum=0;
	  while(i<=n/2)
	  {
		  if(n%i==0)
		  {
			sum=sum+i;
		  }
        i++;
      }
	   if(sum==m)
	   {
		   System.out.println(n+" is a perfect number");
	   }
	   else
	   {
		   System.out.println(n+" is not a perfect number");
	   }
  }
}  