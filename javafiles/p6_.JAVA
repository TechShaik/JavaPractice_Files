import java.util.Scanner;
class p6_percentage{
    public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter maths marks:");
int maths=s.nextInt();
System.out.println("enter eng marks:");
int eng=s.nextInt();
System.out.println("enter tel marks:");
int tel=s.nextInt();
System.out.println("enter science marks:");
int science=s.nextInt();
System.out.println("enter social marks:");
int social=s.nextInt();
int sub_tot=((maths+eng+tel+science+social)/500)*100;
System.out.println(sub_tot);}}