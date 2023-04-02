class Casting
  {
   public static void main(String[] args)
     {
	  int a=15;
	  double b=(double)a;
	  char x='@';
	  int y=x;
	  System.out.println(a);
	  System.out.println(b);//Widening casting.
      System.out.println(x);
	  System.out.println(y);//Widening casting print ASCII value of @.
	  double d=15.523;
	  //int e=d;Casting operator required.
	  int e=(int)d;
	  System.out.println(d);
	  System.out.println(e);//Convert double into int by casting operator.
      int p=100;
      char q=(char)p;
	  System.out.println(p);
	  System.out.println(q);//print ASCII value of p(64).
	 }
  }