import tree.LinkedBinarySearchTree;

public class TreeMap<K,V> implements Map<K,V>{
  LinkedBinarySearchTree<Element<K,V>> tree = new LinkedBinarySearchTree<Element<K,V>>();

  public boolean isEmpty(){
    //TO BE IMPLEMENTED
    if (tree.size() > 0){
       return false;
    }else{
      return true;
    }
  }

  public int size(){
    return tree.size();
  }

  // Associates the specified value with the specified key in this map.
  // If the map previously contained a mapping for the key, the old value
  // is replaced by the specified value.
  // Return the previous value associated with key, or null if there was
  // no mapping for key.
  public V put(K key, V value){
    Element<K,V> element = new Element<K,V>(key, value);
    Element<K,V> old = tree.find(element);
    tree.addElement(element);
    if (old != null){
      return old.getValue();
    }else{
      return null;
    }
  }

  // Returns the value to which the specified key is mapped,
  // or null if this map contains no mapping for the key.
  public V get(K key){
    //TO BE IMPLEMENTED
    Element<K,V> element = new Element<K,V>(key, null);
    Element<K,V> result = tree.find(element);
    if (result != null){
      return result.getValue();
    }else{
      return null;
    }
  }

  // Removes the mapping for a key from this map if it is present.
  // Returns the value to which this map previously associated the key,
  // or null if the map contained no mapping for the key.
  public V remove(K key){
    //PRE: key is not null
    //POS: the mapping with the key is removed
    //TO BE IMPLEMENTED
    Element<K,V> target = new Element<K,V>(key, null);
    Element<K,V> result = tree.find(target);
    if ( result != null){
      tree.removeElement(result);
      return result.getValue();
    }else{
      return null;
    }
  }
}
