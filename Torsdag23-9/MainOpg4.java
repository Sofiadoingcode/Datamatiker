import java.util.Arrays;
public class MainOpg4 {
  public static void main(String[] args) {
    int[] intArray = {2, 1, 5, 3};
    String[] stringArray = {"Karl", "Sofie", "Katrine", "Simone"};
    boolean[] booleanArray = {true, false, false, false};

    printStrings(stringArray);
    System.out.println(addIntegers(intArray));
    System.out.println(averageIntegers(intArray));

  }

  public static void printStrings(String[] newStringArray) {
    for(int i = 0; i<newStringArray.length; i++) {
      System.out.println(newStringArray[i]);
    }
  }

  public static int addIntegers(int[] newIntArray) {
    int total = 0;
    for(int i = 0; i<newIntArray.length; i++) {
      total += newIntArray[i];
    }
    return total;

  }

  public static float averageIntegers(int[] newArray) {
    float total = 0;
    float average = 0;
    for(int i = 0; i<newArray.length; i++) {
      total += newArray[i];
    }
    average = total/newArray.length;
    return average;
  }

// SORT ARRAY
public static int[] sortNumbers (int[] newArray) {
  Arrays.sort(newArray);
  return newArray;
}

}
