// Create a function that takes a string and splits it to a list of two character strings
// like: "abcdef" becomes ["ab", "cd", "ef"]

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitString {

  public static void main(String[] args) {
    String toSplit = askUserInput();
    List<String> splittedWord = splitString(toSplit);
    System.out.println(splittedWord.toString());
  }

  public static String askUserInput() {
    System.out.println("Please give me a word:");
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    return word;
  }

  public static List<String> splitString(String toSplit) {
    List<String> splittedWord = new ArrayList<>();
    for (int i = 0; i < toSplit.length(); i += 2) {
      String substring = "";
      if (i + 2 >= toSplit.length()) {
        substring = toSplit.substring(i);
      } else {
        substring = toSplit.substring(i, i + 2);
      }
      System.out.println(substring);
      splittedWord.add(substring);
    }
    return splittedWord;
  }

}
