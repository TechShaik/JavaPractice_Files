public class p22_factwhile {
    public static void main(String[] args) {
        int n=5;
        int sum=1;
        int i=n;
        while(i>0){
            sum*=i;
            //System.out.println(sum);
            i--;
        }
        System.out.println(sum);
    }
    
}
