# Pensamientos en voz alta

Partimos de la premisa que tenemos la posición del personaje en un vector tal que la posición de fila=5 columna=3 queda almacenada así:

```
    int[] elPersonaje = {5,3}
```

## ¿Qué es moverse?

Podemos asumir que moverse es cambiar dichas coordenadas. Entonces:

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

Con esta abstracción, moverse significaría elegir una dirección y sumar ese vector al vector de posición del personaje.

<div align="center">

**Moverse = Posición + Dirección**

|Posición|Dirección|Vector Dirección|Moverse
|-|-|-|-
|{5,3}|Arriba|{-1,0}|{4,3}
|{5,3}|Abajo|{1,0}|{6,3}
|{5,3}|Izquierda|{0,1}|{5,4}
|{5,3}|Derecha|{0,-1}|{5,2}

</div>

