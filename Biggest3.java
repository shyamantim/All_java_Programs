import java.util.Scanner;
class Biggest3
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the 1st number ");
	 int x=sc.nextInt();
	 System.out.print("Enter the 2nd number ");
	 int y=sc.nextInt();
	 System.out.print("Enter the 3rd number ");
	 int z=sc.nextInt();
	 String s=x>y?(x>z?x+" Is the biggest number":z+" is the biggest number"):(y>z?y+" Is the biggest number":z+" is the biggest number");
	 System.out.println(s);
	}
 }
	 