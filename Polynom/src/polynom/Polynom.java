package polynom;

import java.util.Arrays;

/**
 *
 * @author siror
 */
public class Polynom {
    
    private int[] koeficient;
    
    public Polynom(int x0){
        koeficient = new int[1];
        koeficient[0] = x0;
    }
    
    public Polynom(int x1, int x0){
        koeficient = new int[2];
        koeficient[0] = x0;
        koeficient[1] = x1;
    }
    
    //nespravne poradi
    public Polynom(int... a){
        koeficient = Arrays.copyOf(a, a.length);
    }
    
    
    //spravne poradi
    public static Polynom getInstanceFromReverted(int... a){
        int[] b  = new int[a.length];
        for (int i = a.length - 1; i >= 0 ; i--) {
            b[i] = a[a.length - 1 - i];
        }
        return new Polynom(b);
    }
    
    public static Polynom getInstanceFromRevertedArray(int... a){
        return getInstanceFromReverted(a);
    }
    
    public static Polynom getInstanceFromNonReverted(int... a){
        return new Polynom(a);
    }
    
    public static Polynom getInstanceFromNonRevertedArray(int... a){
        return new Polynom(a);
    }
    
    public int getPolynom(){
        return koeficient.length;
    }
    
    public int getKoeff(int index){
        return koeficient[index];
    }
    
    public Polynom diff(){
        int[] a = new int[koeficient.length-1];
        for (int i = 0; i < a.length; i++) {
            a[i] = koeficient[i+1]*(i+1);
        }
        return new Polynom(a);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        for (int i = koeficient.length - 1; i >= 0; i--) {
            sb.append(koeficient[i]).append("x^").append(i).append(" ");
        }
        return sb.toString();
    }
    
}
