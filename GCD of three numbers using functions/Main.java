 import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
    int n1 =in.nextInt();
    int n2 =in.nextInt();
    int n3 =in.nextInt();
   System.out.println(gcd_of_2dgts(n1,n2,n3));
  }
  public static int gcd_of_2dgts(int n1,int n2,int n3)
  {
    int res,min,gcd=0;
    if(n1>n2)
      res=n1;
    else
      res=n2;
    if(res>n3)
      min=res;
    else
      min=n3;
    
    while(min>=1)
    {
      if((n1%min==0)&&(n2%min==0))
      {
        gcd=min;
        break;
      }
      min--;
    } 
    return gcd;
 }
}
