package i.problem;

public class Boat  implements Vehicle  {
    //I was force to implement fly even though boats don't fly
    @Override
    public void drive() {
        throw new UnsupportedOperationException();

    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sail() {
        System.out.println("Boat sails");
    }
}
