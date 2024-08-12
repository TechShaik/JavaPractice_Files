public class p29_factorial {
public static int favt(int n){
  if(n==0 || n==1){
return 1;

}else{
    int c= n*favt(n-1);
  return c ;
}
}

  public static void main(String[] args) {
   // p39_factorial i=new p39_factorial();
    int fact=favt(1);
      System.out.println(fact);
    
  }
    
}
 