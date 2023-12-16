import java.util.Arrays;

public class pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        char[] sentenceArr = new char[sentence.length()];
        char[] letterPresent = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        boolean allLetterPresent = true;

        for (int i = 0; i < sentenceArr.length; i++) {
            sentenceArr[i] = sentence.charAt(i);
        }

        for (int i = 0; i < sentenceArr.length; i++) {
            if (sentenceArr[i] >= 97 && sentenceArr[i] <= 122) {
                System.out.println("true");
            }
        }

        for (int i = 0; i < letterPresent.length; i++) {
            allLetterPresent = false;

            for (int j = 0; j < sentenceArr.length; j++) {
                if (letterPresent[i] == sentenceArr[i]) {
                    allLetterPresent = true;
                    break;
                }
            }
            if (!LetterPresent) {

            }
        }

    }
}
