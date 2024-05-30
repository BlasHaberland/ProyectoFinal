package Modelos;

import java.time.LocalTime;

public class Horario {

  private int idHorario;
  private Ruta ruta;
  private LocalTime horaSalida; // Verificar que sea el tipo de dato correcto
  private LocalTime horaLlegada; // Verificar que sea el tipo de dato correcto

  public Horario() {
  }

  public Horario(Ruta ruta, LocalTime horaSalida, LocalTime horaLlegada) {
    this.ruta = ruta;
    this.horaSalida = horaSalida;
    this.horaLlegada = horaLlegada;
  }

  public Horario(int idHorario, Ruta ruta, LocalTime horaSalida, LocalTime horaLlegada) {
    this.idHorario = idHorario;
    this.ruta = ruta;
    this.horaSalida = horaSalida;
    this.horaLlegada = horaLlegada;
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

  @Override
  public String toString() {
    return ruta.getOrigen() + " - " + ruta.getDestino() + " - " + horaSalida + "-" + horaLlegada;
  }

}
