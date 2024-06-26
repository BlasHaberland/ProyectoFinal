package Modelos;

import java.util.Objects;

public class Colectivo implements Comparable<Colectivo> {

  private int idColectivo;
  private String matricula;
  private String marca;
  private String modelo;
  private int capacidad;
  private boolean estado;

  public Colectivo() {
  }

  public Colectivo(String matricula, String marca, String modelo, int capacidad, boolean estado) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.capacidad = capacidad;
    this.estado = estado;
  }

  public Colectivo(int idColectivo, String matricula, String marca, String modelo, int capacidad, boolean estado) {
    this.idColectivo = idColectivo;
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.capacidad = capacidad;
    this.estado = estado;
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

  public boolean isEstado() {
    return estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
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
    return matricula + " - " + marca + " " + modelo;
  }

  @Override
  public int compareTo(Colectivo o) {
    return this.marca.compareTo(o.getMarca());
  }
}
