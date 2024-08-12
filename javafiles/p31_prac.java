class emp{
    int roll;
    String name;
public void  disp(){
    System.out.println("my roll is "+roll);
    System.out.println("my name is "+name);
    
    }
}
public class p31_prac {
    public static void main(String[] args) {
        emp a=new emp();
        a.roll=90;
        a.name="shaik"; 
        a.disp(); 
          

    }
}
