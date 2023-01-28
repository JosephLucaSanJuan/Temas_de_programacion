public class Disco {
  private String codigo;
  private String titulo;
  private String autor;
  private String tipo;

  public Disco(String codigo, String titulo, String autor, String tipo) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.autor = autor;
    this.tipo = tipo;
  }

  public String getCodigo() {
    return this.codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Disco other = (Disco) obj;
    if (codigo == null) {
      if (other.codigo != null)
        return false;
    } else if (!codigo.equals(other.codigo))
      return false;
    return true;
  }

  @Override
  public String toString() {
    String cadena = "---------------------";
          cadena += "\nCódigo: " + this.codigo;
          cadena += "\nTítulo: " + this.titulo;
          cadena += "\nAutor: " + this.autor;
          cadena += "\nTipo de media: " + this.tipo;
          cadena += "\n---------------------";
    return cadena;
  }
}