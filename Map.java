public interface Map<K,V>{
  public boolean isEmpty();
  public int size();
  public V put(K key, V value);
  public V get(K key);
  public V remove(K key);
}
