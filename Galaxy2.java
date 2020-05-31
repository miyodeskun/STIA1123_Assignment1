/**
 * ELLIPTICAL GALAXIES
 * @author Amirul Luqman
 */
public class Galaxy2 extends Galaxy {
    
    private String bulge = "Bulge but no disk; halo is present";
    private String gasDust = "Little & cool";

    public Galaxy2() {
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
