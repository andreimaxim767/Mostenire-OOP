
package mostenire;

/**
 *
 * @author Andrei
 */
public class Urs extends Animal implements Vanator{

    public Urs(String nume) {
        super(nume);
    }

    @Override
    public void seHraneste() {
        System.out.println("Ursul "+nume+" mananca "+Main.junkFood());
    }

    @Override
    public void vaneaza() {
        System.out.println("Ursul "+nume+" vaneaza prin tomberoane");
    }
    public void speriePantofari(){
        System.out.println("Cucu-bau! zise ursul "+nume);
    }
}
