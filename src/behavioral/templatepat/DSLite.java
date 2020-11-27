package behavioral.templatepat;

public class DSLite extends PortableConsole {
    @Override
    public void insertGame() {
        System.out.println("Inserting cartridge " + game);
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on DS Lite");
    }

    @Override
    public void startGame() {
        System.out.println("Starting the game " + game + " on the DS Lite");
    }
}
