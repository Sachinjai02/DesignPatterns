package creational.builder.student;

/* Class having lot of attributes
and we need to validate some of them before we want its object its created
or it's an immutable object
 */

import java.util.Calendar;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;

    //We should have this as private if we do not want anyone to directly
    //create an object without using Builder (validations)
    //And if we have made this private, we would need to have Builder within the same class
    private Student() {

    }

    //The builder class instance should come from the Student class only
    // and since it has to be available before creation of the student instance it must be a static
    //method. Not only the method should be static but the StudentBuilder nested class should also be static (and
    //public)
    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String batch;
        private long id;
        private int gradYear;

        private String phoneNumber;

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public StudentBuilder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public StudentBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public StudentBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            if(this.age < 18) {
                throw new RuntimeException("This course is not allowed for students below 18 years of age!");
            }
            if(this.phoneNumber != null && this.phoneNumber.length() < 10) {
                throw new RuntimeException("Invalid phone number");
            }
            if(this.gradYear > Calendar.getInstance().get(Calendar.YEAR)) {
                throw new RuntimeException("Course can be taken only for graduated students!");
            }

            Student stud = new Student();
            stud.age = this.age;
            stud.psp = this.psp;
            stud.name = this.name;
            stud.batch = this.batch;
            stud.gradYear = this.gradYear;
            stud.id = this.id;
            stud.phoneNumber = this.phoneNumber;
            stud.universityName = this.universityName;
            return stud;
        }

    }

}
