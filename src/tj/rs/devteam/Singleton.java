package tj.rs.devteam;

/**
 * @author Rustam Safarov(RS)
 * created at 07.10.2020
 */
public class Singleton {
    private volatile static Singleton instance;
    public static String str;
    private Singleton() {}

    static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
