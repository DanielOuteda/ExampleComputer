package ExampleComputer;

/**
 *
 * @author doutedasolla
 */
public class Mouse {

    private String type;

    /**
     * creamos un
     */
    public Mouse() {

    }

    /**
     * creamos un constructor con parametros llamado tipo
     *
     * @param type
     */
    public Mouse(String type) {
        this.type = type;
    }

    /**
     *
     * @param type
     */
    public void setMouse(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public String getMouse() {
        return type;
    }
}
