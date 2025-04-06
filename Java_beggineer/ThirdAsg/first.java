
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class first {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "Apple");
        Pair<String, Double> p2 = new Pair<>("Price", 99.99);
        Pair<String, String> p3 = new Pair<>("Username", "Pratik");

        System.out.println("Pair 1: " + p1.getKey() + " => " + p1.getValue());
        System.out.println("Pair 2: " + p2.getKey() + " => " + p2.getValue());
        System.out.println("Pair 3: " + p3.getKey() + " => " + p3.getValue());
    }
}
