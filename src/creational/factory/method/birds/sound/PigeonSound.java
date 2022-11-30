package creational.factory.method.birds.sound;

public class PigeonSound implements Sound {
    @Override
    public void talk() {
        System.out.println("Kaw Kaw");
    }
}
