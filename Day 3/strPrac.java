public class strPrac {
    public static void main(String[] args) {
        String str = "Hello World!"; // String literal
        String str2 = new String("Hello World!"); // String object

        System.out.println(str + str2);

        System.out.println(str2.toUpperCase());
        System.out.println(str.toLowerCase());
        
        System.out.println(str2.length());
        System.out.println(str.length());
        
        System.out.println(str.substring(0, 5));
        System.out.println(str2.substring(6, 11));
    }
}
