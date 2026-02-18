package main;

import java.awt.Graphics2D;
import javax.swing.JPanel;

public class gamepanel extends JPanel implements Runnable {
  //this is screen
  final int originalTileSize = 16; //16x16 tile
  final int scale = 3;
  final int tileSize = originalTileSize * scale; //48x48 tile
  final int maxScreenCol = 16;
  final int maxScreenRow = 12;
  final int screenWidth = tileSize * maxScreenCol; //768 pixels
  final int screenHeight = tileSize * maxScreenRow; //576 pixels
  Thread gameThread;
  public gamepanel() {
      this.setPreferredSize(new java.awt.Dimension(screenWidth, screenHeight));
      this.setBackground(java.awt.Color.black);
      this.setDoubleBuffered(true);
    }
     public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
     }
  @Override
  public void run() {
     while (gameThread != null) {
      update();// for update information such as character positions
      repaint();
      // for drawing the screen again
     }
  }
  public void update() {
  //update character positions
  }
 public void paintComponent(java.awt.Graphics g) {
 super.paintComponent(g);
 Graphics2D g2 = (Graphics2D) g;
 //draw character
 g2.setColor(java.awt.Color.white);
 g2.fillRect(100, 100, tileSize, tileSize);
  g2.dispose();
 }
          

}

