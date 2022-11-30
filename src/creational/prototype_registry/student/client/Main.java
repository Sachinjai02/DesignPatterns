package creational.prototype_registry.student.client;

import creational.prototype_registry.student.IntelligentStudent;
import creational.prototype_registry.student.Student;
import creational.prototype_registry.student.StudentRegistry;

public class Main {

    public static void fillRegistry(StudentRegistry registry) {
        Student aprilBatchStudentPrototype = new Student();
        aprilBatchStudentPrototype.setBatchName("April21Batch");
        aprilBatchStudentPrototype.setAvgBatchPsp(89.0);

        registry.register("april21Batch", aprilBatchStudentPrototype);

        IntelligentStudent aprBatchIntelligentStudentPrototype = new IntelligentStudent();
        aprBatchIntelligentStudentPrototype.setBatchName("April21Batch");
        aprBatchIntelligentStudentPrototype.setAvgBatchPsp(89.0);
        aprBatchIntelligentStudentPrototype.setIq(189);

        registry.register("april21IntelligentBatch", aprBatchIntelligentStudentPrototype);

    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student sachin = studentRegistry.get("april21Batch").clone();
        sachin.setAge(35);
        sachin.setName("Sachin");
        sachin.setPsp(99.7);
        System.out.println(sachin);
        IntelligentStudent intelligentNaman = (IntelligentStudent) studentRegistry.get("april21IntelligentBatch").clone();
        sachin.setAge(27);
        sachin.setName("Naman");
        sachin.setPsp(100);
        System.out.println(intelligentNaman);
    }
}
