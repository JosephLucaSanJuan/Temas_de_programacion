package java_capitulo_11.estadísticas;

import java.util.ArrayList;

public class Stats {
    public static void main(String[] args) {
        if (args.length!=1) {
            System.out.println("Error en el paso de argumentos");
            return;
        }
        String file = args[0];
        FileStats fs = new FileStats(file);
        try {
            ArrayList<String> paragraphs = fs.getParagraphs();
            ArrayList<String> words = fs.getWords();
            ArrayList<Word> difWords = fs.getDifferentWords();
            System.out.println("Número de líneas: "+paragraphs.size());
            System.out.println("Número de palabras: "+words.size());
            System.out.println("Número de palabras diferentes: "+difWords.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
