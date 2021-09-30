import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:

        // Printer 'centraladministrationen'
        printLongestWord();
        printFirstHalfOfEachWord();
        // MOST FREQUENT GETS PRINTED WHEN CALLED IN printLessFrequentLetter()
        printLessFrequentLetter();

    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:
    public static void printLongestWord() {
        String longestWord = "";
        for (String word: text) {
            int newWord = word.length();
            if (newWord > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
    }

    public static void printFirstHalfOfEachWord() {
        for (String word: text) {
            System.out.println(word.substring(0,word.length()/2));
        }
    }



    // RETURNS MOST FREQUENT LETTER AMOUNT
    public static int printMostFrequentLetter() {
        // MAKE ARRAY OF ALL LETTERS IN ALPHABET AND EMPTY
        // INT ARRAY TO ADD ALL INSTANCES OF A LETTER

        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";
        String [] alphabetArray = alphabet.split("");
        int [] eachLetterAmount = new int[29];

        // LOOPS THROUGH EACH WORD, THEN LOOPS THROUGH EACH LETTER IN WORD,
        // AND THEN ADDS 1 TO THE GIVEN LETTERS SPOT WHEN THAT LETTER IS FOUND

        for (String word: text) {
            String [] wordArray = word.split("");
            for (String letter: wordArray) {
                for (int i = 0; i<alphabetArray.length; i++) {
                    if(letter.equals(alphabetArray[i])) {
                        eachLetterAmount[i] += 1;
                    }
                }

            }
        }

        // FINDS MOST FREQUENT LETTER
        int mostFrequentLetterAmount = 0;
        String mostFrequentLetter = "";

        for(int i = 0; i< eachLetterAmount.length; i++) {
            if (eachLetterAmount[i] > mostFrequentLetterAmount) {
                mostFrequentLetterAmount = eachLetterAmount[i];
                mostFrequentLetter = alphabetArray[i];
            }

        }
        System.out.println("The most frequent letter is " + mostFrequentLetter + " and it is used " + mostFrequentLetterAmount + " times");
        return mostFrequentLetterAmount;

    }

    public static void printLessFrequentLetter() {
        // SAVE MOST FREQUENT LETTER AMOUNT TO VARIABLE
        int mostFrequentLetterAmount = printMostFrequentLetter();

        // MAKE ARRAY OF ALL LETTERS IN ALPHABET AND EMPTY
        // INT ARRAY TO ADD ALL INSTANCES OF A LETTER

        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";
        String [] alphabetArray = alphabet.split("");
        int [] eachLetterAmount = new int[29];

        // LOOPS THROUGH EACH WORD, THEN LOOPS THROUGH EACH LETTER IN WORD,
        // AND THEN ADDS 1 TO THE GIVEN LETTERS SPOT WHEN THAT LETTER IS FOUND

        for (String word: text) {
            String [] wordArray = word.split("");
            for (String letter: wordArray) {
                for (int i = 0; i<alphabetArray.length; i++) {
                    if(letter.equals(alphabetArray[i])) {
                        eachLetterAmount[i] += 1;
                    }
                }

            }
        }

        //FINDS LEAST FREQUENT LETTER
        int lessFrequentLetterAmount = 0;
        String lessFrequentLetter = "";

        for(int i = 0; i< eachLetterAmount.length; i++) {
            if (eachLetterAmount[i] < mostFrequentLetterAmount) {
                lessFrequentLetterAmount = eachLetterAmount[i];
                lessFrequentLetter = alphabetArray[i];
            }

        }
        System.out.println("The least frequent letter is " + lessFrequentLetter + " and it is used " + lessFrequentLetterAmount + " times");


    }



}

