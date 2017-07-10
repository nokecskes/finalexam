import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SplitStringTest {

  SplitString splitString = new SplitString();

  @Test
  public void splitWordWithOddNumberLenght() {
    List<String> expectedList = new ArrayList<>();
    expectedList.add("he");
    expectedList.add("ll");
    expectedList.add("o");
    assertEquals(expectedList, splitString.splitString("hello"));
  }

  @Test
  public void splitWordWithEvenNumberLenght() {
    List<String> expectedList = new ArrayList<>();
    expectedList.add("ex");
    expectedList.add("am");
    assertEquals(expectedList, splitString.splitString("exam"));
  }



}