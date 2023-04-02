
import java.util.Scanner;
class CheckVowel
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the a character: ");
	 char x=sc.next().charAt(0);
	 String s=(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')?"This is  a vowel":"This is not a vowel"; 
	 System.out.print(s);
	}
}
	 