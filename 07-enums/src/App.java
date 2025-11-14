public class App {
    public static void main(String[] args) throws Exception {
       for(EnumSample sample : EnumSample.values()){
        System.out.println(sample );
        System.out.println(sample.ordinal() );
       }
    }

   
}
