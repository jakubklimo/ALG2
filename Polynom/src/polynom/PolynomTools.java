package polynom;

/**
 *
 * @author siror
 */
public class PolynomTools {
    
    public static Polynom soucet(Polynom polynom1, Polynom polynom2){
        Polynom mensi = (polynom1.getPolynom() < polynom2.getPolynom()) ? polynom1 : polynom2;
        Polynom vetsi = (polynom1.getPolynom() >= polynom2.getPolynom()) ? polynom1 : polynom2;
        int[] soucet = new int[vetsi.getPolynom()];
        
        for (int i = 0; i < mensi.getPolynom(); i++) {
            soucet[i] = (polynom1.getKoeff(i) + polynom2.getKoeff(i));
        }
        for (int i = mensi.getPolynom(); i < vetsi.getPolynom(); i++) {
            soucet[i] = (vetsi.getKoeff(i));
        }
        return Polynom.getInstanceFromNonRevertedArray(soucet);
    }
    
    public static Polynom nasob(Polynom polynom1, Polynom polynom2){
        int[] nasobek = new int[polynom1.getPolynom() + polynom2.getPolynom() - 1];
        
        for (int i = 0; i < polynom1.getPolynom(); i++) {
            for (int j = 0; j < polynom2.getPolynom(); j++) {
                int pom = i + j;
                nasobek[pom] += polynom1.getKoeff(i) * polynom2.getKoeff(j);
            }
        }
        return Polynom.getInstanceFromRevertedArray(nasobek);
    }
    
    public static void main(String[] args) {
        Polynom p1 = Polynom.getInstanceFromNonReverted(3,2,2);
        Polynom p2 = Polynom.getInstanceFromNonReverted(4,2);
        Polynom sum = soucet(p1,p2);
        System.out.println(sum);
        Polynom nasobek = nasob(p1,p2);
        System.out.println(nasobek);
        
    }
}

