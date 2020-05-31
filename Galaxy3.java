/**
 * IRREGULAR GALAXIES
 * @author User
 */
public class Galaxy3 extends Galaxy {
    
    private String bulge  = "May show signs of a disk and/or a bulge; halo is present";
    private String gasDust  = "Usually Rich";

    public Galaxy3() {
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
