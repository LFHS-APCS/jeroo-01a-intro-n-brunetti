/**
 * Follow instructions in the Readme.md 
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
//        new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
     
Jeroo joe = new Jeroo(0,0, EAST, 5);
joe.hop(5);
 joe.plant(1);
  joe.hop();
 
  
    }

}
