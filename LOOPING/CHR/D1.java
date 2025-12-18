import java.util.Scanner;
public class D1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        num = Math.abs(num);
        while(num>=10){
            num = num/10;
        }
        System.out.println(num);
    }
}