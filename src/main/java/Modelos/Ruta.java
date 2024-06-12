package Modelos;

import java.time.LocalTime;

public class Ruta implements Comparable<Ruta> {

  private int idRuta;
  private Ciudad origen;
  private Ciudad destino;
  private LocalTime duracionEstimada;
  private boolean estado;

  public Ruta() {
  }

  public Ruta(Ciudad origen, Ciudad destino, LocalTime duracionEstimada, boolean estado) {
    this.origen = origen;
    this.destino = destino;
    this.duracionEstimada = duracionEstimada;
    this.estado = estado;
  }

  public Ruta(int idRuta, Ciudad origen, Ciudad destino, LocalTime duracionEstimada, boolean estado) {
    this.idRuta = idRuta;
    this.origen = origen;
    this.destino = destino;
    this.duracionEstimada = duracionEstimada;
    this.estado = estado;
  }

  public int getIdRuta() {
    return idRuta;
  }

  public void setIdRuta(int idRuta) {
    this.idRuta = idRuta;
  }

  public Ciudad getOrigen() {
    return origen;
  }

  public void setOrigen(Ciudad origen) {
    this.origen = origen;
  }

  public Ciudad getDestino() {
    return destino;
  }

  public void setDestino(Ciudad destino) {
    this.destino = destino;
  }

  public LocalTime getDuracionEstimada() {
    return duracionEstimada;
  }

  public void setDuracionEstimada(LocalTime duracionEstimada) {
    this.duracionEstimada = duracionEstimada;
  }

  public boolean isEstado() {
    return estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return origen + " - " + destino;
  }

  @Override
  public int compareTo(Ruta o) {
    return this.origen.getNombre().compareTo(o.origen.getNombre());
  }
}
