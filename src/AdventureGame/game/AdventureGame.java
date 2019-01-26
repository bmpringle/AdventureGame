
package AdventureGame.game;

import AdventureGame.game.KeyBindings.KeyClass;
import AdventureGame.game.Paint.MainPaintClass;
import AdventureGame.game.window.WindowClass;
import static AdventureGame.game.KeyBindings.KeyClass.*;
import static AdventureGame.game.Paint.MainPaintClass.jumpmod;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class AdventureGame extends KeyClass {
     
     MainPaintClass mainPanel = new MainPaintClass();
     int mapName = JComponent.WHEN_IN_FOCUSED_WINDOW;
     InputMap imap = mainPanel.getInputMap(mapName);
     KeyStroke KeyA = KeyStroke.getKeyStroke('a');
     KeyStroke KeyD = KeyStroke.getKeyStroke('d');
     KeyStroke KeySpaceBar = KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0);
     ActionMap amap = mainPanel.getActionMap();
     JFrame mainwindow = CreateWindow("Adventure Game", Toolkit.getDefaultToolkit().getScreenSize());
     public int GroundHeight = Toolkit.getDefaultToolkit().getScreenSize().height-96;
    public int Startx = Toolkit.getDefaultToolkit().getScreenSize().width/2+KeyClass.MoveMod;
    public int middlex =Toolkit.getDefaultToolkit().getScreenSize().width/2;
    public int middley =Toolkit.getDefaultToolkit().getScreenSize().height-200+jumpmod;

    public int Starty = Toolkit.getDefaultToolkit().getScreenSize().width/2+MainPaintClass.jumpmod;
    public int BlockLength = 50;
    
    public AdventureGame(){
        
        CreateAndShowGUI();
        
    }
    public void CreateAndShowGUI(){
        
        addPanel(mainwindow, mainPanel); 
        int fps=30;
        KeyBindingAMain();
        KeyBindingDMain();
        KeyBindingSpaceBarMain();
        
        
               
                 
        while(true)
        {
            Update(mainPanel);
            try
            {
               
                Thread.sleep(1000/fps);
            }catch(InterruptedException e)
            {
                         
            }
        }
        
                
               
    }
    
    public  void Update(MainPaintClass mainPanel)
    {
        
         mainPanel.repaint();
       
      
         
         
        
    }
    
    public  JFrame CreateWindow(String name, int Sizex, int Sizey)
    {
        JFrame window = null;
        Dimension WindowSize =new Dimension(Sizex, Sizey);
        window = WindowClass.NewWindow(window, name, WindowSize);
        return window;
    }
     public  JFrame CreateWindow(String name, Dimension WindowSize)
     {
        JFrame window = null;
        window = WindowClass.NewWindow(window, name, WindowSize);
        return window;
    }
    
    public  void addPanel(JFrame window, JPanel panel)
    {
        window.add(panel);
    }
    public  void addLabel(JPanel panel, JLabel label )
    {
        panel.add(label);
    }
    
    public  void KeyBindingAMain(){
        imap.put(KeyA, "keyA");
         Action A = new AbstractAction()
        {
             private static final long serialVersionUID = 1L;
                    @Override
            public void actionPerformed(java.awt.event.ActionEvent e)
	     {
                
                 KeyPressedA();
                
                 
             }
         };
         amap.put("keyA", A);
    }
    
    public  void KeyBindingDMain(){
        imap.put(KeyD, "keyS");
        Action D = new AbstractAction()
        {
             private static final long serialVersionUID = 1L;
                    @Override
            public void actionPerformed(java.awt.event.ActionEvent e)
	     {
                
                 KeyPressedD();
                
                 
             }
         };
                
                amap.put("keyS", D);
    }
    public  void KeyBindingSpaceBarMain(){
        imap.put(KeySpaceBar, "SpaceBar");
         Action SpaceBar = new AbstractAction()
        {
             private static final long serialVersionUID = 1L;
                    @Override
            public void actionPerformed(java.awt.event.ActionEvent e)
	     {
                  KeyPressedSpaceBar();
                
                 
             }
         };
         amap.put("SpaceBar", SpaceBar);
    }
    
    
    
    
}
