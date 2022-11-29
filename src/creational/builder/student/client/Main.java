package creational.builder.student.client;

import creational.builder.student.Student.StudentBuilder;
import creational.builder.student.Student;

public class Main {
    public static void main(String[] args) {
        StudentBuilder builder = Student.getBuilder();
        Student student = builder.setAge(25)
                .setPsp(99.26)
                .setBatch("Oct Intermediate")
                .setGradYear(2009)
                .setPhoneNumber("9922248222")
                .setUniversityName("NSIT")
                .setName("Sachin")
                .setId(1)
                .build();
        System.out.println("Student created " + student);
        //Invalid student property phone number
        try {
            student = builder.setAge(25)
                    .setPsp(99.26)
                    .setBatch("Oct Intermediate")
                    .setGradYear(2009)
                    .setPhoneNumber("2248222")
                    .setUniversityName("NSIT")
                    .setName("Sachin")
                    .setId(11)
                    .build();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
