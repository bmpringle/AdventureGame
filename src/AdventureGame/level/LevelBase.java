package AdventureGame.level;

import AdventureGame.game.KeyBindings.KeyClass;
import AdventureGame.game.Paint.MainPaintClass;
import AdventureGame.game.Paint.ObjectClasses.BlockObject;
import AdventureGame.game.Paint.ObjectClasses.LevelObject;
import static AdventureGame.game.Paint.MainPaintClass.jumpmod;
import java.awt.Dimension;
import java.awt.Toolkit;

import java.util.ArrayList;

public class LevelBase  
{
    public int GroundHeight = Toolkit.getDefaultToolkit().getScreenSize().height-96;
    public int Startx = Toolkit.getDefaultToolkit().getScreenSize().width/2+KeyClass.MoveMod;
    public int middlex =Toolkit.getDefaultToolkit().getScreenSize().width/2;
    public int middley =Toolkit.getDefaultToolkit().getScreenSize().height-200+jumpmod;

    public int Starty = Toolkit.getDefaultToolkit().getScreenSize().width/2+MainPaintClass.jumpmod;
    public int BlockLength = 50;
   
    
    public ArrayList<BlockObject> L = new ArrayList<BlockObject>();
    public LevelBase(int[][] array) {
        
        for(int i=0; array.length>=i+1; ++i){
         CreateObstacle(array[i][0], array[i][1], array[i][2], array[i][3]);
        }
  
         
      }
    
    public void CreateObstacle(int X, int Y, int Width, int Height){
         LevelObject one = new LevelObject(X, Y, Width, Height);
         one.Update(X, Y, Width, Height);
         L.add(one.l.get(0));
         
    }
   
    
    
    
}
