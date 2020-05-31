/**
 * SPIRAL GALAXIES
 * @author Amirul Luqman
 */
public class Galaxy1 extends Galaxy {

    private String bulge= "Bulge and thin disk; halo is present.";
    private String gasDust = "Rich";

    public Galaxy1() {
    }
    @Override
    public void setBulge(String bulge){
        this.bulge = bulge;
    }
    @Override
    public String getBulge(){
        return this.bulge;
    }
    public void setGasDustDetails(String gasDust){
        this.gasDust = gasDust;
    }
    public String getGassDustDetails(){
        return this.gasDust;
    }
}
