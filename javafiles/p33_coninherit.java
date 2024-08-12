class a {
    a(){
        System.out.println("hi");
    }
    a(int n){
        System.out.println("im a with n");
        System.out.println(n);
    }
}class b extends a{
    b(int m,int t){
        super(5);
        System.out.println("im c of b");
        System.out.println(m+t);

    }
}
public class p33_coninherit {
    public static void main(String[] args) {
    b d=new b(2,4);
}
    
}
