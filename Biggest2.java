//WAPJ to find biggest of two number by using conditional operator.
import java.util.Scanner;
class Biggest2
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the 1st number ");
	 int x=sc.nextInt();
	 System.out.print("Enter the 2nd number ");
	 int y=sc.nextInt();
	 String s=x>y?x+" Is the bigger number":y+" is the bigger number";
	 System.out.println(s);
	}
 }


//WAPJ to find biggest of three number by using conditional operator.
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
	 
	 


//WAPJ to find biggest of four number by using conditional operator.
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




//Take a character and check whether the character is an alphabet or not
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




//WAJP to check whether a given character is a lowercase(a to z)or not.
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



//WAJP to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
class Divisibility511
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the number: ");
	 int x=sc.nextInt();
	 String s=(x%5==0&&x%11==0)?x+"  is div by 5 and 11 both":x+"  is not div by 5 and 11 both";
	 System.out.print(s);
	}
}




//WAJP to input any alphabet and check whether it is vowel or not
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



//WAJP to take three sides of a triangle and check whether triangle is valid or not.
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
	 	 
	 