/**
 * Tema08
 * 
 * 48º Crea una función que combine dos arrays en uno
 * 
 * @author Joseph Luca San Juan Thompson
 */

public class Tema08Ej48 {
    public static void main(String[] args) {
        int a[] = {8, 9, 0};
        int b[] = {1, 2, 3};
        
        for (int i : concatena(a, b)) {
            System.out.printf("%d ",i);
        }
    }

    public static int[] concatena(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i+a.length] = b[i];
        }
        return c;
    }
}
