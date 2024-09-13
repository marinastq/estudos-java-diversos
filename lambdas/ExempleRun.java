package lambdas;

public class ExempleRun {
    public static void main(String... args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Howdy, world!");
            }
        };
        r.run();

        ////

        Runnable r2 = () -> System.out.println("Howdy, world!");
        r2.run();

    }
}
