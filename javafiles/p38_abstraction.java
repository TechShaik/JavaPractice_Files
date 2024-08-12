abstract class animal{
    abstract void eat();
}
class dog extends animal {
   void eat(){
    System.out.println("dog eats in streets.....");
   }
}
class lion extends animal{
    void eat(){
        System.out.println("lion eats by hunting......");
}
}
class p38_abstraction{
    public static void main(String[] args) {
        dog d =new dog();
        lion l=new lion();
        d.eat();
        l.eat();

    }
}