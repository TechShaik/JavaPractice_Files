class a {
    public void s(){
        System.out.println("hi");
    }
}
class b{
    public    int s(int a,int b){
        return a+b;
    }
}

public class p30_moverload {
    public static void main(String[] args) {
       b g=new b();
          int a=  g.s(4,9);
          System.out.println(a);
    
}}