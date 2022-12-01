package structural.flyweight.pubg.solution;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    private Map<Integer, Bullet> bulletMap = new HashMap<>();

    public void registerBullet(int type, Bullet bullet) {
        this.bulletMap.put(type, bullet);
    }

    public Bullet get(int type) {
        return this.bulletMap.get(type);
    }
}
