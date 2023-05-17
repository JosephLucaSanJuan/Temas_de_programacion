public class Tema08Ej53 {
    public static void main(String[] args) {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random()*100+1);
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }

        System.out.println(nEsimo(array, 1));
        System.out.println(nEsimo(array, 30));
        System.out.println(nEsimo(array, 100));
        System.out.println(nEsimo(array, 26));
        System.out.println(nEsimo(array, 13));
    }

    public static int nEsimo(int[][] n, int posicion){
        int filas = n.length;
        int columnas = n.length;

        if (posicion < 0 || posicion >= filas*columnas) {
          return -1;
        } else {
            return n[posicion/columnas][posicion%columnas];
        }
    }
}
