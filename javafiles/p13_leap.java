import java.util.Scanner;

public class p13_leap {
    public static void main(String args[]){
        
         Scanner sc=new Scanner(System.in);
    System.out.println("enter year:");
        int a=sc.nextInt(); 
        if(a%4==0){
            if(a%100==0){
                if(a%400==0){
                    System.out.println("leap year");
                    
                }else{
                    System.out.println("not a leap yr");
                }
                
                }
                else{
                    System.out.println("not a leap yr");
            }
             
            }
            else{
                System.out.println("not a leap year");
        }sc.close();
         
    }
    
}
