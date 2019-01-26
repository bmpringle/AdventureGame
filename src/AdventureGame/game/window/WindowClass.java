
package AdventureGame.game.window;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowClass extends JFrame 
{

    public static JFrame NewWindow(JFrame jFrame, String name, Dimension WindowSize) 
    {
        jFrame = new JFrame(name);
      jFrame.setVisible(true);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jFrame.setPreferredSize(WindowSize);
      
      jFrame.pack();
      return jFrame;
      
    }
    public static void addPanel(JFrame jFrame, JPanel panel)
    {
        
    }
    
    
    

   
}
