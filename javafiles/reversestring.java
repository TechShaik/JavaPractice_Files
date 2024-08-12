class reversestring{
    public static void main(String argds[]){
        String s="shaikshavali";
        char[] arr=s.toCharArray();
        for(int i=arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }
    }

} 