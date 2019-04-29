import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fdgt=n/10;
      int sdgt=n%10;
      System.out.println(fdgt+sdgt);
	}
}