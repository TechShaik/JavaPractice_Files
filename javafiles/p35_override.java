class s{
    public void  a(){
        System.out.println("im a of s");

    }
}
class b extends s{
    public void a(){
        System.out.println("im a of b");
    }
    public void k(int n){
        System.out.println("im s of b");

    }

}
public class p35_override {
    public static void main(String[] args) {
       // s d=new s();
          //d.a();
          b c=new b();
          c.k(8);
          c.a();
   
    }
    
}
