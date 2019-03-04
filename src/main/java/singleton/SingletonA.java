package singleton;

public class SingletonA {

    private SingletonA() {
    }

    private static class getSingletonA {
        public static SingletonA singleton = new SingletonA();
    }

    public static SingletonA getInstance() {
        return getSingletonA.singleton;
    }

}
