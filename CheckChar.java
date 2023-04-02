import java.util.Scanner;
class CheckChar
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the character ");
	 char x=sc.next().charAt(0);
	 String s=((x>'A'&&x<'Z')|(x>'a'&&x<'z'))?"This is an alphabet":"This is not an alphabet";
	 System.out.println(s);
   }
}