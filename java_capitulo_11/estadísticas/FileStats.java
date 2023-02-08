package java_capitulo_11.estadísticas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class FileStats {
    private String file;

    public FileStats(String file) {
        this.file = file;
    }

    public String getFile() {
        return this.file;
    }

    public ArrayList<Word> getDifferentWords() throws Exception{
        HashMap<String, Word> words = new HashMap<String, Word>();
        ArrayList<Word> wordsToReturn = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.file));
            String line;
            while ((line=br.readLine())!=null) {
                String[] wordsArray = line.split(" ");
                for (int i = 0; i < wordsArray.length; i++) {
                    if (words.containsKey(wordsArray[i])) {
                        Word w = words.get(wordsArray[i]);
                        w.inc();
                        words.put(wordsArray[i], w);
                    } else {
                        words.put(wordsArray[i], new Word(wordsArray[i], 1));
                    }
                }
            }
            for (Word w : words.values()) {
                wordsToReturn.add(w);
            }
            br.close();
        } catch (Exception e) {
            throw e;
        }
        return wordsToReturn;
    }

    public ArrayList<String> getWords() throws Exception{
        ArrayList<String> lista = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.file));
            String linea;
            while ((linea=br.readLine())!=null) {
                String[] words = linea.split(" ");
                  for (int i = 0; i < words.length; i++) {
                      if (words[i]!=null && !words[i].equals("")) {
                          lista.add(words[i]);
                      }
                  }
            }
            br.close();
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }

    public ArrayList<String> getParagraphs() throws Exception{
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.file));
            String line;
            while ((line=br.readLine())!=null) {
                list.add(line);
            }
        } catch (Exception e) {
            throw e;
        }
        return list;
    }
}
