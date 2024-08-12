 abstract class shaik{
    abstract void s();
       
    }
    class sh extends shaik{
        void s(){
            System.out.println("hi");
        }
        void shai(){
            System.out.println("im method of sh");
        }
    }
    abstract class sravs{
           void sr(){
            System.out.println("hi");

         } 
    }

public class p37_absract {
    public static void main(String[] args) {
        sh s=new sh();
        s.s();
    }
}

