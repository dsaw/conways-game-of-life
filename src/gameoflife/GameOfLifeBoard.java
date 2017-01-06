/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Devesh
 */
class GridSurface extends JPanel
{
    GridSurface()
    {
        
    }
    
    private void doDrawing(Graphics g)
    {
         Graphics2D g2d = (Graphics2D)g;
         g2d.drawOval(20, 100, 40, 50);
    
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        doDrawing(g);
        
       }
}





public class GameOfLifeBoard extends JFrame {

    public static final double DELAY =1.5;
    
    
    GameOfLifeBoard()
    {
        initUI();
    }
    
    
    private void initUI()
    {
        add( new GridSurface());
        
        setSize(500,500);
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
