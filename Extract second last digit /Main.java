import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ldgt=n/10;
      int sldgt=ldgt%10;
      System.out.println(sldgt);
	}
}