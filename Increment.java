class Increment
{
   public static void main(String[] args)
   {
	 {
	   int a=12;
	   int b=a++;
	   b++;
	   int c=a+++--b;
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
	 }
	 {
	  int a=10;
	  a++;
	  int b=++a;
	  int c=(a++)+(++b);
	  b++;
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	 }
	 {
     int x=12;
	 int y=x++ + ++x;
	 y++;
	 int z=++y;
	 int p=x++ - ++y + z++;
	 System.out.println(x);
	 System.out.println(y);
	 System.out.println(z);
	 System.out.println(p);
	}
	{
		int a=12;
		int b=++a;
		b++;
		int c=a++ + --b;
		int d=a++ + ++b+c++;
		d++;
		c--;
		System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
		System.out.println(d);
	}
	{
		int a=12;
		a++;
		++a;
		int b=a++;
		b++;
		int c=a++ + --b;
		c--;
		--b;
		int d=++a+b++ + --c;
		System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
		System.out.println(d);
	}
   }
}
	   