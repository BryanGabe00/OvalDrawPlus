import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Oval extends JPanel
{
  private int x, y, width, height;
  private Color color;

  public Oval()
  {
    this(0, 0, 5, 5, Color.red);
  }

  public Oval(int x, int y, int width, int height)
  {
    this(x, y, width, height, Color.red);
  }

  public Oval(int x, int y, int width, int height, Color color)
  {
    setX(x);
    setY(y);
    setWidth(width);
    setHeight(height);
    setColor(color);
  }

  //getters
  public final int getX() { return x; }
  public final int getY() { return y; }
  public final int getWidth() { return width; }
  public final int getHeight() { return height; }
  public final Color getColor() { return color; }

  //setters
  public final void setX(int x)
  {
    if(x < 0) throw new IllegalArgumentException("X can't be negative");
    this.x = x;
  }

  public final void setY(int y)
  {
    if(y < 0) throw new IllegalArgumentException("Y can't be negative");
    this.y = y;
  }

  public final void setWidth(int width)
  {
    if(width < 0) throw new IllegalArgumentException("Width can't be negative");
    this.width = width;
  }

  public final void setHeight(int height)
  {
    if(height < 0) throw new IllegalArgumentException("Height can't be negative");
    this.height = height;
  }

  public final void setColor(Color color)
  {
    this.color = color;
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    g.setColor(color);
    g.fillOval(x, y, width, height);
    //System.out.println(getX());
  }
}
