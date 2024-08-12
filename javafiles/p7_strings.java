public class p7_strings {
    public static void main(String args[]){
        String a=("Hi I'm Java Language");
       String b=(" and oopj");
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.length());
        System.out.println(a.concat(b));
        System.out.println(a.equals(a));
        System.out.println(a.compareToIgnoreCase(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println((a.hashCode()));
        System.out.println(a.charAt(8));
        System.out.println(a.substring(4));
        System.out.println(a.substring(3,7));
        System.out.println(a.trim());
        System.out.println(a.split(""));    
    
}
}
