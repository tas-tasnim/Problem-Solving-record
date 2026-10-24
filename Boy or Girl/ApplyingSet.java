

import java.util.Scanner;
import java.util.HashSet;

public class ApplyingSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < name.length(); i++) {
            set.add(name.charAt(i));
        }

        if (set.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
        set.clear();
    }
}