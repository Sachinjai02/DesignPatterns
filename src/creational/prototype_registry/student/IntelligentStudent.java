package creational.prototype_registry.student;

public class IntelligentStudent extends Student {
    public double getIq() {
        return iq;
    }

    public void setIq(double iq) {
        this.iq = iq;
    }

    private double iq;

    public IntelligentStudent(IntelligentStudent is) {
        super(is); //copy constructor of parent
        this.iq = is.iq; //fill its own attributes
    }

    public IntelligentStudent() {

    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
