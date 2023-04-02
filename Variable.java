class Variable
{
    public static void main(String[] args)
       {
	     int a=12113;
		 int[] c={20,38,503,408};
		 String[] p={"Mohan","Sohan"};
		 int[] x={12,15,18};
		 String[] y={"12","Ram","28.56"};
		 System.out.println(a);//variable value.
		 System.out.println("a");//as String.
		 System.out.println('a');//as Character.
		 System.out.println('a'+10);//ASCII value+10(97+10=107).
		 System.out.println(a+10);//variable value+10(12113+10=12123);
		 System.out.println(c[0]);//20 as placed at 0 position.
		 System.out.println(c[2]);//503 as placed at 2nd position.
		 //System.out.println(c[4]);Exception:ArrayIndexOutOfBounds.
		 System.out.println(c[1]+c[3]);//38+408=446.
		 
		 System.out.println(p[1]);//Sohan as placed at 1 position.
		 System.out.println(p[0]+p[1]);//concatenation.
		 System.out.println(y[0]+y[1]);//concatenation.
		 System.out.println(y[1]+x[0]+y[2]);//concatenation.
		 System.out.println(x[0]+x[2]);//add opearation.
		 System.out.println(x[0]+x[2]+y[1]+x[1]+x[2]);//addition and then concatenation.
		 
		}
}
		 