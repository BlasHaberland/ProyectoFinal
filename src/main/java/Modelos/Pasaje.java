package Modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pasaje {

    private int idPasaje;
    private Pasajero pasajero;
    private Colectivo colectivo;
    private Ruta ruta;
    private LocalDate fehcaViaje;
    private LocalTime horaViaje;
    private int asiento;
    private double precio;

    public Pasaje() {
    }

    public Pasaje(Pasajero pasajero, Colectivo colectivo, Ruta ruta, LocalDate fehcaViaje, LocalTime horaViaje, int asiento, double precio) {
        this.pasajero = pasajero;
        this.colectivo = colectivo;
        this.ruta = ruta;
        this.fehcaViaje = fehcaViaje;
        this.horaViaje = horaViaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public Pasaje(int idPasaje, Pasajero pasajero, Colectivo colectivo, Ruta ruta, LocalDate fehcaViaje, LocalTime horaViaje, int asiento, double precio) {
        this.idPasaje = idPasaje;
        this.pasajero = pasajero;
        this.colectivo = colectivo;
        this.ruta = ruta;
        this.fehcaViaje = fehcaViaje;
        this.horaViaje = horaViaje;
        this.asiento = asiento;
        this.precio = precio;
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

    public LocalDate getFehcaViaje() {
        return fehcaViaje;
    }

    public void setFehcaViaje(LocalDate fehcaViaje) {
        this.fehcaViaje = fehcaViaje;
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

    @Override
    public String toString() {
        return "Pasaje{" + "idPasaje=" + idPasaje + ", pasajero=" + pasajero + ", colectivo=" + colectivo + ", ruta=" + ruta + ", fehcaViaje=" + fehcaViaje + ", horaViaje=" + horaViaje + ", asiento=" + asiento + ", precio=" + precio + '}';
    }
}
