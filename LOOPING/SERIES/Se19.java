import java.util.Scanner;
public class Se19{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;i<=num;i++){
            int sum = 0;
        for(int j=1;j<=i/2;j++){
            if(i%j == 0){
                sum+=j;
            }
        }
            if(sum == i && i != 0){
                System.out.print(i + " ");
            }
        }
    }
}