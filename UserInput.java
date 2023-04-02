import java.util.Scanner;
class UserInput
{
   public static void main(String[] args)
    {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String x=sc.next();//for 1st word
	 String y=sc.nextLine();//for complete statement after x.
	 //char z=sc.next().charAt(3);//1st word 3rd place letter is not present run time error out of bound.
	 //char z=sc.nextLine().charAt(5);comple statement 5th place letter if present otherwise run time error. 
	 System.out.println("The required string is:"+x);
	 System.out.println("The required string is:"+y);
	 //System.out.println("The required string is:"+z);
	}
}	 