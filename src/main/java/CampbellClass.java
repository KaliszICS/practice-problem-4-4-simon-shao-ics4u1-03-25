/**
 * converts int, boolean, char, and double to string, convert meters to centimeter, remove non-letters from a string, and can convert said string to either upper or lower case depending. 
 * @author Simon shao
 * @version 1.0.1
 */

 //final class because we don't want it to be edited. 
 //called upon using ClassName.Method(Parameter);
public final class CampbellClass{

    //constants:
    //final static int MAXIMUM = 300;

/** 
 * constructor that does nothing and is not accessable
 */
    private CampbellClass(){

    }
/**
 * convert int given to string
 * @param word int var to be converted to string
 * @return returns the string version of int var given
 */
    public static String convertString(int word){
    return Integer.toString(word);
    }

/**
 * convert double given to string
 * @param word double var to be converted to string
 * @return returns the string version of double var given
 */

    public static String convertString(double word){
        return Double.toString(word);
        }
    
/**
 * convert chara given to string
 * @param word char var to be converted to string
 * @return returns the string version of char var given
 */
    public static String convertString(char word){
        return Character.toString(word);
        }

/**
 * convert boolean given to string
 * @param word boolean var to be converted to string
 * @return returns the string version of boolean var given
 */
    public static String convertString(boolean word){
        return Boolean.toString(word);
        }
    
/**
 * convert meter to centimeter
 * @param meter int value of meter
 * @return centimeter equivalence of given value
 */
    public static int convertMetersToCenti(int meter){
        return meter*100;
    }
/**
 * convert meter to centimeter
 * @param meter double value of meter
 * @return returns the centimeter equivalence of given value
 */
    public static double convertMetersToCenti(double meter){
        return meter*100.0;
    }
    
/**
 * remove non-letter from string given
 * @param word the string var that is to be edited and have non-letters removed
 * @return returns the edited word
 */
    public static String removeNonAlpha(String word){
        String[] letters = word.split("[^a-zA-Z]");
        String newWord = "";
        for(int i = 0; i<letters.length; i++){
    newWord +=letters[i];
        }
    
        return newWord;
    }
    
/**
 * remove non-letter from string given, makes it all uppercase if given boolean is true, else it is converted to all lower case
 * @param word the string var that is to be edited and have non-letters removed
 * @param upperLower the boolean that dictates if word is all uppercase (if true) and lowercase (if false)
 * @return returns the edited word
 */
    public static String removeNonAlpha(String word, boolean upperLower){
        String[] letters = word.split("[^a-zA-Z]");
        String newWord = "";
        for(int i = 0; i<letters.length; i++){
    newWord +=letters[i];
        }
    if (upperLower){
        newWord = newWord.toUpperCase();
    }
    else{
        newWord = newWord.toLowerCase();
    }
        return newWord;
    }
    
    
    }