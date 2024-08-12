import java.util.Scanner;
public class p14_rockpaper {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("player1:");
        String p1=s.next();
        System.out.println("player2:");
        String p2=s.next();
       String a="rock";
       String b="paper";
       String c="scisccor";
        if(p1==a && p2==b){
            System.out.println("player 2 wins");
        }else if(p1==a && p2==c){
            System.out.println("player 1 wins");
        }else if(p1==b && p2==a){
            System.out.println("player 1 wins");
        }
        else if(p1==b && p2==c){
            System.out.println("player 2 wins");
        }
        else if(p1==c && p2==a){
            System.out.println("player 2 wins");
        }
        else if(p1==c && p2==b){
            System.out.println("player 1 wins");
        }else if(p1==p2){
            System.out.println("shit its a tie");
        }
        s.close();
    }
    
    
}
