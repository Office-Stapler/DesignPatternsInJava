package behavioral.templatepat;

public abstract class PortableConsole {
    protected String game;
    public void play(String game) {
        this.game = game;
        insertGame();
        powerOn();
        startGame();
        System.out.println();
    }

    public abstract void insertGame();
    public abstract void powerOn();
    public abstract void startGame();
}
