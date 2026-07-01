import java.util.Arrays;
import java.util.HashSet;

public class dup_in_string {
    public static void main(String[] args) {



            String s = "narayanakannan";

            HashSet<Character> seen = new HashSet<>();
            HashSet<Character> duplicates = new HashSet<>();

            for (char ch : s.toCharArray()) {
                if (!seen.add(ch)) { // add() returns false if already present
                    duplicates.add(ch);
                }
            }

            System.out.println("Duplicate characters: " + duplicates);
        }
    }

