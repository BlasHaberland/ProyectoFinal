package Modelos;

import java.time.LocalTime;

public class Horario implements Comparable<Horario> {

  private int idHorario;
  private Ruta ruta;
  private LocalTime horaSalida; 
  private LocalTime horaLlegada;
  private boolean estado;

  public Horario() {
  }

  public Horario(Ruta ruta, LocalTime horaSalida, LocalTime horaLlegada, boolean estado) {
    this.ruta = ruta;
    this.horaSalida = horaSalida;
    this.horaLlegada = horaLlegada;
    this.estado = estado;
  }

  public Horario(int idHorario, Ruta ruta, LocalTime horaSalida, LocalTime horaLlegada, boolean estado) {
    this.idHorario = idHorario;
    this.ruta = ruta;
    this.horaSalida = horaSalida;
    this.horaLlegada = horaLlegada;
    this.estado = estado;
  }

  public int getIdHorario() {
    return idHorario;
  }

  public void setIdHorario(int idHorario) {
    this.idHorario = idHorario;
  }

  public Ruta getRuta() {
    return ruta;
  }

  public void setRuta(Ruta ruta) {
    this.ruta = ruta;
  }

  public LocalTime getHoraSalida() {
    return horaSalida;
  }

  public void setHoraSalida(LocalTime horaSalida) {
    this.horaSalida = horaSalida;
  }

  public LocalTime getHoraLlegada() {
    return horaLlegada;
  }

  public void setHoraLlegada(LocalTime horaLlegada) {
    this.horaLlegada = horaLlegada;
  }

  public boolean isEstado() {
    return estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return horaSalida + " - " + horaLlegada;
  }

  @Override
  public int compareTo(Horario o) {
    return this.horaSalida.compareTo(o.getHoraSalida());
  }

}
