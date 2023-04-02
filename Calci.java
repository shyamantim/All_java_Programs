import java.util.Scanner;
class Calci
{
  public static void main(String[] args)
      {
	     
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the 1st number:");
		 int x=sc.nextInt();
		 System.out.print("Enter the 2nd number:");
		 double y=sc.nextDouble();
		 //int z=x+y;double can not be stored in int(Narrowing).
		 double z=x+y;
		 double w=x-y;
		 System.out.println("The Sum of "+x+" and "+y+" is : "+z);
		 System.out.print("The difference of "+x+" and "+y+" is : "+w);
      }		 
}