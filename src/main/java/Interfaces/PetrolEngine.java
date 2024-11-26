package Interfaces;

public class PetrolEngine implements Engine {
    @Override
    public void engine_type() {
        System.out.println("Petrol Engine\n");
    }

    @Override
    public void start()
    {
        System.out.println("Petrol Engine Started\n");
    }
}
