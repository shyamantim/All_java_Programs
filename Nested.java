import java.util.*; 
class Nested
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the number: ");
	 int x=sc.nextInt();
	 if(x<500)
	 {
	   System.out.println("Number is less than 500");
	   if(x%7==0)
	      {
		    System.out.println(x+" is divided by 7");
		  }
		  else
		  {
		     System.out.println(x+" is not divided by 7");
		  }
	 }
      else
         {
		   System.out.println("Number is greater than or equal to 500");
		   if(x%12==0)
		   {
		     System.out.println(x+" is divisible by 12");
		   }
		   else{
		       System.out.println(x+" is not divisible by 12");
		       }
          }
   }
}   