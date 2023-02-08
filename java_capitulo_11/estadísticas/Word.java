package java_capitulo_11.estadísticas;

public class Word implements Comparable<Word>{
    private String text;
    private int count;

    public Word(String text, int count) {
        this.text = text;
        this.count = count;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int inc(){
        return this.count++;
    }

    public int dec(){
        return this.count--;
    }

    @Override
    public String toString(){
        return this.text + String.format("(%d)", this.count);
    }

    @Override
    public boolean equals(Object o){
        return this==o || (o.getClass()==this.getClass() && this.text.equals(((Word)o).text));
    }

    @Override
    public int compareTo(Word w){
        Integer v1 = (Integer)this.count;
        return v1.compareTo((Integer)w.count);
    }
}
