 import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int count = 1;
   int temp;
   for(temp=1;temp <= n;temp=temp+1)
   {
     if (count % 2 == 1)
     {
       System.out.println(count);
      
     }
      count=count+1;
   }
     
 }
}