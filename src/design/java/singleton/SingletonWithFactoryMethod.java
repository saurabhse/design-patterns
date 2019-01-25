package design.java.singleton;

public class SingletonWithFactoryMethod {

    private static final SingletonWithFactoryMethod INSTANCE = new SingletonWithFactoryMethod();

    private SingletonWithFactoryMethod() {

    }

    public static SingletonWithFactoryMethod getInstance() {
        return INSTANCE;
    }
}
