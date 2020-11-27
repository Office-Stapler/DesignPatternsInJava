package behavioral.templatepat;

public class GameBoy extends PortableConsole {
    @Override
    public void insertGame() {
        System.out.println("Inserting cartridge " + game);
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on GameBoy");
    }

    @Override
    public void startGame() {
        System.out.println("Starting the game " + game + " on the GameBoy");
    }
}
