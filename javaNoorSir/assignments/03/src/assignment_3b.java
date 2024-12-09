import java.util.Scanner;

public class assignment_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.nextLine().toLowerCase();
        int vowel = 0, consonant = 0;

        for (int i = 0; i < word.length(); i++) {
            if ("aeiou".indexOf(word.charAt(i)) != -1) {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.printf("Total vowels are %d \nTotal consonants are %d", vowel, consonant);
    }
}
