import java.util.*;
 class Upper
 {
   public static void main(String[] args)
     {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the number:");
	  int x=sc.nextInt();
	  String s=(x%2==0)?x+" is an Even number":x+" is an odd number";
	  System.out.println(s);
	 }
}
	  
	  
	  