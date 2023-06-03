# Módulo para obtener información de un artista en NYTimes (NewYork-3)

## Importar el módulo
Ejecutar en la carpeta raíz del proyecto
```
git submodule add https://github.com/AgusF22/AyDS23-NewYork3-NewYorkTimes.git libs/NYTService
```
y modificar los archivos `build.gradle` del proyecto y `settings.gradle` global agregando las líneas
```
implementation project(":NYTService")
```
y
```
include ":NYTService"
project (":NYTService").projectDir = new File("libs/NYTService")
```
respectivamente.

## Uso

La interfaz `NYTimesArtistInfoService` provee la función `getArtistInfo` que, dado un artista en formato String, devuelve un objeto `NYTArtistInfo` de haber sido encontrado, o `null` en caso contrario.

`NYTArtistInfo` es una clase representativa de la información obtenida. Contiene tres propiedades:
- `artist`: el nombre del artista,
- `abstract`: un fragmento de texto que describe al artista,
- `url`: un enlace al artículo completo de donde se extrajo el fragmento de texto anterior.

Para usar la interfaz anterior mencionada, se provee el inyector `NYTimesArtistInfoServiceInjector` que tiene una propiedad pública `newYorkTimesArtistInfoServiceImpl`.

## Uso (detallado)

1. Importar las clases `NYTimesArtistInfoService` y `NYTimesArtistInfoServiceInjector`:

```
import ayds.NYTService.injector.NYTimesArtistInfoServiceInjector
import ayds.NYTService.NYTimesArtistInfoService
```
2. Acceder al atributo público de la clase inyector que guarda una instancia del servicio:

```
service = NYTimesArtistInfoServiceInjector.newYorkTimesArtistInfoServiceImpl;
```
3. Utilizar la función `getArtistInfo()` para obtener la información de un artista pasado por parámetro en forma de un objeto de tipo `NYTArtistInfo` teniendo en cuenta lo mencionado con anterioridad:

```
getArtistInfo(artist: String): NYTArtistInfo?
```
