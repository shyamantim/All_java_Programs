class Concatenation
{
	public static void main(String[] args)
        {
		  String a="Mohan";
		  String b="Sohan";
		  int x=35;
		  int y=40;
		  int z=x+y;
		  int w=x*y;
		  System.out.println(a+b);
		  System.out.println(a+b+48);
		  System.out.println ("The Sum of x & y is:"+z);
		  System.out.println("The sum of "+x+" and "+y+" is:"+z);
		  System.out.println("The multiplication of"+" "+x+" "+"and"+" "+y+" "+"is:"+w);
		  System.out.println(40+35+" is the value");//75 then concatenation with string.
		  System.out.println(40+35+" is the value "+30+52);//75 then concatenate with string and all things after string.
		  //System.out.println("The value is:"+40-22);error (The value is40)-20 data type error.
		  System.out.println(30-25+"is the value");//operation then concatenation.
		  System.out.println("the value is "+(40+38));//follow BODMAS then concatenation.
		  System.out.println("the value is "+(40*8));//follow BODMAS then concatenation.
		  System.out.println("the value is "+(40/7));//follow BODMAS then concatenation.
		  System.out.println("the value is:"+30+(60*8)+(30-5));//follow BODMAS Then concatenation.

		}
}  