package Modelos;

import java.util.Objects;

public class Pasajero {

  private int idPasajero;
  private String nombre;
  private String apellido;
  private int dni;
  private String correo;
  private String telefono;

  public Pasajero() {
  }

  public Pasajero(String nombre, String apellido, int dni, String correo, String telefono) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.correo = correo;
    this.telefono = telefono;
  }

  public Pasajero(int idPasajero, String nombre, String apellido, int dni, String correo, String telefono) {
    this.idPasajero = idPasajero;
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.correo = correo;
    this.telefono = telefono;
  }

  public int getIdPasajero() {
    return idPasajero;
  }

  public void setIdPasajero(int idPasajero) {
    this.idPasajero = idPasajero;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getDni() {
    return dni;
  }

  public void setDni(int dni) {
    this.dni = dni;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + this.dni;
    hash = 89 * hash + Objects.hashCode(this.correo);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Pasajero other = (Pasajero) obj;
    if (this.dni != other.dni) {
      return false;
    }
    return Objects.equals(this.correo, other.correo);
  }

  @Override
  public String toString() {
    return dni + " - " + apellido + ", " + nombre;
  }
}
