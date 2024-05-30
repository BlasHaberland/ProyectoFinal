package Modelos;

import java.util.Objects;

public class Colectivo {

  private int idColectivo;
  private String matricula;
  private String marca;
  private String modelo;
  private int capacidad;

  public Colectivo() {
  }

  public Colectivo(String matricula, String marca, String modelo, int capacidad) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.capacidad = capacidad;
  }

  public Colectivo(int idColectivo, String matricula, String marca, String modelo, int capacidad) {
    this.idColectivo = idColectivo;
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.capacidad = capacidad;
  }

  public int getIdColectivo() {
    return idColectivo;
  }

  public void setIdColectivo(int idColectivo) {
    this.idColectivo = idColectivo;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getCapacidad() {
    return capacidad;
  }

  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.matricula);
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
    final Colectivo other = (Colectivo) obj;
    return Objects.equals(this.matricula, other.matricula);
  }

  @Override
  public String toString() {
    return matricula + " - " + marca + " " + modelo + " (" + capacidad + " pasajeros)";
  }
}
