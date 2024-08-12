import java.util.Scanner;
public class p5_inte {
    public static void main(String args[]){
        
        Scanner cc=new Scanner(System.in);
        System.out.println("enter int:");
        if(cc.hasNextInt()){
            System.out.println("is integer");
        }else{
            System.out.println("not an int");
            cc.close();
        }
    }
    
}
