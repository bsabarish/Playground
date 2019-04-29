import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int cr,cl;// cr_current row, cl-current colunm
  for(cr=1;cr<=n;cr++)
  {
    for(cl=1;cl<=n;cl++)
    {
      System.out.print(cr);    
    }
    System.out.println();  //    print("\n")=println()

  }
}
}