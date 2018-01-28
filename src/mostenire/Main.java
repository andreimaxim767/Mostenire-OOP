
package mostenire;

/**
 *
 * @author Andrei
 */
public class Main {
    public static void main(String[] args) {
        Animal[] a = new Animal[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = makeInstance();
        }
        listeazaAnimale(a);
    }

    private static Animal makeInstance() {
        String[] numePosibile = {"Adrian", "Mihai", "Ana", "Elena", "Viorel", "Ioana", "Grigore", "Vasile", "Carmen", "Eufrosin", "Sever","Ghita"};
        String nume = numePosibile[(int) (Math.random() * numePosibile.length)];
        
        

        switch ((int) (Math.random() * 3)) {
            case 0:
                return new Leu(nume);
            case 1:
                return new Urs(nume);
            case 2:
                return new Cal(nume);
            default:
                return null;
        }
    }
    
    public static String junkFood(){
        String[] foods = {"gogosi","sfecla","mancare vegana","coceni","bataie","carte pe paine","fasole"};
        int i = (int)(Math.random()*foods.length);
        return foods[i];
    }

    private static void listeazaAnimale(Animal[] a) {
	// alternativa: for(Animal x:a) Java 8/for each
        for (int i = 0; i < a.length; i++) {
            a[i].seHraneste();
            if(a[i] instanceof Vanator){
                ((Vanator)a[i]).vaneaza();
                if(a[i] instanceof Leu){
                    ((Leu)a[i]).rage();
                }else{
                    ((Urs)a[i]).speriePantofari();
                }
            }else{
                ((AreCoama)a[i]).scuturaCoama();
                if(a[i] instanceof Leu){
                    ((Leu)a[i]).rage();
                }else{
                    ((Cal)a[i]).tropaie();
                }
            }
        }
    }
}
