
abstract class A{
    abstract void shaik();
    abstract void naz(int n);
    abstract void dad();
}

class B extends A{
    void shaik(){
        System.out.println("I'm B of class A");
    }
    void naz(int n){
        System.out.println("I'm n:" + n);
    }
    void dad(){
        System.out.println("I'm dad");
    }
}

public class 
    public static void main(String args[]) {
        A s = new B();
        s.shaik();
    }
}
