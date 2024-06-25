public class strclassesPrac {
    public static void main(String[] args) {
        System.out.println("String Class : ");
        String str = "Hello World";
        System.out.println("Original String: " + str);

        System.out.println("Lower Case : " + str.toLowerCase());
        System.out.println("Upper Case : " + str.toUpperCase());
        System.out.println("Length : " + str.length());
        System.err.println("Concat : " + str.concat(" New World"));

        StringBuffer stbuf = new StringBuffer("karan");
        System.out.println("\nString Buffer Class : ");
        stbuf.append("lol");
        System.out.println(stbuf);

        stbuf.delete(5, 8);
        System.out.println(stbuf);

        System.out.println("Length : " + stbuf.length());

        System.out.println("Char at 3rd Pos : " + stbuf.charAt(3));

        stbuf.deleteCharAt(4);
        System.out.println("Delete at index 4 : " + stbuf);

        stbuf.append("n");
        System.out.println("Append n : " + stbuf);

        stbuf.reverse();
        System.out.println("Reversed : " + stbuf);
        stbuf.reverse();
        System.out.println("Reversed : " + stbuf);

        StringBuilder stbuild = new StringBuilder("karan");
        System.out.println("\nString Builder Class : ");
        stbuild.append(" build");
        System.out.println(stbuild);

        System.out.println("charAt(4) : " + stbuild.charAt(4));
    }
}