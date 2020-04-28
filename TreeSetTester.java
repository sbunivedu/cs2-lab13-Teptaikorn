public class TreeSetTester{
  public static void main(String[] args){
    TreeSet<String> set = new TreeSet<String>();
    set.add("one");
    set.add("two");
    set.add("three");
    set.add("four");
    set.add("five");
    set.add("six");
    set.add("seven");
    set.add("eight");
    set.add("nine");
    set.add("ten");
    set.add("one");
    set.add("two");

    System.out.println("test size()");
    System.out.println("expect:\t10");
    System.out.println("got:\t"+set.size());

    System.out.println("test add()");
    System.out.println("expect:\ttrue");
    System.out.println("got:\t"+set.add("zero"));

    System.out.println("test contains()");
    System.out.println("expect:\ttrue");
    System.out.println("got:\t"+set.contains("two"));
    System.out.println("expect:\tfalse");
    System.out.println("got:\t"+set.contains("eleven"));

    System.out.println("test remove()");
    System.out.println("expect:\ttrue");
    System.out.println("got:\t"+set.remove("nine"));
    System.out.println("expect:\tfalse");
    System.out.println("got:\t"+set.remove("what"));

    System.out.println("test size()");
    System.out.println("expect:\t10");
    System.out.println("got:\t"+set.size());
  }
}
