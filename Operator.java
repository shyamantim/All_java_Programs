class Operator
{
  public static void main(String[] args)
   {
     int a=38;
	 int b=5;
	 int c=a/b;//Arithmetic operator.
	 double d=a/b;//Arithmetic operator.
	 double x=48;
	 int y=7;
	 double z=x/y;//Arithmetic operator.
	 //int w=x/y;Narrowing casting so Casting operator required.
	 int w=(int)x/y;
	System.out.println(c);//(7)
	System.out.println(d);//Widening casting.(7.0)
	System.out.println(z);//Widening casting.(6.857142857142857)
	System.out.println(w);//Narrowing.(6)
	
	int p=12;
	int q=p+30;//Assignment Operator.
	int r=p+q;//Assignment Operator.
	   
	System.out.println(p);//(12)
	System.out.println(q);//(42)
	System.out.println(r);//(54)
	
	p+=20;//p=p+20,Compound assignment/shorthand operator.
	q*=10;//q=q*10,Compound assignment/shorthand operator.
	r%=5;//r=r%5,Compound assignment/shorthand operator.
	System.out.println(p);//p=p+20(12+20=32)
	System.out.println(q);//q=q*10(42*10=420)
	System.out.println(r);//r=r%5(54%5=4)
	
	
	System.out.println(p>q);//Relational operator,32>420-false.
	System.out.println((p+q)>p-q*2);//Relational operator,452>-808-true
	System.out.println((p+q)/4==0);//Relational operator,113==0-false.
	System.out.println((p+q)%4==0);//Relational operator,0==0-true.
	System.out.println((p+q)%4!=0);//Relational operator,0!=0-false.
	
	}
}