package edu.cnm.deepdive.dloko505.fizzbuzzandroid;

public class FizzBuzz {

  public static final int MAX_COUNT = 100;

  public static void main(String[] args) {
    for (int i = 0; i < MAX_COUNT; i++) {
      System.out.println(count(i + 1));
    }
  }

  public static String count(int i) {
    String result = "";
    if (i % 3 == 0) {
      result += "Fizz";
    }
    if (i % 5 == 0) {
      result += "Buzz";
    }
    if (result.isEmpty()) {
      result = String.valueOf(i);
    }
    return result;
  }
}
