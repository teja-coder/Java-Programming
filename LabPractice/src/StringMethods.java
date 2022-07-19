public class StringMethods {
    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println(s.length());
        System.out.println(s.equals("Java"));
        System.out.println(s.contains("Java"));
        System.out.println(s.replace(' ','#'));
        System.out.println(s.substring(0,4));
        System.out.println(s.concat("Python"));
        System.out.println(s.indexOf('P'));
        System.out.println(s.charAt(5));
        s = "     Java";
        System.out.println(s.strip());
        s = "";
        System.out.println(s.join(" ","Python","Java","C++"));
    }
}
