package Modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pasaje implements Comparable<Pasaje> {

  private int idPasaje;
  private Pasajero pasajero;
  private Colectivo colectivo;
  private Ruta ruta;
  private LocalDate fechaViaje;
  private LocalTime horaViaje;
  private int asiento;
  private double precio;
  private boolean estado;

  public Pasaje() {
  }

  public Pasaje(Pasajero pasajero, Colectivo colectivo, Ruta ruta, LocalDate fechaViaje, LocalTime horaViaje, int asiento, double precio, boolean estado) {
    this.pasajero = pasajero;
    this.colectivo = colectivo;
    this.ruta = ruta;
    this.fechaViaje = fechaViaje;
    this.horaViaje = horaViaje;
    this.asiento = asiento;
    this.precio = precio;
    this.estado = estado;
  }

  public Pasaje(int idPasaje, Pasajero pasajero, Colectivo colectivo, Ruta ruta, LocalDate fechaViaje, LocalTime horaViaje, int asiento, double precio, boolean estado) {
    this.idPasaje = idPasaje;
    this.pasajero = pasajero;
    this.colectivo = colectivo;
    this.ruta = ruta;
    this.fechaViaje = fechaViaje;
    this.horaViaje = horaViaje;
    this.asiento = asiento;
    this.precio = precio;
    this.estado = estado;
  }

  public int getIdPasaje() {
    return idPasaje;
  }

  public void setIdPasaje(int idPasaje) {
    this.idPasaje = idPasaje;
  }

  public Pasajero getPasajero() {
    return pasajero;
  }

  public void setPasajero(Pasajero pasajero) {
    this.pasajero = pasajero;
  }

  public Colectivo getColectivo() {
    return colectivo;
  }

  public void setColectivo(Colectivo colectivo) {
    this.colectivo = colectivo;
  }

  public Ruta getRuta() {
    return ruta;
  }

  public void setRuta(Ruta ruta) {
    this.ruta = ruta;
  }

  public LocalDate getFechaViaje() {
    return fechaViaje;
  }

  public void setFechaViaje(LocalDate fechaViaje) {
    this.fechaViaje = fechaViaje;
  }

  public LocalTime getHoraViaje() {
    return horaViaje;
  }

  public void setHoraViaje(LocalTime horaViaje) {
    this.horaViaje = horaViaje;
  }

  public int getAsiento() {
    return asiento;
  }

  public void setAsiento(int asiento) {
    this.asiento = asiento;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public boolean isEstado() {
    return estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return "Pasaje{" + "idPasaje=" + idPasaje + ", pasajero=" + pasajero + ", colectivo=" + colectivo + ", ruta=" + ruta + ", fechaViaje=" + fechaViaje + ", horaViaje=" + horaViaje + ", asiento=" + asiento + ", precio=" + precio + '}';
  }

  @Override
  public int compareTo(Pasaje o) {
    return this.fechaViaje.compareTo(o.getFechaViaje());
  }
}
