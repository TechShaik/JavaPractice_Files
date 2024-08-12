class animal{
void s(){
    System.out.println("im s of animal");
}
}class dog extends animal{

    void sh(){  
        
        System.out.println("im sh of dog");
        
    }
}
public class p33_inherit {
    public static void main(String[] args) {
        dog d=new dog();
        d.sh();
        animal a= new animal();
        a.s ();

    }
}
