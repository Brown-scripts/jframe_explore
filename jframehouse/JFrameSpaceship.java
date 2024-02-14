/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jframespaceship;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class JFrameSpaceship extends JFrame{
    public JFrameSpaceship(){
    super("Circles in JFrame");
        setSize(400, 300);
        setLocation(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0xabcdef));
        setVisible(true);
    }
    public void paint(Graphics g){
    super.paint(g);
   
//  //upper arc
    g.fillArc(125, 50, 100, 100, 0, 180);
    //lower arc
    g.fillArc(50, 60, 250, 150, 180, 180);
    
    //white line
    g.setColor(Color.white);
    g.drawLine(50, 135, 300, 135);
   
    //body
    g.setColor(Color.blue);
    int xs[]={125,225,300,50};
    int ys[]={100,100,135,135};
    g.fillPolygon(xs,ys, 4);
    
    //legs
    int xa[]={60,70,60,50};
    int ya[]={150,150,225,225};
    g.fillPolygon(xa, ya, 4);
    
    
    }
    public static void main(String[] args) {
        new JFrameSpaceship();
        // TODO code application logic here
    }
    
}
