import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	// @Test 
	// public void testReverseInPlace() {
  //   int[] input1 = { 3 };
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{ 3 }, input1);
	// }

  // @Test 
  // public void test2ReverseInPlace(){
  //   int[] input2 = {2,4,3,5};
  //   ArrayExamples.reverseInPlace(input2);
  //   assertArrayEquals(new int[]{5,3,4,2}, input2);
  // }

  @Test 
    public void test2Reversed() {
    int[] input2 = {1,2,3 };
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

}
