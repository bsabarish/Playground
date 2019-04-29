import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
    int sd;
    if(n<=99)
    {
      sd=n%10;
       System.out.println(sd);
    }
   
    else if(n>=9999)
    {
    sd=((n/1000)%10);
        System.out.println(sd);
          
    }
  else
        System.out.println("no solution");
  }
}