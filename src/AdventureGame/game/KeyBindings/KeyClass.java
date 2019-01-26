package AdventureGame.game.KeyBindings;

import AdventureGame.game.AdventureGame;

public class KeyClass{
    
    public static int MoveMod=0;
    static int ae=50;
    public static boolean cantmoveD=false;
    public static boolean cantmoveA=false;
    public static boolean cantmoveSpace=false;
    public static boolean isJumping = false;
    
        
        
            
        public void KeyPressedA()
    {
        
        if(cantmoveA==false){
           MoveMod=MoveMod+ae;
        }
            
    }
        public void KeyPressedD()
    {
        
        
            if(cantmoveD==false){
            MoveMod=MoveMod-ae;
            }
            
    }
        
        public void KeyPressedSpaceBar(){
           if(cantmoveSpace==false){
            if(isJumping==false){
                isJumping=true;
            }
        }
     }
    
    
}
