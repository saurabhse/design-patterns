package patterns.creational.singleton;

public class SingletonWithEnum {
    public static void main(String[] args) {
        Singleton.getInstance();
    }
}


enum Singleton{
    INSTANCE;

    public static Singleton getInstance() {
        return INSTANCE;
    }
}