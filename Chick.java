class Chick implements Animal 
{     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     } 
     public Chick(String type, String sound2, String sound)
     {   int whichSound = (int) ((Math.random()*2)+1);
     	 if (whichSound == 1) {
     	 	mySound = sound;}
     	 else if (whichSound ==2){
     	 	mySound = sound2;}
         myType = type;        
          
     }
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 

}
