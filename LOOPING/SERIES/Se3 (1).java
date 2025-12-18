import java.util.Scanner;
public class Se3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=2;i<=n;i+=2){
            System.out.println(i);
        }
    }
}