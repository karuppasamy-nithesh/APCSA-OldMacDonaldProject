/* 
* NamedCow
 * Nithesh Karuppasamy
 * creates a constructor and two get methods for the pig class
 *
 * Resources: dad and code.org
 *
 */







public class NamedCow extends Cow {
      private String name; 

      public NamedCow(String type, String sound, String name) {
    super(type, sound);
    this.name = name;
}
     
    public String getName(){
        return name;
    }



}