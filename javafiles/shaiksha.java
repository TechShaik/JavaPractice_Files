import java.util.Scanner;
public class shaiksha{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          System.out.println("enter input");
          int n=sc.nextInt();

            if(n%2==0 && n%5==0){
                System.out.println(" divisible number");

            }else{
                System.out.println(" not divisible number");

            }
    }
}