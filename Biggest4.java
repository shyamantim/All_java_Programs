import java.util.Scanner;
class Biggest4
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
	 System.out.print("Enter the 4th number ");
	 int w=sc.nextInt();
	 String s=x>y?(x>z?(x>w?x+" Is the biggest number":w+" is the biggest number"):(z>w?z+" Is the biggest number":w+" is the biggest number")):
	                (y>z?(y>w?y+" Is the biggest number":w+" is the biggest number"):(z>w?z+" Is the biggest number":w+" is the biggest number"));
	 System.out.println(s);
	}
 }
	 