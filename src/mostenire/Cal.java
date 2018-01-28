
package mostenire;

/**
 *
 * @author Andrei
 */
public class Cal extends Animal implements AreCoama{

    public Cal(String nume) {
        super(nume);
    }

    @Override
    public void seHraneste() {
        System.out.println("Calul "+nume+" mananca "+Main.junkFood());
    }

    @Override
    public void scuturaCoama() {
        System.out.println("Coama lui "+nume+" ii intra in ochi calaretului");
    }
    public void tropaie(){
        System.out.println("Tropa-trop, spuse bidiviul "+nume);
    }
}
