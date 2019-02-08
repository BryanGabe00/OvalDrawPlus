import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;

public class OvalFrame extends JFrame
{
  public OvalFrame()
  {
    super("Oval Draw Plus");
    setBounds(100, 100, 400, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Oval oval = new Oval(10, 10, 50, 70, Color.blue);
    Container contentPane = getContentPane();

    contentPane.add(oval);

  }
}
