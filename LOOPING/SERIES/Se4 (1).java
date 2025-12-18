import java.util.Scanner;
public class Se4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=n;i+=2){
            System.out.println(i);
        }
    }
}