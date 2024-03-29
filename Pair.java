public class Pair<K, V> {
  private K key;
  private V value;

  Pair(K k, V v){
    this.key = k;
    this.value = v;
  }

  public K getKey() {
    return this.key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return this.value;
  }

  public void setValue(V value) {
    this.value = value;
  }

}
