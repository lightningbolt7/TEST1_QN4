public class LessThanTwoVowelsException extends Exception{
   public LessThanTwoVowelsException(){}
    public LessThanTwoVowelsException(int vowelCount){
        super("The String has "+vowelCount+" vowel");
    }
}
