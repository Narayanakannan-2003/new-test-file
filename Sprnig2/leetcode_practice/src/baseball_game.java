import java.util.LinkedList;
import java.util.List;

public class baseball_game {
    public static void main(String[] args) {
        // Use a List of Integers so math works perfectly!
        List<Integer> res = new LinkedList<>();

        String[] ops = {"5", "2", "C", "D", "+"};
        String s1 = String.join("", ops);
        char[] ch = s1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                // Convert the char symbol (like '5') into a real number (5)
                res.add(ch[i] - '0');
            }
            else if (ch[i] == 'C') {
                // Remove the very last score recorded
                res.removeLast();
            }
            else if (ch[i] == 'D') {
                // Get the last score, double it, and add it
                int lastScore = res.getLast();
                res.add(lastScore * 2);
            }
            else if (ch[i] == '+') {
                // Get the last two scores, add them together, and record it
                int last = res.get(res.size() - 1);
                int secondLast = res.get(res.size() - 2);
                res.add(last + secondLast);
            }
        }

        // Print the final list of scores: [5, 10, 15]


        // Calculate the total sum of all scores
        int totalSum = 0;
        for (int score : res) {
            totalSum += score;
        }
        System.out.println("Total Sum: " + totalSum); // Outputs: 30
    }
}
