### Proyecto Peliculas

#### Estructura de carpetas
La estructura de carpetas del proyecto a realizar es el siguiente:

- proyectoPeliculas
  - clases
    - Pelicula.java
  - utils
    - JsonReaderUtil.java
  - Main.java

#### Librería GSON externa y uso de la misma

Sigue las instrucciones que podrás ver en Moodle para incorporar la librería GSON a tu proyecto.

#### Lectura de archivo de peliculas

Para poder realizar la práctica deberás seguir exactamente los pasos que se indican:
1. Descarga e incluye en tu proyecto el archivo *Top250Movies.json*
2. La estructura de carpetas donde deberás incluir dicho archivo es la siguiente
   - resources
     - IMDB-api
       - Top250Movies.json
3. Dentro de la clase Main.java incluye las siguientes dos líneas de código:
```java:
String pelisPath = "IMDB-api/Top250Movies.json";
ArrayList<Pelicula> peliculas = JsonReaderUtil.loadJsonFile(pelisPath);
```
4. La clase Pelicula debe ser exactamente como se indica en la práctica.