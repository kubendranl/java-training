import java.util.Scanner;
public class Se20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 2;i<=num;i++){
		     int c = a + b;
		     System.out.print(a  + " ");
		     a = b;
		     b = c;
		} 
	}
}