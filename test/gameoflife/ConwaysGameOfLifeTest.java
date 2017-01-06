/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Devesh
 */
public class ConwaysGameOfLifeTest {
    
    private ConwaysGameOfLife instance;
    
    
    public ConwaysGameOfLifeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
            instance = new ConwaysGameOfLife();
    
    }
    
    @After
    public void tearDown() {
    
           instance = null;
    }

    /*Test of randomized init method
    
    
    /**
     * Test of alive method, of class ConwaysGameOfLife.
     */
    @Test
    public void testAlive() {
        System.out.println("alive");
        int i = 0;
        int j = 0;
        instance.alive(i, j);
        // TODO review the generated test code and remove the default call to fail.
     }

    /**
     * Test of dead method, of class ConwaysGameOfLife.
     */
    @Test
    public void testDead() {
        System.out.println("dead");
        int i = 0;
        int j = 0;
        instance.dead(i, j);
     }

    /**
     * Test of countLiveNeighbours method, of class ConwaysGameOfLife.
     */
    @Test
    public void testCountLiveNeighbours() {
        System.out.println("countLiveNeighbours");
        int i = StdRandom.uniform(ConwaysGameOfLife.WIDTH);
        int j = StdRandom.uniform(ConwaysGameOfLife.HEIGHT);
        int expResult = 0;
        int result = instance.countLiveNeighbours(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of nextGeneration method, of class ConwaysGameOfLife.
     */
    @Test
    public void testNextGeneration() {
        System.out.println("nextGeneration");
        ConwaysGameOfLife instance = new ConwaysGameOfLife();
        instance.nextGeneration();
        
    }

    /**
     * Test of main method, of class ConwaysGameOfLife.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ConwaysGameOfLife.main(args);
       
    }
    
}
