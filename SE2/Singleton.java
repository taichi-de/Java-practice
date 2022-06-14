package SE2;

class Singleton {

    private static Singleton instance;
    private Singleton () {}
    // Methode folgt hier

    // 1. return instance statt "this"
    public static Singleton getInstance1() {
        return instance;
    }

    // 2.
    public Singleton getInstance2() {
        if ( instance == null ) {
            instance = new Singleton();
        }
        return instance;
    }

    // 3.
    public static Singleton getInstance3() {
        return instance;
    }

    // 4.
    public static Singleton getInstance4() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    // 5.
    public static Singleton getInstance5() {
        if (instance == new Singleton ()) {
            instance = null;
        }
        return instance;
    }
}
