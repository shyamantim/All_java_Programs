class LogicalOperator
{
  public static void main(String[] args)
  {
	{
	  int a=12;
	  int b=10;
	  int c=18;
	  int d=a++ + ++b + c++ - --a;
	  System.out.println(d);
	}
	{
		int a=12;
		a=a++;
		a=a++;
		a=a++;
		a=a--;
		a=a++;
		System.out.println(a);
	}
	{
		int a=12;
		a=++a;
		a=a++;
		a=++a;
		System.out.println(a);
	}
	//Logical AND Operator(&& or &)
	{
		int a=12;
		int b=20;
		System.out.println(true&& 10>5);
		System.out.println(8>5& 10>5);
		System.out.println(a++>10&&b++>10);
		System.out.println(a);
		System.out.println(b);
	}
	{
		int a=12;
		int b=20;
		System.out.println(a++>12&&b++>10);//&&b++>10 not executed as 1st is false so '&& is fast b/c skip the 2nd operand if 1st operand is false'.
		System.out.println(a);//13
		System.out.println(b);//20
	}
	{
	    int a=12;
		int b=20;
		System.out.println(a++>12&b++>10);//&b++>10 executed as 1st is false,'& is Slow b/c both operand executes.
		System.out.println(a);//13
		System.out.println(b);//21
	}
	//Logical OR Operator(||)
	{
		int a=12;
		int b=20;
		System.out.println(a++>10||b++>16);//||b++>16 not executed as 1st is true so '|| is fast b/c skip the 2nd operand if 1st operand is true'.
		System.out.println(a);//13
		System.out.println(b);//20
	}
	{
		int a=12;
		int b=20;
		System.out.println(a++>12||b++>10);
		System.out.println(a);//13
		System.out.println(b);//21
	}
	{
		int a=12;
		int b=20;
		System.out.println(++a>12|b++>10);//|b++>16  executed as 1st is true so '| is slow b/c execute both operand.
		System.out.println(a);//13
		System.out.println(b);//21
	}
  }
}
	  