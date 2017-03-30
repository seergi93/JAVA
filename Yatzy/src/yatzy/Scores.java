/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import java.util.Arrays;

/**
 *
 * @author Sergi
 */
public class Scores {

    protected int[] dice;

    public static int chance(int... dice) {
        int total = 0;
        for (int i = 0; i < dice.length; i++) {
            total += dice[i];

        }
        return total;

    }

    public static int yatzy(int... dice) {

        boolean isYatzy = true;
        int yatzyScore = 0;

        for (int i = 0; i < dice.length - 1 && isYatzy; i++) {
            if (dice[i + 1] == dice[i]) {
                isYatzy = true;
                yatzyScore = 50;
            } else {
                isYatzy = false;
                yatzyScore = 0;
            }

        }
        return yatzyScore;
    }

    public static int ones(int... dice) {

        int onesScore = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                onesScore++;
            }
        }
        return onesScore;
    }

    public static int twos(int... dice) {

        int twosScore = 0;
        int two = 2;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == two) {
                twosScore += two;
            }
        }
        return twosScore;
    }

    public static int threes(int... dice) {
        int threeScore = 0;
        int three = 3;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == three) {
                threeScore += three;
            }
        }
        return threeScore;

    }

    public Scores(int d1, int d2, int d3, int d4, int d5) {
        dice = new int[5];
        dice[0] = d1;
        dice[1] = d2;
        dice[2] = d3;
        dice[3] = d4;
        dice[4] = d5;

    }

    

    public int fours() {
        int foursScore = 0;
        int four = 4;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == four) {
                foursScore += four;
            }
        }
        return foursScore;
    }

    public int fives() {
        int fivesScore = 0;
        int five = 5;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == five) {
                fivesScore += five;
            }
        }
        return fivesScore;
    }

    public int sixes() {
        int sixesScore = 0;
        int six = 6;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == six) {
                sixesScore += six;
            }
        }
        return sixesScore;
    }

    public static int pair(int... dice) {

        Arrays.sort(dice);
        int pairScore = 0;
        int two = 2;
        boolean isPair = false;

        for (int i = dice.length - 1; i > 0 && !isPair; i--) {
            if (dice[i] == dice[i - 1]) {
                pairScore = dice[i] * two;
                isPair = true;
            }

        }
        return pairScore;

    }

    public static int two_pair(int... dice) {

        Arrays.sort(dice);
        int twoPairsScore = 0;
        int firstPair = 0, secondPair = 0;
        int two = 2;

        boolean firstPairFinded = false, secondPairFinded = false;

        for (int i = dice.length - 1; i > 0 && !secondPairFinded; i--) {
            if (dice[i] == dice[i - 1] && !firstPairFinded) {
                firstPair = dice[i];
                firstPairFinded = true;
            } else if (dice[i] == dice[i - 1] && firstPairFinded && dice[i] != firstPair) {
                secondPair = dice[i];
                secondPairFinded = true;
                twoPairsScore = firstPair * two + secondPair * two;

            }

        }
        return twoPairsScore;

    }

    public static int four_of_a_kind(int... dice) {

        Arrays.sort(dice);
        int fourOfAKindScore = 0;
        int counter = 0;
        int four = 4;

        for (int i = dice.length - 1; i > 0 && counter < 3; i--) {
            if (dice[i] == dice[i - 1]) {
                counter++;
                fourOfAKindScore = dice[i] * four;
            }

        }
        return fourOfAKindScore;

    }

    public static int three_of_a_kind(int... dice) {
        Arrays.sort(dice);
        int threeOfAKindScore = 0;
        int counter = 0;
        int three = 3;

        for (int i = dice.length - 1; i > 0 && counter < 2; i--) {
            if (dice[i] == dice[i - 1]) {
                counter++;
                threeOfAKindScore = dice[i] * three;
            }

        }
        return threeOfAKindScore;
    }

    public static int smallStraight(int... dice) {
        int scoreSmallStraight = 0;
        boolean out = false;
        Arrays.sort(dice);
        for (int i = 1; i < 6 && !out; i++) {
            if (dice[i - 1] == i) {
                scoreSmallStraight = 15;
            } else {
                scoreSmallStraight = 0;
                out = true;
            }
        }
        return scoreSmallStraight;
    }

    public static int largeStraight(int... dice) {
        int scoreLargeStraight = 0;
        boolean out = false;
        Arrays.sort(dice);
        for (int i = 2; i < 7 && !out; i++) {
            if (dice[i - 2] == i) {
                scoreLargeStraight = 20;
            } else {
                scoreLargeStraight = 0;
                out = true;
            }
        }
        return scoreLargeStraight;
    }

    public static int fullHouse(int... dice) {

        int scorePair = Scores.pair(dice);
        int scorethreeOfAKind = Scores.three_of_a_kind(dice);

        if (scorePair != 0 && scorethreeOfAKind != 0) {
            return scorePair + scorethreeOfAKind;

        } else {
            return 0;
        }

    }

}
