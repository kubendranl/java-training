import java.util.Scanner;
public class Se23{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=10;i<=num;i++){
            int temp = i;
            int sum;
            while(temp>9){
                sum =  0;
                while(temp > 0){
                sum+=temp%10;
                temp=temp/10;
            }
             temp = sum ;
            }
            if(temp == 1)
            System.out.print(i + " " );
        }
    }
}