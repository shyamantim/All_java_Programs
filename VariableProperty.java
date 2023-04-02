class VariableProperty
{
	static int a;
	static double b;
	static String z;
    int c;//Non static variable
	
		public static void main(String[] args)
         {	
			{
			int d;
			int e=30;
			int f=60;
			//int e=40;error already e is initialized 
			System.out.println(a);//o/p as default value of integer=0.
			System.out.println(b);//o/p as default value of double=0.0
			System.out.println(z);//o/p as default value of String=null.
			VariableProperty v1=new VariableProperty();
			System.out.println(v1.c);
			//System.out.println(d);Error as d is not initialized.local variable must be initialized.
			a=10;
			System.out.println(a);//can update the value of the variable.
			a=45;
			System.out.println(a);
           }
		   {
			 int e=40;
			 System.out.println(e);//same variable can be initialized outside the block.
			 //System.out.println(f);//a variable is accessible only inside the same block.
		   }
		   System.out.println(a);
		 }
} 