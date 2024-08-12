import java.util.Scanner;
public class p10_ex {
    public static void main(String args[]){
         
            Scanner sc=new Scanner(System.in);
            System.out.println("a:");
            float a=sc.nextFloat();
            System.out.println("b:");
            float b=sc.nextFloat();
            System.out.println("c");
            float c=sc.nextFloat();
            float d=((a+b+c)/300)*100;
            if(d>=33 && d>=40){
                System.out.println("passed ");}
    
                 else{
                    System.out.println("failed");
                }
                sc.close();
                }
            }
    
    

