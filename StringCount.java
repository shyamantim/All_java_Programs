import java.util.Scanner;
class StringCount
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s=sc.nextLine();
		int i=0;
		int count1=0;
		int count2=0;
		System.out.println("Entered string is: "+s);
		System.out.println("Length of the String is: "+s.length());
		while(i<s.length())
		{
			if(s.charAt(i)!=' ')
			{
				count1++;
			   if(s.charAt(i)=='@')
			   {
			    count2++;	
			   }
			}
			
			i++;
		}
		System.out.println("Number of character in the string is: "+count1);
		System.out.println("Number of @ in the string is: "+count2);
    }
}
	