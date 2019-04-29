import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int sum = 0,r,temp,count=0,c;
   temp=n;
   while(n>0)
   {
        r=n%10;
         c=r*r*r;
         sum=sum+c;
         n=n/10;
  }
   n=temp;
   if(n==sum)
   System.out.println("Armstrong Number");
   else
    System.out.println("Not a Armstrong Number");
 
  }
}