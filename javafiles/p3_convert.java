import java.util.Scanner;
public class p3_convert {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter km");
        double km=sc.nextDouble();
        double mile=km*0.621371;
        System.out.println(mile);
        sc.close();
        }
}
