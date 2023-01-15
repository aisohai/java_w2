package pl.edu.wszib.lab1.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
    static ConnectionLazy instance1;
    static ConnectionLazy instance;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            instance1 = ConnectionLazy.getInstance();
        });
        instance = ConnectionLazy.getInstance();
        if (instance == instance1) {
            System.out.println(instance);
            System.out.println(instance1);
            System.out.println("Instances are the same");
        } else {
            System.out.println(instance);
            System.out.println(instance1);
            System.out.println("Instances are different");
        }
        System.out.println("Instance count: " + ConnectionLazy.counter.get());
        executorService.shutdown();
    }
}
