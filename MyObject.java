public class MyObject<T> {
  private T value;
  MyObject(){
    this.value = null;
  }

  MyObject(T v){
    this.value = v;
  }

  public T get(){
    return this.value;
  }

  public void setValue(T v){
    this.value = v;
  }
}
