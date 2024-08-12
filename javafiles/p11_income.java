import java.util.Scanner;
public class p11_income {
    public static void main(String args[]){
       
Scanner s=new Scanner(System.in);
System.out.println("enter income:");
int a=s.nextInt();
if(a>=250000 && a<500000){
    int b=(a*5)/100;
    System.out.println("tax is:"+b);
}else if(a>=500000 && a<1000000){
    int c=(a*10)/100;
    System.out.println("tax is:"+c);
}
    else if(a>1000000){
        int d=(a*30)/100;
        System.out.println("tax is:"+d);

    }
    else{
        System.out.println("no tax");
    }
    s.close();
}

    }
    
