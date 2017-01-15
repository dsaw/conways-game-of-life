/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import edu.princeton.cs.algs4.StdRandom;
import java.util.NoSuchElementException;

/**
 * The classic Conway's game of life
 * 
 * @author Devesh
 */
public class ConwaysGameOfLife {

    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    
    //rules of cellula automata
    public static final int birth_cell = 3;
    public static final int[] survival_cell = {2,3};
    
    private int generation = 0;  

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
    
    private boolean[][] grid;
    
    ConwaysGameOfLife()
    {
        grid = new boolean[WIDTH][HEIGHT];
        
        
    }
    
    public boolean getStateOfCell(int i,int j)
    {
        return grid[i][j];
    }
    public void invertStateOfCell(int i, int j)
    {
        if (grid[i][j])
            grid[i][j] = false;
        else
            grid[i][j] = true;
        
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
    
     /*
      get total number of live cells in grid
      @return cells number of live cells     */
     public int getAliveCount()
     {
          int alive_cells = 0;
          for (int i=0; i<WIDTH; ++i)
         {
             for(int j=0; j<HEIGHT; ++j)
             {
                 if(getStateOfCell(i,j))
                     alive_cells++;
             }
         }
          
         return alive_cells; 
     }
     
     /*counts the number of alive neighbours 
     @param i row of grid
     @param j column of grid
     @return no. of live neighbours <= 8
     */
     
     public int countLiveNeighbours(int i,int j)
     {
         if (i >= WIDTH || i < 0 || j < 0 || j >= HEIGHT) 
           throw new NoSuchElementException();   
        
         int num = 0;
         // check horizontal and vertical cells
        
         if( i > 0)
             num += (grid[i-1][j]) ? 1 : 0;
         if ( i < WIDTH-1)
             num += (grid[i+1][j]) ? 1 : 0;
         
         if( j > 0)
             num += (grid[i][j-1]) ? 1 : 0;
         if ( j < HEIGHT-1)
             num += (grid[i][j+1]) ? 1 : 0;
         // diagonal neigbours check
         if( i > 0 && j > 0)
             num += (grid[i-1][j-1]) ? 1 : 0;
         
         if( i > 0 && j < HEIGHT-1)
             num += (grid[i-1][j+1]) ? 1 : 0;
         
         if( i < WIDTH-1 && j > 0)
             num += (grid[i+1][j-1]) ? 1 : 0;
           
         if( i < WIDTH-1 && j < HEIGHT-1)
             num += (grid[i+1][j+1]) ? 1 : 0;
         
         return num;
         
         
     }
   // compares the no. of neighbours of an alive cell to determine it's next state
     
     private boolean checkAlive(int i, int j)
     {
         int count = countLiveNeighbours(i,j);
         for (int m = 0; m < survival_cell.length; ++m)
         {
             if(count==survival_cell[m])
                 return  true;
             
         }
         
         return false;
         
     }
     
     // compares the no. of neighbours of a dead cell to determine its next state
     
     private boolean checkDead(int i, int j)
     {
         int count = countLiveNeighbours(i,j);
         
             if(count==birth_cell)
                 return  true;
             
         
         return false;
     }
     
     public void nextGeneration()
     {
         
         boolean new_grid[][] = new boolean[WIDTH][HEIGHT];
         for( int i = 0; i < WIDTH; ++i)
         {
             for( int j = 0; j < HEIGHT; ++j)
             {
                 if(grid[i][j])
                     new_grid[i][j] = checkAlive(i,j);
                 else
                     new_grid[i][j] = checkDead(i,j);
             }
         }
         grid = new_grid;
         
         generation++;
     }
     
     /*
     
     */
     public void randomlyInitGrid(double alive_probability)
     {
         if(alive_probability > 1)
             throw new IllegalArgumentException();
         
         
         for (int i=0; i<WIDTH; ++i)
         {
             for(int j=0; j<HEIGHT; ++j)
             {
                 if(StdRandom.bernoulli(alive_probability))
                     alive(i,j);
                 else
                     dead(i,j);
             }
         }
     }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
