import java.util.Scanner;
public class Se24{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;i<=num;i++){
            if(i>0 && ((i&(i-1)) == 0)){
                System.out.print(i +" "); 
            }
        }
    }
}