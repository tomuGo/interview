package singleton;

public class SingletonB {

    private static SingletonB singletonB = null;

    private SingletonB() {

    }

    public SingletonB getInstance() {
        if (singletonB == null) {
            synchronized (SingletonB.class) {
                if (singletonB == null) {
                    singletonB = new SingletonB();
                }
            }
        }
        return singletonB;
    }

}
