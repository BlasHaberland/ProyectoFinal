package Modelos;

import java.time.Duration;

public class Ruta {

  private int idRuta;
  private String origen;
  private String destino;
  private Duration duracionEstimada;

  public Ruta() {
  }

  public Ruta(String origen, String destino, Duration duracionEstimada) {
    this.origen = origen;
    this.destino = destino;
    this.duracionEstimada = duracionEstimada;
  }

  public Ruta(int idRuta, String origen, String destino, Duration duracionEstimada) {
    this.idRuta = idRuta;
    this.origen = origen;
    this.destino = destino;
    this.duracionEstimada = duracionEstimada;
  }

  public int getIdRuta() {
    return idRuta;
  }

  public void setIdRuta(int idRuta) {
    this.idRuta = idRuta;
  }

  public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  public Duration getDuracionEstimada() {
    return duracionEstimada;
  }

  public void setDuracionEstimada(Duration duracionEstimada) {
    this.duracionEstimada = duracionEstimada;
  }

  @Override
  public String toString() {
    return origen + " - " + destino;
  }
}
