class a{
    private int a;
    private String name;
    void setA(int n){
        a=n;
    }
    void setName(String s){
        
name=s;
    }

void getA(){
  System.out.println(a);
}
void  getName(){
    System.out.println(name);
}
}

public class p34_prac{
    public static void main(String[] args) {
        a c=new a();
        c.setA(556);
        c.setName("shaiksha");
        c.getA();
        c.getName();

        
    }
    
}
