import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      int num = 0;
	 for(int cur_row =1; cur_row <= n; cur_row++)
	{
	 for(int cur_col=1; cur_col <= cur_row ; cur_col++)
	 {
		num = num + 1;                                //logic is here!
       if(num%2==1)              // to find & print odd number of rows ,     if(cr%2==1)---- for print even numbers
      System.out.print("*");
     else
       System.out.print("#");
	}
    System.out.print("\n");
		}
	}
}