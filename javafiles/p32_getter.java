class shaik{
    private int roll;
    private String name;
    public void getRoll(){
        System.out.println("my roll is "+this.roll);;
    }
    public void setRoll(int n){
        roll=n;
    }
    public void getName(){
        System.out.println("my name is "+name);
    }
    public void setName(String s){
        name=s;

    }
}


public class p32_getter {
    public static void main(String[] args) {
        
    
    shaik a=new shaik();
    a.setName("shaiksha");
    a.getName();
    }
    
}
