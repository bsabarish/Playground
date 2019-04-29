import java.util.Scanner;
class Main{
	public static void main (String[] args){
  Scanner in= new Scanner(System.in);
   int base= in.nextInt();
   int expo=in.nextInt();
   int result =power(base,expo);
   System.out.println(result);
	}
    // Function to find the sum of numbers
	public static int power(int x,int y)
	{
	    int pow = 1;
	    for(int i = 1; i<= y; i++)
	    {
	        pow = pow * x;
	    }
	    return pow;
	}
} // End of Main class
