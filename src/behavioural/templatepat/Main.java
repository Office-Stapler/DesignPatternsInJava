package behavioural.templatepat;

public class Main {
   public static void main(String[] args) {
        PortableConsole gameboy = new GameBoy();
        gameboy.play("Pokemon Red");

        PortableConsole dslite = new DSLite();
        dslite.play("Pokemon Diamond");

        PortableConsole psp = new PSP();
        psp.play("Need for Speed: Most Wanted");
   } 
}
