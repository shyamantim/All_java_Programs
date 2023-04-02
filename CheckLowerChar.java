import java.util.Scanner;
class CheckLowerChar
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the character ");
	 char x=sc.next().charAt(0);
	 String s=(x>'a'&&x<'z')?"This is a lowercase character":"This is not a lowercase character";
	 System.out.println(s);
   }
}