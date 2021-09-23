class Main2{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands");
   }

   System.out.println(addIntegers(2,3));
   System.out.println(toUpperCase("Jeg vil aendres"));
   System.out.println(checkFirstLetter("hello"));
}


public static boolean iAmHappy()
{
  // fill out what is missing here:
  if (happy == true){
    return true;
  } else {
    return false;
  }

}

public static int addIntegers(int num1, int num2){
  int addedNums = num1 + num2;
  return addedNums;
}

public static String toUpperCase(String editString) {
  return editString.toUpperCase();
}

public static boolean checkFirstLetter(String checkString) {
  char firstLetter = checkString.charAt(0);
  if (Character.isUpperCase(firstLetter)) {
    return true;
  } else {
    return false;
  }
}

}
