# El guerrero vs el vampiro

# Reto base

Un guerrero -equipado con un hacha- se encuentra durante una travesía con un vampiro hostil, e inician una lucha. El vampiro, aunque débil, es muy ágil y puede atacar mordiendo al guerrero con sus afilados dientes. 

Desarrolle un algoritmo que simule y describa cada paso de esta batalla y finalmente diga quién ha ganado. Para simular la batalla, asuma que cada oponente da un golpe a la vez, y que la probabilidad de acertar con dicho golpe es del 50%.

A continuación, datos relevantes de ambos luchadores:
 
| | Guerrero | Vampiro |
|-|-|-|
|Poder:|20 HP|10 HP|
|Ataque:|2|4|
|% éxito|50%|50%

# Reto extendido

El Héroe y el Vampiro cuentan con una energía inicial de 150 y 60 puntos respectivamente.

El Héroe cuenta con tres armas que responden a las siguientes reglas:

| | Ataque | Probabilidad de éxito |
|-|-|-|
| Arma 1 | 7 | 50 % |
| Arma 2 | 15 | 25 % |
| Arma 3 | 30 | 12 % |

El Vampiro cuenta con tres ataques que responden a las siguientes reglas:

| | Ataque | Probabilidad de éxito |
|-|-|-|
| Ataque 1 | 5 | 90 % |
| Ataque 2 | 10 | 60 % |
| Ataque 3 | 20 | 40 % |

El usuario controla las acciones del Héroe, pudiendo elegir el arma en cada turno de batalla. 

El programa controla las acciones del Vampiro, eligiendo aleatoriamente el ataque que realiza. Los tres ataques tienen la misma probabilidad de ser elegidos.