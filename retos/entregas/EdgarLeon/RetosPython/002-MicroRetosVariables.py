from cmath import pi
import statistics
import os
from tracemalloc import Statistic
os.system ("cls") 
print("")
print("================================================================================================")
print("1.1 Conocidos dos números, desarrolle un programa que calcule y muestre su promedio.")
list =  [2, 2]
mean = statistics.mean(list)
print("el promedio es:", mean)

print("================================================================================================")
print("*2.1 Desarrolle programas que permitan calcular el área de:")
print(" 2.2 Un cuadrado (Lado * Lado), conocido el lado.")
lado1 = 12
lado2 = 12
calcularea = (lado1) * (lado2)
print("el area del cuadrado es", calcularea)
print("")
print("")
print("* 2.3 Un rectángulo (Base x Altura), conocidas la base y la altura.")
base = 14
altura = 18
rectangulo = (base) * (altura)
print("Base por altura=", rectangulo)

print("================================================================================================")
print("* 2.4 Un círculo (Pi x radio ^2) conocido el radio y siendo Pi =",pi)
pi = 3.141592
radio = 4
circulo = (radio ** 2) * pi
print("circulo", circulo)
print("================================================================================================")

print("* 3 Desarrolle un programa que, conociendo sus notas (parcial, final, evaluación contínua y evaluación del profesor), calcule su nota final en UNEATLANTICO.")
parcial = int(input("Ingresa tu nota de tu Parcial: "))
final = int(input("Ingresa tu nota de tu Final: "))
evaluacion = int(input("Ingresa tu nota de tu evaluacion: "))
continua = int(input("Ingresa tu nota de la continua: "))
profesor = int(input("Ingresa tu nota de la evaluacion del profesor: "))
nota = (parcial, final, evaluacion, continua, profesor)
promedio = statistics.mean(nota)
print("Tu promedio es:",promedio)
print("================================================================================================")