package polynom;

/**
 *
 * @author siror
 */
public class PolynomApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        Polynom p1 = new Polynom(a);
        Polynom p2 = Polynom.getInstanceFromReverted(a);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        Polynom poDer = p2.diff();
        System.out.println(poDer.toString());
    }
    
}
