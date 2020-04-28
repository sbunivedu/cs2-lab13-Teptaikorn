public class Element<K,V> implements Comparable{
  private K key;
  private V value;

  public Element(K key, V value){
    this.key = key;
    this.value = value;
  }

  public int compareTo(Object obj){
    Element e = (Element)obj;
    Comparable comparableKey = (Comparable)key;
    return comparableKey.compareTo(e.key);
  }

  public K getKey(){
    return key;
  }

  public V getValue(){
    return value;
  }

  public String toString(){
    return ""+key+"->"+value;
  }
}
