
public class CampbellClass{

    public static String ConvertString(int word){
    return Integer.toString(word);
    }
    
    public static String ConvertString(double word){
        return Double.toString(word);
        }
    
    public static String ConvertString(char word){
        return Character.toString(word);
        }
    
    public static String ConvertString(boolean word){
        return Boolean.toString(word);
        }
    
    
    public static int convertMetersToCenti(int inches){
        inches = (int)(inches*2.54);
        return inches;
    }
    
    public static double convertMetersToCenti(double inches){
        return inches*2.54;
    }
    
    
    public static String removeNonAlpha(String word){
        String[] letters = word.split("[^a-zA-Z]");
        String newWord = "";
        for(int i = 0; i<letters.length; i++){
    newWord +=letters[i];
        }
    
        return newWord;
    }
    
    
    public static String removeNonAlpha(String word, boolean upperLower){
        String[] letters = word.split("[^!a-zA-Z]");
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