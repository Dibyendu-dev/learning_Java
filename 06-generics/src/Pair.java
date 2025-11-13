public class Pair<K,V> {
    private K key;
    private V value;

    public void put(K key, V value){
        this.key = key;
        this.value = value;
        System.out.println("key: " +key + " value: " + value);
    }

    public static void main(String[] args) {
        Pair<String,Integer> pairObj=new Pair<>();
        pairObj.put("ddas", 001);
    }
}
