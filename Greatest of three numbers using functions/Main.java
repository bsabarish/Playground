 import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
    int n1 =in.nextInt();
    int n2 =in.nextInt();
    int n3 =in.nextInt();
   System.out.println(greatest_of_3dgts(n1,n2,n3));
  }
  public static int greatest_of_3dgts(int n1,int n2,int n3)
  {
    int great,res;
    if(n1>n2)
      res=n1;
    else
     res=n2;
  if(res>n3)
      {
        great=res;
       
      }
    else
      great=n2;
   return great;
 }
}