package leetcode;

import java.util.Scanner;

public class RandomWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String champion = "";
        int i = 0;
        while (scanner.hasNext()) {
            i++;
            String word = scanner.next();
            if (Math.random() < 1.0 / i) {
                champion = word;
            }
        }
        System.out.println(champion);
    }
}
