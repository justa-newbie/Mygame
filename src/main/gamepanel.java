package main;

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

}
}
