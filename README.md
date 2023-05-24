# Módulo para obtener información de un artista en NYTimes

## Uso
La interfaz `NYTimesArtistInfoService` provee la función `getArtistInfo` que, dado un artista en formato String, devuelve un objeto `NYTArtistInfo` de haber sido encontrado, o `null` en caso contrario.

`NYTArtistInfo` es una clase representativa de la información obtenida. Contiene tres propiedades:
- `artist`: el nombre del artista,
- `abstract`: un fragmento de texto que describe al artista,
- `url`: un enlace al artículo completo de donde se extrajo el fragmento de texto anterior.
