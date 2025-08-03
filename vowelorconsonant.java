package BCAThirdSemester;
import java.util.Scanner;

public class vowelorconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if (Character.isLetter(ch)) {
            if ("aeiou".indexOf(ch) != -1) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error: Not a letter");
        }
    }
}
