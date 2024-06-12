package Utilidades;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class EscritorioPersonalizado extends JDesktopPane {

  private BufferedImage img;

  public EscritorioPersonalizado() {
    try {
      img = ImageIO.read(getClass().getResourceAsStream("/img/fondo.png"));
    } catch (IOException e) {
      System.err.println(e);
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(img, 0, 0, null);
  }

}
