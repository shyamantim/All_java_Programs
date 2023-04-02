class Test
 {
    static int a=10;//global variable(static).
	       int b=20;//global variable(Non static).
	public static void main(String[] args)
	  {
	    int c=30;//local variable.
		{
		System.out.println(c);
		System.out.println(a);//static variable can call directly.  
		System.out.println(Test.a);//or static variable is called  by giving class name as reference.
		Test t1=new Test(); //object creation for non static variable.
           System.out.println(t1.b);//call by object reference name.
	    }
	  int d=40;
	  System.out.println(d);
	  System.out.println(c+d);
	  }
 }