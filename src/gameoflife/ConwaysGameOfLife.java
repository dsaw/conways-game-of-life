/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.util.NoSuchElementException;

/**
 * The classic Conway's game of life
 * 
 * @author Devesh
 */
public class ConwaysGameOfLife {

    public static final int WIDTH = 200;
    public static final int HEIGHT = 200;
    public static final int birth_cell = 3;
    public static final int[] survival_cell = {2,3};
    
    private int generation = 0;  
    private boolean[][] grid;
    
    ConwaysGameOfLife()
    {
        grid = new boolean[WIDTH][HEIGHT];
        
        
    }
    
    public void alive(int i,int j)
    {
        if ( i >= WIDTH || i < 0 || j < 0 || j >= HEIGHT)
        
           throw new NoSuchElementException();   
        
        
        if (!grid[i][j])
            grid[i][j] = true;    
    }
    
     public void dead(int i,int j)
    {
        if ( i >= WIDTH || i < 0 || j < 0 || j >= HEIGHT)
        
           throw new NoSuchElementException();   
        
        
        if (grid[i][j])
            grid[i][j] = false;    
    }
    
     public int countLiveNeighbours(int i,int j)
     {
         if (i >= WIDTH || i < 0 || j < 0 || j >= HEIGHT) 
           throw new NoSuchElementException();   
        
         int num = 0;
         
         return 0;
         
         
     }
   
     public void nextGeneration()
     {
         
     }
     
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
