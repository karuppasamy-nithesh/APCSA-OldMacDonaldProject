/* 
* Chick
 * Nithesh Karuppasamy
 * creates a constructor and two get methods for the chick class
 *
 * Resources: Mrs. Ramsey Rultledge and code.org and dad
 *
 */



public class Chick implements Animal {
    
 private String type;
    private String sound;
    private String sound2;
   public Chick (String type, String sound) {
     this.type = type;
     this.sound = sound;

   }  

   public String getSound(){
    if (sound2 == null) {
        return sound;
    }

    if (Math.random() < 0.5) {
      return sound;
     } else {
    return sound2;
    }
   }
    
   public String getType(){
    return type;
   }


public Chick (String type, String sound, String sound2) {
    this.type = type;
    this.sound = sound;
    this.sound2 = sound2;
}


}