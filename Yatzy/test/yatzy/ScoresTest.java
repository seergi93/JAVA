/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yatzy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi
 */
public class ScoresTest {
    
    
    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual = Scores.chance(2,3,4,5,1);
        assertEquals(expected, actual);
        assertEquals(16, Scores.chance(3,3,4,5,1));
    }

    @Test public void yatzy_scores_50() {
        int expected = 50;
        int actual = Scores.yatzy(4,4,4,4,4);
        assertEquals(expected, actual);
        assertEquals(50, Scores.yatzy(6,6,6,6,6));
        assertEquals(0, Scores.yatzy(6,6,6,6,3));
    }

    @Test public void test_1s() {
        assertTrue(Scores.ones(1,2,3,4,5) == 1);
        assertEquals(2, Scores.ones(1,2,1,4,5));
        assertEquals(0, Scores.ones(6,2,2,4,5));
        assertEquals(4, Scores.ones(1,2,1,1,1));
    }

    @Test
    public void test_2s() {
        assertEquals(4, Scores.twos(1,2,3,2,6));
        assertEquals(10, Scores.twos(2,2,2,2,2));
    }

    @Test
    public void test_threes() {
        assertEquals(6, Scores.threes(1,2,3,2,3));
        assertEquals(12, Scores.threes(2,3,3,3,3));
    }

    @Test
    public void fours_test() 
    {
        assertEquals(12, new Scores(4,4,4,5,5).fours());
        assertEquals(8, new Scores(4,4,5,5,5).fours());
        assertEquals(4, new Scores(4,5,5,5,5).fours());
    }

    @Test
    public void fives() {
        assertEquals(10, new Scores(4,4,4,5,5).fives());
        assertEquals(15, new Scores(4,4,5,5,5).fives());
        assertEquals(20, new Scores(4,5,5,5,5).fives());
    }

    @Test
    public void sixes_test() {
        assertEquals(0, new Scores(4,4,4,5,5).sixes());
        assertEquals(6, new Scores(4,4,6,5,5).sixes());
        assertEquals(18, new Scores(6,5,6,6,5).sixes());
    }

    @Test
    public void one_pair() {
        assertEquals(6, Scores.pair(3,4,3,5,6));
        assertEquals(10, Scores.pair(5,3,3,3,5));
        assertEquals(12, Scores.pair(5,3,6,6,5));
    }

    @Test
    public void two_Pair() {
        assertEquals(16, Scores.two_pair(3,3,5,4,5));
        assertEquals(16, Scores.two_pair(3,3,5,5,5));
        assertEquals(0, Scores.two_pair(5,5,5,5,5));
    }

    @Test
    public void three_of_a_kind() 
    {
        assertEquals(9, Scores.three_of_a_kind(3,3,3,4,5));
        assertEquals(15, Scores.three_of_a_kind(5,3,5,4,5));
        assertEquals(9, Scores.three_of_a_kind(3,3,3,3,5));
    }

    @Test
    public void four_of_a_knd() {
        assertEquals(12, Scores.four_of_a_kind(3,3,3,3,5));
        assertEquals(20, Scores.four_of_a_kind(5,5,5,4,5));
        assertEquals(9, Scores.three_of_a_kind(3,3,3,3,3));
    }

    @Test
    public void smallStraight() {
        assertEquals(15, Scores.smallStraight(1,2,3,4,5));
        assertEquals(15, Scores.smallStraight(2,3,4,5,1));
        assertEquals(0, Scores.smallStraight(1,2,2,4,5));
        assertEquals(0, Scores.smallStraight(1,1,3,4,5));
        assertEquals(0, Scores.smallStraight(2,2,3,4,5));
        assertEquals(0, Scores.smallStraight(2,3,4,5,6));
    }

    @Test
    public void largeStraight() {
        assertEquals(20, Scores.largeStraight(6,2,3,4,5));
        assertEquals(20, Scores.largeStraight(2,3,4,5,6));
        assertEquals(0, Scores.largeStraight(1,2,2,4,5));
        assertEquals(0, Scores.largeStraight(1,2,3,4,5));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, Scores.fullHouse(6,2,2,2,6));
        assertEquals(0, Scores.fullHouse(2,3,4,5,6));
    }
}
