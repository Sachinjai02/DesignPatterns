package creational.factory.method.birds;

import creational.factory.method.birds.sound.Sound;
import creational.factory.method.birds.sound.SparrowSound;

public class Sparrow implements Bird {
    @Override
    public Sound createSound() {
        return new SparrowSound();
    }
}
