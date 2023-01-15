package pl.edu.wszib.lab1.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public final class ConnectionLazy {
    private static ConnectionLazy INSTANCE;
    public static AtomicInteger counter = new AtomicInteger(0);

    private ConnectionLazy() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConnectionLazy getInstance() {
        // double check locking
        if (INSTANCE == null) {
            synchronized (ConnectionLazy.class) {
                if (INSTANCE == null) {
                    counter.incrementAndGet();
                    INSTANCE = new ConnectionLazy();
                }
            }
        }
        return INSTANCE;
    }

//    synchronized
}
