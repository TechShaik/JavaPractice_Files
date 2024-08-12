import java.util.Scanner;
public class p26_ispresent {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[]std={78,54,89,45,54,78};
        for(int i:std){
        if(a==i){

        
            System.out.println("present");
        }else{
           System.out.println("not present");
        }s.close();
        
    }
    
}}
