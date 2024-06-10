package Modelos;

public class Ciudad implements Comparable<Ciudad> {

  private int idCiudad;
  private String nombre;
  private String provincia;
  private boolean estado;

  public Ciudad() {
  }

  public Ciudad(String nombre, String provincia, boolean estado) {
    this.nombre = nombre;
    this.provincia = provincia;
    this.estado = estado;
  }

  public Ciudad(int idCiudad, String nombre, String provincia, boolean estado) {
    this.idCiudad = idCiudad;
    this.nombre = nombre;
    this.provincia = provincia;
    this.estado = estado;
  }

  public int getIdCiudad() {
    return idCiudad;
  }

  public void setIdCiudad(int idCiudad) {
    this.idCiudad = idCiudad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getProvincia() {
    return provincia;
  }

  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  public boolean isEstado() {
    return estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return nombre + " (" + provincia + ")";
  }

  @Override
  public int compareTo(Ciudad o) {
    return this.nombre.compareTo(o.getNombre());
  }
}
