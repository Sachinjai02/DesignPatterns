package creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonDemo {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for(int i=0;i<100000;++i) {
            threads.add( new Thread( () -> System.out.println(DatabaseConnection.getInstance())));
        }
        long start = System.currentTimeMillis();
        threads.forEach(Thread::start);
        threads.forEach( (thread) -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
