package ExampleComputer;

/**
 *
 * @author doutedasolla
 */
public class Computer {

    private Mouse mouse = new Mouse();
    private Screen screen = new Screen();
    private CPU processor = new CPU();

    public Computer() {

    }

    public Computer(Mouse mouse, Screen screen, CPU cpu) {
        this.mouse = mouse;
        this.screen = screen;
        this.processor = cpu;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setCpu(CPU cpu) {
        this.processor = cpu;
    }

    public CPU getCpu() {
        return processor;
    }

    public void show() {
        System.out.println();

    }
}
