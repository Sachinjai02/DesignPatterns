package structural.flyweight.pubg.solution;



public class FlyingBullet {
    private double x, y, z; //variable
    private double speed; //variable
    private double direction; //variable
    private Bullet bullet; //Bullet with intrinsic properties
}
//variable properties are known as extrinsic properties

//Memory requirement for one object of FlyingBullet (which might be stored in memory of handheld device playing
//PUBG) has been reduced significantly compared to Bullet class in
// #structural.flyweight.pubg.problemimplementation.Bullet