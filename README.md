# Universidad de La Punta

## Laboratorio I - Comisión 1 - Proyecto Final

### Integrantes

- Federico González
- Blas Haberland

### Objetivo
Desarrollar una aplicación **Java** de escritorio que permita administrar la venta
de pasajes de una empresa de colectivos. La aplicación debe gestionar la información
de rutas, horarios, pasajeros y ventas de pasajes. La aplicación debe interactuar con
una base de datos para almacenar y recuperar la información de manera eficiente.
###Requisitos Técnicos
##### Interfaz de Usuario:
La aplicación debe tener una interfaz gráfica de usuario (GUI) sencilla y fácil de usar,
creada con **Swing**.
##### Persistencia de Datos:
La aplicación debe utilizar **JDBC** para interactuar con una base de datos **MySQL**.

### Instalación

1. Clonar el proyecto.

```bash
git clone https://github.com/BlasHaberland/ProyectoFinal.git
```

2. Editar el archivo _src/main/java/DAO/DBConnection.java_ con los datos de conexión de MySQL.

```java
  private final String usuario = "root";
  private final String password = "";
  private final String baseDeDatos = "proyecto_final";
  private final String host = "localhost";
  private final String puerto = "3306";
```

3. Crear la base de datos.

```sql
CREATE DATABASE proyecto_final;
```

**EXTRA: Puede importar desde PHPMyAdmin, MySQL Workbench, o similar, el archivo _script/Script_Colectivo.sql_ que contiene datos de ejemplo**.

##### Capturas

![Laboratorio I](https://i.ibb.co/YcySYtP/lab-01.png 'Laboratorio I')

![Laboratorio I](https://i.ibb.co/jhNvH3J/lab-02.png 'Laboratorio I')

![Laboratorio I](https://i.ibb.co/NxJN81p/lab-03.png 'Laboratorio I')

![Laboratorio I](https://i.ibb.co/HxGxxtb/Proyecto-Final.png 'Laboratorio I')
