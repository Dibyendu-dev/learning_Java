public class data {
    public static void main(String args[]) {
            // char a = 88;
            char a = 'a';
            String mess ="Hello world";
            System.out.println(a);
            System.out.println(mess);
            String s1 = "ddas";
            String s2 = "ddas";
            String s3 = new String("ddas");
             
            // string content pool
            System.out.println(s1==s2);
            System.out.println(s1.equals(s2));
            
            System.out.println(s1==s3);
            System.out.println(s1.equals(s3));
    }
}