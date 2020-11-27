package behavioural.templatepat;

public class PSP extends PortableConsole{

    @Override
    public void insertGame() {
        System.out.println("Inserting disc " + game);
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on PSP");
    }

    @Override
    public void startGame() {
        System.out.println("Starting the game " + game + " on the PSP");
    }
    
}
