package creational.factory.method.birds.sound;

public class SparrowSound implements Sound {
    @Override
    public void talk() {
        System.out.println("Chirp Chirp");
    }
}
