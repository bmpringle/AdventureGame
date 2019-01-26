package AdventureGame.game.Paint.ObjectClasses;

import AdventureGame.game.KeyBindings.KeyClass;
import static AdventureGame.game.KeyBindings.KeyClass.MoveMod;
import static AdventureGame.game.Paint.MainPaintClass.jumpmod;
import java.awt.Toolkit;

public class CollisionDetection {
    boolean fmarker=false;
    boolean bmarker = false;
     public CollisionDetection(int BlockModX, int BlockModY, int Width, int Height){
          
          int BlockY= Toolkit.getDefaultToolkit().getScreenSize().height-50-(50*BlockModY);
          int BlockX = Toolkit.getDefaultToolkit().getScreenSize().width/2+KeyClass.MoveMod+50*BlockModX-50;
          CollisionForward(BlockX, BlockY, Width*50, Height*50, 0);
       //WIP:   CollisionBackward(BlockX, BlockY);
       
        
       
       
       
       
       
       
        
    }
     
     
     
     public void CollisionForward(int BlockX, int BlockY, int XLength, int YLength, int i){
         
         if(Toolkit.getDefaultToolkit().getScreenSize().width/2+70> BlockX && BlockX>Toolkit.getDefaultToolkit().getScreenSize().width/2){
   
          if(BlockX-50 == Toolkit.getDefaultToolkit().getScreenSize().width/2) {
              KeyClass.MoveMod=MoveMod+BlockX-80-Toolkit.getDefaultToolkit().getScreenSize().width/2;
          }

          
          if(Toolkit.getDefaultToolkit().getScreenSize().height-50+jumpmod<BlockY){
               fmarker=false;
           
          }else{
              if(BlockY+(50*YLength)<=Toolkit.getDefaultToolkit().getScreenSize().height-150+jumpmod){
              fmarker=false;
             }else{
              fmarker=true;
           if(Toolkit.getDefaultToolkit().getScreenSize().width/2 < BlockX && i==1){
                  KeyClass.MoveMod=KeyClass.MoveMod-30;
              }
           i=0;
              }
          
          }
            }else{
           fmarker=false;
           
           
           if(Toolkit.getDefaultToolkit().getScreenSize().height-100>BlockY+jumpmod ){
               
           }else if(i==0){
              i=1;
           }
       }
     }
     
      public void CollisionBackward(int BlockX, int BlockY){
       //WIP
      }
     
    
     
    
}
