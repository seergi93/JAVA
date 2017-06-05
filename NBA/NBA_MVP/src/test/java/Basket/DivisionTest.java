/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basket;

import java.util.List;
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
public class DivisionTest {

    public DivisionTest() {
    }

    @Test
    public void anhadirTeam() {
        Division division = new Division();
        Team team = new Team("Chicago Bulls");
        division.addTeam(team);
        assertEquals("Chicago Bulls", division.getTeams().get(0).toString());
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Division.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Division instance = new Division();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Division.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Division instance = new Division();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTeam method, of class Division.
     */
    @Test
    public void testAddTeam() {
        System.out.println("addTeam");
        Team team = null;
        Division instance = new Division();
        instance.addTeam(team);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeams method, of class Division.
     */
    @Test
    public void testGetTeams() {
        System.out.println("getTeams");
        Division instance = new Division();
        List<Team> expResult = null;
        List<Team> result = instance.getTeams();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeams method, of class Division.
     */
    @Test
    public void testSetTeams() {
        System.out.println("setTeams");
        List<Team> teams = null;
        Division instance = new Division();
        instance.setTeams(teams);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
