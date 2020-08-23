package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameover = true;
        int levelCompleted = 5;
        int bonus = 100;
        int score = 800;

        if (gameover) {
            int FinalScore = score + (bonus * levelCompleted);
            System.out.println("Your Final Score is :" + FinalScore);
        }

        boolean GameoveR = true;
        int LevelCompleted = 8;
        int Bonous = 200;
        int Score = 10000;
        if (GameoveR) {
            int FinalScore = Score + (Bonous * LevelCompleted);
            System.out.println("Your Final Score is :" + FinalScore);
        }
        score = 100000;
        levelCompleted = 10;
        bonus = 200;
        if (gameover) {
            int FinalScore = score + (bonus * levelCompleted);
            System.out.println("Your Final Score is :" + FinalScore);

        }
    }
}