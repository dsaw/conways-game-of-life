/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Devesh
 */





public class GameOfLifeBoard extends JFrame {

    public static final double DELAY =1.5;
    private static GridSurface gsurface;
    
    GameOfLifeBoard()
    {
        initUI();
    }
    
    
    private void initUI()
    {
         
        gsurface =new GridSurface();
        add(gsurface);
         setSize(new Dimension(ConwaysGameOfLife.WIDTH*GridSurface.CELL_SIZE + 2, ConwaysGameOfLife.HEIGHT*GridSurface.CELL_SIZE+200));
       
        setTitle("Conway's Game Of Life");
       setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //lambda expression used
        EventQueue.invokeLater(() -> { 
                                    GameOfLifeBoard board = new GameOfLifeBoard();
                                    board.setVisible(true);
                } );
    }
    
}
