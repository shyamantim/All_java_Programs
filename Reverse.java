import java.util.*;
class Reverse
{
  public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the number to reverse:");
	   int n=sc.nextInt();
	   int digit=0;
	   int i=1;
	   while(n>0)
	   { 
         i=n%10;
		 digit=digit*10+i;
		 n=n/10;
	   }
	   System.out.println("Reverse Number will be: "+digit);
   }
}
		 
		   