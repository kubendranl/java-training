import java.util.Scanner;
public class Se22{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;i<=num;i++){
            if(i % 10 == 7 || i % 7 == 0){
                System.out.print(i + " ");
            }
        }
    }
}