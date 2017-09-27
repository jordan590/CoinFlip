/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication6;
import java.util.Random;
public class JavaApplication6 {
    public static final int FLIPS = 100;
    public static void main(String[] args) {
        Random rand = new Random();
        int countForHeads = 0, countForTails = 0, longestStreakCounter = 0;
        int longestStreak = 0;
        for(int i = 0;i < FLIPS; i++){
            int n = rand.nextInt(2)+1;
            if (n == 1){
                countForHeads++;
                longestStreakCounter++;
                System.out.println("Heads");
            } else if (n == 2){
                countForTails++;
                longestStreak = longestStreakCounter;
                longestStreakCounter = 0;
                System.out.println("Tails");
            }
        }
        System.out.println("Heads: " + countForHeads);
        System.out.println("Tails: " + countForTails);
        System.out.println("% Heads: " + ((double) countForHeads/100));
        System.out.println("% Tails: " + ((double) countForTails/100));
        System.out.println("Longest streak of heads: " + longestStreak);

    }
    
}
