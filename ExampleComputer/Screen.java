package ExampleComputer;

/**
 *
 * @author doutedasolla
 */
public class Screen {

    private String brand;
    private float inches;

    public Screen() {

    }

    public Screen(String brand, float inches) {
        this.brand = brand;
        this.inches = inches;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getInches() {
        return inches;
    }

    public void setInches(float inches) {
        this.inches = inches;
    }
}
