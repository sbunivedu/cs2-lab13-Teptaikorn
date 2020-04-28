public class TreeMapTester{
  public static void main(String[] args){
    TreeMap<String,String> map = new TreeMap<String,String>();
    map.put("eins", "one");
    map.put("zwei", "two");
    map.put("drei", "three");
    map.put("vier", "four");
    map.put("fuenf", "five");
    map.put("sechs", "six");
    map.put("sieben", "seven");
    map.put("acht", "eight");
    map.put("neun", "nine");
    // add a duplicate key
    map.put("neun", "nine");

    System.out.println("test size()");
    System.out.println("expect:\t9");
    System.out.println("got:\t"+map.size());

    System.out.println("test get()");
    System.out.println("expect:\ttwo");
    System.out.println("got:\t"+map.get("zwei"));

    System.out.println("expect:\tnine");
    System.out.println("got:\t"+map.get("neun"));

    System.out.println("test remove()");
    System.out.println("expect:\tnine");
    System.out.println("got:\t"+map.remove("neun"));
    System.out.println("expect:\tnull");
    System.out.println("got:\t"+map.remove("what"));
  }
}
