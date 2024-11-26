package com.group2.refocus;

import java.util.ArrayList;
import java.util.Collections;

public class BreakGenerator {

    private ArrayList<Break> breakList = new ArrayList<>();

    BreakGenerator() {
        breakList.add(new Break(5, "Stretch your arms, neck, and legs"));
        breakList.add(new Break(5, "Close your eyes and take deep breaths"));
        breakList.add(new Break(5, "Walk around your study area"));
        breakList.add(new Break(5, "Drink a glass of water"));
        breakList.add(new Break(5, "Grab a healthy snack"));
        breakList.add(new Break(5, "Write a quick journal entry"));
        breakList.add(new Break(5, "Doodle or sketch something"));
        breakList.add(new Break(5, "Tidy up your desk"));
        breakList.add(new Break(5, "Play with a stress ball or fidget toy"));
        breakList.add(new Break(5, "Listen to an upbeat song"));

        breakList.add(new Break(15, "Do a light workout"));
        breakList.add(new Break(15, "Meditate using a guided app or music"));
        breakList.add(new Break(15, "Read a few pages of a book or an article"));
        breakList.add(new Break(15, "Call or message a friend for a quick chat"));
        breakList.add(new Break(15, "Go for a brisk walk outside"));
        breakList.add(new Break(15, "Make yourself a cup of tea or coffee"));
        breakList.add(new Break(15, "Solve a quick puzzle"));
        breakList.add(new Break(15, "Watch a short, funny video"));
        breakList.add(new Break(15, "Do a quick household chore"));
        breakList.add(new Break(15, "Write down your next goals for the study session"));

        breakList.add(new Break(30, "Cook or prepare a healthy meal or snack"));
        breakList.add(new Break(30, "Take a power nap"));
        breakList.add(new Break(30, "Go for a longer walk or bike ride"));
        breakList.add(new Break(30, "Watch an episode of a light TV show"));
        breakList.add(new Break(30, "Do a creative activity"));
        breakList.add(new Break(30, "Listen to a podcast or audiobook"));
        breakList.add(new Break(30, "Practice a musical instrument or sing"));
        breakList.add(new Break(30, "Clean and reorganize your study space"));
        breakList.add(new Break(30, "Spend time with a pet or in nature"));
        breakList.add(new Break(30, "Journal or brainstorm ideas for a personal project"));

        Collections.shuffle(breakList);
    }

    public ArrayList<Break> getList() {
        return breakList;
    }


    // O(n) search
    public Break getBreak(int time) {
        for (Break break_ : breakList) {
            if (break_.getTime() == time) {
                return break_;
            }
        }
        return new Break(0, "");
    }

    // O(n) search
    public Break getBreak(String breakActivity) {
        for (Break break_ : breakList) {
            if (break_.getBreakActivity() == breakActivity) {
                return break_;
            }
        }
        return new Break(0, "");
    }
}
