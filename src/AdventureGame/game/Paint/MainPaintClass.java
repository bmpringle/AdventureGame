package AdventureGame.game.Paint;

import AdventureGame.game.Paint.ObjectClasses.BlockObject;
import AdventureGame.game.KeyBindings.KeyClass;
import AdventureGame.level.LevelBase;
import AdventureGame.game.Paint.ObjectClasses.LevelObject;
import AdventureGame.game.Paint.PaintClass;
import AdventureGame.level.Levels.Level1;
import AdventureGame.level.Levels.Level2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import AdventureGame.main.AdventureGameMain;
import java.util.ArrayList;

public class MainPaintClass extends PaintClass 
{
         int framesTillStopping =60;
         public static int jumpmod=0;
         int jumpvel=20/3;
        int LevelBlockLength=100;
      
       
        
    @Override
   protected void paintComponent(Graphics g) 
   {
             super.paintComponent(g);

       if(AdventureGameMain.GamePlaying==true)
       {
           g.fillRect(Toolkit.getDefaultToolkit().getScreenSize().width/2, Toolkit.getDefaultToolkit().getScreenSize().height-200+jumpmod, 20, 100);
      
    
        for(int i=0; i < LevelBlockLength/2;i++)
        {
         BlockObject FloorTile1 = new BlockObject(Toolkit.getDefaultToolkit().getScreenSize().width/2+100*i+KeyClass.MoveMod, Toolkit.getDefaultToolkit().getScreenSize().height-100, 50, 50);
         BlockObject FloorTile2 = new BlockObject(Toolkit.getDefaultToolkit().getScreenSize().width/2+100*i+KeyClass.MoveMod+50, Toolkit.getDefaultToolkit().getScreenSize().height-100, 50, 50);
         FloorTile1.paintObject(g, Color.GRAY, true);
         FloorTile2.paintObject(g, Color.GREEN, true);
         
        }
        JumpFunction();
         BlockObject MainPlayer = new BlockObject(Toolkit.getDefaultToolkit().getScreenSize().width/2, Toolkit.getDefaultToolkit().getScreenSize().height-200+jumpmod, 20, 100);
         MainPlayer.paintObject(g, Color.CYAN, true);
          //Level1 l1 = new Level1();
          Level2 l1 = new Level2();
          ArrayList<BlockObject> obstacles = new ArrayList<BlockObject>(l1.l.L);
           
         for(int i=0; obstacles.size()>i; ++i){
      
            
             obstacles.get(i).paintObject(g, Color.BLACK, true);
             
             
         }
         
       }else if(AdventureGameMain.GamePlaying==false && AdventureGameMain.GameWon==false){
           
           Font f = new Font("Comic Sans MS", Font.BOLD+Font.ITALIC, Toolkit.getDefaultToolkit().getScreenSize().height/12);
    g.setFont(f);
    g.drawString("Game Over! To Try Again Press ENTER", 0, Toolkit.getDefaultToolkit().getScreenSize().height/2);
       }else{
           Font f = new Font("Comic Sans MS", Font.BOLD+Font.ITALIC, Toolkit.getDefaultToolkit().getScreenSize().height/12);
    g.setFont(f);
    g.drawString("  You Win! To Play Again Press ENTER", 0, Toolkit.getDefaultToolkit().getScreenSize().height/2);
       }
       
       if(Toolkit.getDefaultToolkit().getScreenSize().width/2+KeyClass.MoveMod>Toolkit.getDefaultToolkit().getScreenSize().width/2)
       {
           
           AdventureGameMain.GamePlaying=false;
           AdventureGameMain.GameWon=false;
           
       }
       if(Toolkit.getDefaultToolkit().getScreenSize().width/2+100*LevelBlockLength/2+KeyClass.MoveMod-20<Toolkit.getDefaultToolkit().getScreenSize().width/2 ){
           AdventureGameMain.GamePlaying=false;
           AdventureGameMain.GameWon=true;
       }
       
   }
   
   public void JumpFunction()
   {
       if(KeyClass.isJumping==true)
       {
          if(framesTillStopping>=0)
          {
              if(framesTillStopping>30){
              jumpmod=jumpmod-jumpvel;
              --framesTillStopping;
              }else if(framesTillStopping!=30)
              {
                  jumpmod=jumpmod+jumpvel;
                  --framesTillStopping;
              }else
              {
                  --framesTillStopping;
              }
          }else
          {
              framesTillStopping=60;
              KeyClass.isJumping = false;
          }
       }
       
     }
   
   
}
