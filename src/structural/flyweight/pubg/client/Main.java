package structural.flyweight.pubg.client;

import structural.flyweight.pubg.solution.Bullet;
import structural.flyweight.pubg.solution.BulletRegistry;
import structural.flyweight.pubg.solution.FlyingBullet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //with problematic implementation
        BulletRegistry bulletRegistry = new BulletRegistry();
        populateRegistry(bulletRegistry);

        List<FlyingBullet> bulletList = new ArrayList<>();
        for(int i=0;i<200000;++i) {
            FlyingBullet fb = new FlyingBullet();
            fb.setSpeed(100.22);
            //all extrinsic properties

            fb.setBullet(bulletRegistry.get(i%10));
            bulletList.add(fb);
        }

        System.out.println("number of objects : " + bulletList.size());
    }

    private static void populateRegistry(BulletRegistry bulletRegistry) {
        for(int i=0;i<10;++i) {
            Bullet bullet = new Bullet();
            bulletRegistry.registerBullet(i, bullet);
        }
    }
}
