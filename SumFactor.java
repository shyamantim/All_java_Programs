import java.util.*;
class SumFactor
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the number to sum its factor: ");
	  int n=sc.nextInt();
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
	  System.out.print("Sum of factors of the number "+n+" is: "+sum);
  }
}  