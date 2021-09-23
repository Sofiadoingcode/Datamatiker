/*
 *
 * Hvis du kompilerer programmet får du 7 fejl.
 * Kan du fixe programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 *
 */
public class Debug {
  public static void main(String[] args) {
    int a = 7, b = 42;
    int smaller = minimum(a,b);
    if (smaller == a) {
      System.out.println(a + " is the smallest!");
    }
  }
  public static int minimum(int a, int b) {
    int smaller1 = 0;
    if (a < b) {
      smaller1 = a;
    } else if (a > b) {
      smaller1 = b;
    }
    return smaller1;
  }
}
