package structural.flyweight.pubg.solution;



public class FlyingBullet {
    private double x, y, z; //variable
    private double speed; //variable
    private double direction; //variable
    private int bulletStatus; //variable ; fired, non fired
    private Bullet bullet; //Bullet with intrinsic properties

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public int getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(int bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
//variable properties are known as extrinsic properties

//Memory requirement for one object of FlyingBullet (which might be stored in memory of handheld device playing
//PUBG) has been reduced significantly compared to Bullet class in
// #structural.flyweight.pubg.problemimplementation.Bullet