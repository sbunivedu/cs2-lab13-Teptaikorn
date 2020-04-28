public class TreeSet<E>{
  TreeMap<E,String> map = new TreeMap<E,String>();

  public boolean isEmpty(){
    return true;
  }

  public int size(){
    // To BE IMPLEMENTED
    return 0;
  }

  public boolean contains(E element){
    return false;
  }

  // If this set already contains the element, the call leaves the set unchanged
  // and returns false.
  // If element is not already present, the call adds the specified element
  // to this set and returns true.
  public boolean add(E element){
    Object result = map.put(element, "");
    return (result == null);
  }

  // Removes the specified element from this set if it is present.
  // Returns true if this set contained the element (or equivalently, if this set changed as a result of the call).
  // Returns false if the element is not present.
  public boolean remove(E element){
    // TO BE IMPLEMENTED
    return false;
  }
}
