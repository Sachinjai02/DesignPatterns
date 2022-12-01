package structural.flyweight.pubg.solution;

import java.awt.*;

public class Bullet {
    private double radius; //fixed
    private int type; //fixed
    private double weight; //fixed
    private int color; //fixed

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    private double maxPower; //fixed
    private byte[] image; //fixed
}
//All these properties are basically fixed and termed as intrinsic properties.