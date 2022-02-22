package i.solution;

public class Vortex implements Sailable, Drivable {
    @Override
    public void sail() {
        System.out.println("Vortex sailes");
    }

    @Override
    public void drive() {
        System.out.println("Vortex drives");
    }
}
