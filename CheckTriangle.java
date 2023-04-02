import java.util.Scanner; 
class CheckTriangle
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the 1st side: ");
	 int x=sc.nextInt();
	 System.out.print("Enter the 2nd side: ");
	 int y=sc.nextInt();
	 System.out.print("Enter the 3rd side: ");
	 int z=sc.nextInt();
	 String s=((x+y>z)&&(y+z>x)&&(x+z>y))?"These are the valid sides of triangle":"This is invalid triangle";
	 System.out.print(s);
   }
}