public class Main {

public static void main(String[] args) {
  emptyLine();
  printString("Hello Hest");
  printNameAge("Sofia", 19);
}

public static void emptyLine(){
  System.out.println(" ");
}

public static void printString(String newString){
  System.out.println(newString);
}

public static void printNameAge(String name, int age) {
  System.out.println("My name is " + name + ", I am " + age + " years old.");

}
}
