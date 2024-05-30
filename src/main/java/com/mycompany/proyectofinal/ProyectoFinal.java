package com.mycompany.proyectofinal;

import DAO.RutaData;

public class ProyectoFinal {

  public static void main(String[] args) {
//      ColectivoData
//        //borrarColectivo
//        ColectivoData colectivoData = new ColectivoData();
//        System.out.println(colectivoData.borrarColectivo(1));
//
//        //modificarColectivo
//        ColectivoData colectivoData = new ColectivoData();
//        Colectivo colectivo = colectivoData.obtenerColectivoPorId(1);
//        colectivo.setEstado(true);
//        System.out.println(colectivoData.modificarColectivo(colectivo));
//
//        //crearColectivo
//        ColectivoData colectivoData = new ColectivoData();
//        Colectivo colectivo = new Colectivo("AB123CD", "Volvo", "Travel", 50, true);
//        System.out.println(colectivoData.crearColectivo(colectivo));
//
//        //obternerColectivoPorMatricula
//        ColectivoData colectivoData = new ColectivoData();
//        Colectivo colectivo = colectivoData.obtenerColectivoPorId(1);
//        System.out.println(colectivoData.obtenerColectivoPorMatricula(colectivo.getMatricula()));
//
//        //obtenerColectivoPorId
//        ColectivoData colectivoData = new ColectivoData();
//        Colectivo colectivo = colectivoData.obtenerColectivoPorId(1);
//        System.out.println(colectivoData.obtenerColectivoPorId(colectivo.getIdColectivo()));
//
//        //obtenerColectivos
//        ColectivoData colectivoData = new ColectivoData();
//        List<Colectivo> colectivos = new ArrayList<>();
//        colectivos = colectivoData.obtenerColectivos();
//        System.out.println(colectivos);
//
//      PasajeroData
//        //borrarPasajero
//        PasajeroData pasajeroData = new PasajeroData();
//        System.out.println(pasajeroData.borrarPasajero(1));
//
//        //modificarPasajero
//        PasajeroData pasajeroData = new PasajeroData();
//        Pasajero pasajero = pasajeroData.obtenerPasajeroPorId(1);
//        pasajero.setEstado(true);
//        System.out.println(pasajeroData.modificarPasajero(pasajero));
//
//        //crearPasajero
//        PasajeroData pasajeroData = new PasajeroData();
//        Pasajero pasajero = new Pasajero("Brad", "Pitt", 32876543, "elpitt@gmail.com", "15432876345", true);
//        pasajeroData.crearPasajero(pasajero);
//
//        //obtenerPasajeroPorDni
//        PasajeroData pasajeroData = new PasajeroData();
//        System.out.println(pasajeroData.obtenerPasajeroPorDni(42133651));
//
//        //obtenerPasajeroPorId
//        PasajeroData pasajeroData = new PasajeroData();
//        System.out.println(pasajeroData.obtenerPasajeroPorId(1));
//
//        //listarPasajeros
//        List<Pasajero> pasajeros = new ArrayList<>();
//        PasajeroData pasajeroData = new PasajeroData();
//        pasajeros = pasajeroData.obtenerPasajeros();
//        System.out.println(pasajeros);

//      CiudadData
//        //borrarCiudad
//        CiudadData ciudadData = new CiudadData();
//        System.out.println(ciudadData.borrarCiudad(10));
//
//        //modificarCiudad
//        CiudadData ciudadData = new CiudadData();
//        Ciudad ciudad = ciudadData.obtenerCiudadPorId(1);
//        ciudad.setEstado(false);
//        System.out.println(ciudadData.modificarCiudad(ciudad));
//
//        //crearCiudad
//        CiudadData ciudadData = new CiudadData();
//        Ciudad ciudad = new Ciudad(" San Salvador de Jujuy", "Jujuy", true);
//        System.out.println(ciudadData.crearCiudad(ciudad));
//
//        //buscarCiudadPorNombre
//        CiudadData ciudadData = new CiudadData();
//        String ciudad = "Merlo";
//        System.out.println(ciudadData.obtenerCiudadPorNombre(ciudad));
//
//        //obtenerCiudadPorId
//        CiudadData ciudadData = new CiudadData();
//        System.out.println(ciudadData.obtenerCiudadPorId(8));
//
//        //listarCiudades
//        List<Ciudad> ciudades = new ArrayList<>();
//        CiudadData ciudadData = new CiudadData();
//        ciudades = ciudadData.obtenerCiudades();
//        System.out.println(ciudades);
//
// RUTAS
// 1. Obtener rutas
//    RutaData rutaData = new RutaData();
//    List<Ruta> rutas = rutaData.obtenerRutas();
//    System.out.println(rutas);
//
// 2. Obtener ruta por id
//    RutaData rutaData = new RutaData();
//    Ruta ruta = rutaData.obtenerRutaPorId(5);
//    System.out.println(ruta);
//
// 3. Obtener rutas por ciudad de origen
//    CiudadData ciudadData = new CiudadData();
//    Ciudad ciudad = ciudadData.obtenerCiudadPorId(1);
//    RutaData rutaData = new RutaData();
//    List<Ruta> rutas = rutaData.obtenerRutasPorOrigen(ciudad);
//    System.out.println(rutas);
//
// 4. Obtener rutas por ciudad de destino
//    CiudadData ciudadData = new CiudadData();
//    Ciudad ciudad = ciudadData.obtenerCiudadPorId(1);
//    RutaData rutaData = new RutaData();
//    List<Ruta> rutas = rutaData.obtenerRutasPorDestino(ciudad);
//    System.out.println(rutas);
//
// 5. Obtener rutas por ciudad de destino
//    CiudadData ciudadData = new CiudadData();
//    Ciudad ciudadOrigen = ciudadData.obtenerCiudadPorId(1);
//    Ciudad ciudadDestino = ciudadData.obtenerCiudadPorId(2);
//    RutaData rutaData = new RutaData();
//    List<Ruta> rutas = rutaData.obtenerRutasPorOrigenDestino(ciudadOrigen, ciudadDestino);
//    System.out.println(rutas);
//
// 6. Crear ruta
//    CiudadData ciudadData = new CiudadData();
//    RutaData rutaData = new RutaData();
//    Ciudad ciudadOrigen = ciudadData.obtenerCiudadPorId(1);
//    Ciudad ciudadDestino = ciudadData.obtenerCiudadPorId(4);
//    Ruta ruta = new Ruta(ciudadOrigen, ciudadDestino, LocalTime.of(3, 15), true);
//    boolean exito = rutaData.crearRuta(ruta);
//    System.out.println(exito);
//
// 7. Modificar ruta
//    RutaData rutaData = new RutaData();
//    Ruta ruta = rutaData.obtenerRutaPorId(5);
//    ruta.setDuracionEstimada(LocalTime.of(3, 25));
//    System.out.println(ruta);
//    boolean exito = rutaData.modificarRuta(ruta);
//    System.out.println(exito);
//
// 8. Eliminar ruta
    RutaData rutaData = new RutaData();
    boolean exito = rutaData.borrarRuta(5);
    System.out.println(exito);
  }
}
