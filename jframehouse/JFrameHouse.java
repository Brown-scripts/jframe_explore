/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jframehouse;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class JFrameHouse extends JFrame{
    public JFrameHouse(){
        super("House in JFrame");
        setSize(400,300);
        setLocation(200,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
    }
    public void paint (Graphics g){
        super.paint(g);
        int xs[]={65,125,180};
        int ys[]={100,75,100};
        
       //rectangular building
        g.setColor(new Color(0x964B00));
        g.drawRect(65,100, 115, 100);
        
        //triangular roof
        g.drawPolygon(xs, ys,3);
        
        //square windows
        g.drawRect(80, 115, 25, 25);
        g.drawRect(140, 115, 25, 25);
        
        //rectangular tree stem
        g.fillRect(255, 100, 10, 100);
        
        //oval tree leaves
        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 120, 50);
        
        //lines
        g.drawLine(0, 140, 35, 120);
        g.drawLine(35, 120, 65, 130);
        g.drawLine(180, 135, 255, 140);
        g.drawLine(265, 140, 345, 110);
        
        //rectangular door
        g.setColor(Color.BLACK);
        g.fillRect(105, 160, 35, 40);
        
       
    }
        
    
    public static void main(String[] args) {
        new JFrameHouse();
    }
}
