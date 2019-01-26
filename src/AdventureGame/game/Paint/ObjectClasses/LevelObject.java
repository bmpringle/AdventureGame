package AdventureGame.game.Paint.ObjectClasses;

import AdventureGame.game.KeyBindings.KeyClass;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;

public class LevelObject{
    
    public int GroundHeight = Toolkit.getDefaultToolkit().getScreenSize().height-100;
    
    public int Start = Toolkit.getDefaultToolkit().getScreenSize().width/2+KeyClass.MoveMod;
    public int BlockLength = 50;
    public ArrayList<BlockObject> l = new ArrayList<BlockObject>();
    public LevelObject(int BlockXIn, int BlockYIn, int BlockWidth, int BlockHeight){
        LevelObject(BlockXIn, BlockYIn, BlockWidth, BlockHeight);
    }
    public void LevelObject(int BlockXIn, int BlockYIn, int BlockWidth, int BlockHeight){
        int i =0;
        int BlockY = GroundHeight-BlockYIn*50;
        int BlockX = Start+BlockLength*BlockXIn-50;
      BlockObject Obstacle1 = new BlockObject(BlockX, BlockY, BlockWidth, BlockHeight); 
      ++i;
      
      for(int j=0; j<i; j++){
      l.add(Obstacle1);
      }
      Update(BlockXIn, BlockYIn, BlockWidth, BlockHeight);
    }
    public void Update(int BlockXIn, int BlockYIn, int Width, int Height){
          CollisionDetection c= new CollisionDetection(BlockXIn, BlockYIn, Width, Height);
         if(c.fmarker==false){
             
             KeyClass.cantmoveD = false;
             
         }else{
            KeyClass.cantmoveD = true;

         }
         
         
         if(c.bmarker ==false){
              KeyClass.cantmoveA = false;
             
         }else{
            KeyClass.cantmoveA = true;

         }
         
         
    }
    
    
    
    
   
}
