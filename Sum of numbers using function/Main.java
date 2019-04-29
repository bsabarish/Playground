
import java.util.Scanner;
class Main{

	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.print(sum_of_numbers(n)); // Function call
	}
     // Function to find the sum of numbers
	public static int sum_of_numbers(int y)
	{
	    int sum = 0;
       int i = 1;
	    while(i<= y)
	    {
	        sum = sum + i;
           i++;
	    }
	    return sum;
   
	}
}
