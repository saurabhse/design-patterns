package design.java.singleton;

public class SingletonWithDoubleLocking {
    private static volatile SingletonWithDoubleLocking INSTANCE;

    private SingletonWithDoubleLocking() {

    }

    public static SingletonWithDoubleLocking getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonWithDoubleLocking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonWithDoubleLocking();
                }
            }
        }
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
