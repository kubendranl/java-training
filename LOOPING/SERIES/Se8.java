import java.util.Scanner;
public class Se8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int eve = 0;
        int odd = 0;
        for(int i=1;i<=n;i++){
           if(i%2==0){
               eve+=i;
           }
           else{
               odd+=i;
           }
        }System.out.println("Sum of Even number: " + eve);
        System.out.println("Sum of Odd number: " + odd);
    }
}