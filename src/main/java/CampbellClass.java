public class CampbellClass{



    private CampbellClass(){

    }
    
    public static String convertString(int word){
    return Integer.toString(word);
    }
    
    public static String convertString(double word){
        return Double.toString(word);
        }
    
    public static String convertString(char word){
        return Character.toString(word);
        }
    
    public static String convertString(boolean word){
        return Boolean.toString(word);
        }
    
    
    public static int convertMetersToCenti(int meter){
        int centimeter = (int)(meter*100);
        return centimeter;
    }
    
    public static double convertMetersToCenti(double meter){
        return meter*100;
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