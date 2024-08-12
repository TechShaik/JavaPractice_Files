import java.util.Scanner;
class p2_inp_per{
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
int sub_tot=(maths+eng+tel+science+social);
int tot=((sub_tot)/500)*100;
//int fin=tot*100;
System.out.println("percentage:");
System.out.println(tot);
s.close();

}
}