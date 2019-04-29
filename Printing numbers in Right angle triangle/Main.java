import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  // To print rectangle with values l,b
  Scanner in = new Scanner(System.in);
   int n= in.nextInt(); 
   int cr,cl;// cr_current row, cl-current colunm
   for(cr=1;cr<=n;cr++)
  {
    for(cl=1;cl<=cr;cl++)     //logic is here!
    {
      System.out.print(cr);
    }
    System.out.println();
   }
  }
}