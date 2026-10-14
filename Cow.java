/* 
* Cow
 * Nithesh Karuppasamy
 * creates a constructor and two get methods for the cow class
 *
 * Resources: Mrs. Ramsey Rultledge and code.org
 *
 */

public class Cow implements Animal {
    private String type;
    private String sound;
   public Cow (String type, String sound) {
     this.type = type;
     this.sound = sound;

   }  

   public String getSound(){
    return sound;
   }
    
   public String getType(){
    return type;
   }
}
