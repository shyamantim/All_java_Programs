class DataType
{
  public static void main(String[] args)
   {
	   byte a=112;
	   short b=32765;
	   int c=1234567898;
	   //int c=2234567890; integer number is too large>(2^31)-1 so used long type.
	   long d=2234567890L;
	   //float f=15.50;possible lossy conversion from double to float
	   float f=15.50f;
	   double g=154.50;
    System.out.println("@");   //@ as a string.
	System.out.println('@');   //@ as a character.
	System.out.println('@'+10);//64+10=74.
	System.out.println('@'+"10");//concatenation.
	System.out.println('\u0001');
	System.out.println('\u0011');
	System.out.println('\u0123');
	System.out.println('\u0011'+'\u0123');
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(f);
	System.out.println(g);
	System.out.println("a");   //@ as a string.
	System.out.println('a');   //@ as a character.
	System.out.println("a"+20);//concatenation.
	System.out.println('a'+20);//97(ASCII VALUE OF a)+20=117
	System.out.println('a'+"20");
	System.out.println(a+20);
	
	}
}