/**
 *
 * @author Amirul Luqman
 */
public class Main { // Main class to check all the subclass
    public static void main(String[]args){
        /*  Galaxy1 = Spiral Galaxy
            Galaxy2 = Elliptical Galaxy
            Galaxy3 = Irregular Galaxy
        */
        Galaxy1 x = new Galaxy1(); // Galaxy Class No.1
        
        // SETTER
        x.setName("Spiral Galaxy"); // Set Galaxy Name
        x.setShape("Round-to-oval"); // Set Galaxy Shape
        
        // GETTER
        System.out.println(x.getName()); 
        System.out.println(x.getShape());
        x.getSize();
        x.getContent();
        x.getCharacteristic();
        System.out.println("Bulge: " + x.getBulge());
        System.out.println("Gas and dust: " + x.getGassDustDetails());
        // End of print for Spiral Galaxy
        

        
       
    }
}
