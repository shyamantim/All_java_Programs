import java.util.*;
class SumDigitFactorial
{
public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0;
while(n>0)
{
 int digit=n%10;
 int f=1;
 int i=1;
 
 while(i<=digit)
 {
 f=f*i;
 i++;
 }
 System.out.println(f);
 sum=sum+f;
 n=n/10;
}
System.out.println(sum);
 }
}