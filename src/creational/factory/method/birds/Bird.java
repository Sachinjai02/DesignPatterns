package creational.factory.method.birds;

import creational.factory.method.birds.sound.Sound;

public interface Bird {
    //This is a Factory Method which is responsible to create
    //correct Sound object of the corresponding Bird
    public Sound createSound();
}
