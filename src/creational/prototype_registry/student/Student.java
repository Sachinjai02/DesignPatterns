package creational.prototype_registry.student;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    private double avgBatchPsp;
    private String batchName;

    public Student(Student s) {
        this.avgBatchPsp = s.avgBatchPsp;
        this.batchName = s.batchName;
        this.age = s.age;
        this.name = s.name;
        this.psp = s.psp;
    }

    public Student() {

    }

    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
}
