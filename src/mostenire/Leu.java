
package mostenire;

/**
 *
 * @author Andrei
 */
public class Leu extends Animal implements AreCoama,Vanator{

    public Leu(String nume) {
        super(nume);
    }
    
    @Override
    public void seHraneste() {
        System.out.println("Leul "+nume+" mananca "+Main.junkFood());
    }

    @Override
    public void scuturaCoama() {
        int n = (int)(Math.random()*1000);
        System.out.println("Cu un sampon obisnuit, leul "+nume+" pierde "+n+" fire la fiecare scuturare de coama");
    }

    @Override
    public void vaneaza() {
        System.out.println("Leul "+nume+" vaneaza momentul propice pentru un pui de somn");
    }

    void rage() {
        System.out.println("Rrrrrrrrrrooooooaaaaaaaaaarrrrrrrrghhhhhh man...!");
    }
    
}
