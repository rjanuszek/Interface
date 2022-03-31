package model.computer;

public interface Music {

    // 1. NIE MOŻNA DODAWAĆ PÓL OBIEKTÓW
    // 2. MOŻNA TWORZYĆ TYLKO STAŁE - (domyślne) public static final
    String NAME = "Music";

    // 3. TYLKO METODY ABSTRAKCYJNE- (domyślne) public abstract
    void playMusic();
    void pauseMusic();
    void stopMusic();

    // 4. METODY DOMYŚLE - ZWYKŁE METODY
    default void sayHello() {
        System.out.println("Hello from default music");
    }

    // 5. METODY STATYCZNE
    static String getName() {
        privateMethod();
        return NAME;
    }

    // 6. PRYWATNE STATYCZNE METODY
    private static void privateMethod() {
        System.out.println("Hello from private method");
    }


}
