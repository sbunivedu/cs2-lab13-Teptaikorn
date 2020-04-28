import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordTest{
  static private TreeSet<String> set = new TreeSet<String>();

  public static void main(String[] args) throws FileNotFoundException{
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the name of the file containing the words: ");
    String filename = scan.nextLine();
    scan = new Scanner(new File(filename));
    while(scan.hasNextLine()){
      String line = scan.nextLine();
      // split line into array of words
      String[] words = line.split("\\s+");
      for(int i=0; i<words.length; i++){
        // add each word to the word set
        set.add(words[i]);
      }
    }

    System.out.println("test size()");
    System.out.println("expect:\t14484");
    System.out.println("got:\t"+set.size());
    System.out.println("test contains()");
    System.out.println("expect:\ttrue");
    System.out.println("got:\t"+set.contains("hell."));
    System.out.println("expect:\ttrue");
    System.out.println("got:\t"+set.contains("gwyne"));
    System.out.println("expect:\ttrue");
    System.out.println("got:\t"+set.contains("Shakespeare."));
    System.out.println("expect:\tfalse");
    System.out.println("got:\t"+set.contains("plays"));
    System.out.println("expect:\ttrue");
    System.out.println("got:\t"+set.contains("knowed"));
  }
}
