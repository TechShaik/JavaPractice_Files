class phone{
    void p(){
        System.out.println("im old version mobile ");
    }
}
class sphone extends phone{
    void p(){
        System.out.println("im old version of s");
    }
    void sp(){
        System.out.println("im new version mobile");
    }

}
public class p36_dynamic_m_dis {
    public static void main(String[] args) {
        
    phone d=new sphone() ;
      d.p();
}}
