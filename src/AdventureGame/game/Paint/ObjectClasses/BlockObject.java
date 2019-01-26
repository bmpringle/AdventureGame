/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdventureGame.game.Paint.ObjectClasses;

import AdventureGame.game.Paint.MainPaintClass;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author bmp
 */
public class BlockObject{
    
   int Width;
   int Height;
   int WBlock;
   int HBlock;       
    
    public BlockObject(int WidthIn, int HeightIn, int WBlockIn, int HBLockIn/*, int number*/)
    {
       Width=WidthIn;
       Height=HeightIn;
       HBlock=HBLockIn;
       WBlock=WBlockIn;
     
        
    }
    
   
    

    public void paintObject(Graphics g, Color color, boolean filled){
        
        if(filled==true){
            try{
        g.setColor(color);
            }catch(NullPointerException e){
                
            }
        g.fillRect(Width, Height, WBlock, HBlock);
        }else{
         try{
        g.setColor(color);
            }catch(NullPointerException e){
                
            }
        g.drawRect(Width, Height, 100, 100);
        }
        
    }
    
    public int BlockObjectReturnX(){
        
        return Width;
    }
    
     public int BlockObjectReturnY(){
       
         
         return Height;
    }
}
