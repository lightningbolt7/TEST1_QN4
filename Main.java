import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args) throws LessThanTwoVowelsException{
        String word;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the word: ");
        word = scnr.next();
        vowelCheck(word);
      
    }

    public static void vowelCheck(String word) throws LessThanTwoVowelsException{
        int countVowels = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'|| word.charAt(i) == 'o'|| word.charAt(i) == 'u'){
                countVowels++;
            }
        }
        if(countVowels<2){
            throw new LessThanTwoVowelsException(countVowels);
        }
        else{
            System.out.println("No exception found");
        }
    }
}