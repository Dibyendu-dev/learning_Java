public class Print<T> {
    T value;

    public T getValue(){
        System.out.println("value is: "+ value);
        return value;
    }

    public void setValue(T value){
        this.value =value;
    }
}
