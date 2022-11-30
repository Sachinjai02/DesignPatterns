package creational.prototype_registry.student;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> studentPrototypes = new HashMap<>();

    public void register(String key, Student prototype) {
        this.studentPrototypes.put(key, prototype);
    }

    public Student get(String key) {
        return studentPrototypes.get(key);
    }
}
