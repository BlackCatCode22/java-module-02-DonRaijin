//String Objects
// db 8/26/25

public class StringObjects {
    public static void main(String[] args) {

        String phrase = "Dodgers Lakers";

        System.out.println( phrase.substring(0, phrase.indexOf(" ")));
        System.out.println( phrase.toLowerCase());
        System.out.println( phrase.toUpperCase());
        char result = phrase.charAt(0);
        System.out.println(result);


    }
}