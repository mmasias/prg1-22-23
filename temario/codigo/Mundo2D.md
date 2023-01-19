# Pensamientos en voz alta

Partimos de la premisa que hemos abstraido a nuestro personaje y el dato que nos interesa de él, **la posición**, en un vector, de modo que *fila=5 columna=3* queda almacenada así:

```
    int[] elPersonaje = {5,3}
```

## ¿Qué es moverse?

A partir de esta abstracción, moverse sería cambiar dichas coordenadas. Con esto en mente:

- Si queremos que el personaje suba, restamos 1 a la fila: ```{4,3}```
- Si queremos que el personaje baje, sumamos 1 a la fila: ```{6,3}```
- Si queremos que el personaje vaya a la izquierda, restamos 1 a la columna: ```{5,2}```
- Si queremos que el personaje vaya a la derecha, sumamos 1 a la columna: ```{5,4}```

Por tanto, moverse sería sumar una unidad a la dimensión adecuada del vector del personaje.

<div align="center">

|Dirección|Cambio
|-|-
|Arriba|```{-1,0}```
|Abajo|```{1,0}```
|Izquierda|```{0,1}```
|Derecha|```{0,-1}```

</div>

Es decir que moverse significaría elegir una dirección y sumar ese vector al vector de posición del personaje.

<div align="center">

**Moverse = Posición + Dirección**

|Posición inicial|Dirección|Moverse|Posición final
|:-:|-|-|:-:
|```{5,3}```|Arriba|```{5,3} + {-1,0}```|```{4,3}```
|```{5,3}```|Abajo|```{5,3} + {1,0}```|```{6,3}```
|```{5,3}```|Izquierda|```{5,3} + {0,1}```|```{5,4}```
|```{5,3}```|Derecha|```{5,3} + {0,-1}```|```{5,2}```

</div>

