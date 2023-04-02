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
	 