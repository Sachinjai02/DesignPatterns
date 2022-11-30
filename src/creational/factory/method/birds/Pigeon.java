package creational.factory.method.birds;

import creational.factory.method.birds.sound.PigeonSound;
import creational.factory.method.birds.sound.Sound;

public class Pigeon implements Bird {
    @Override
    public Sound createSound() {
        return new PigeonSound();
    }
}
