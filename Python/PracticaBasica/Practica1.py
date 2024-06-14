import random


numeros = [random.randint(-10, 10) for _ in range(10)]

cuentaNegativo = 0
cuentaPositivo = 0
cuentaCero = 0


for numero in numeros:
    if numero > 0:
        cuentaPositivo += 1
    elif numero < 0:
        cuentaNegativo += 1
    else:
        cuentaCero += 1


print("Números:", numeros)
print("El total de números positivos es:", cuentaPositivo)
print("El número total de números negativos es:", cuentaNegativo)
print("El número total de ceros es:", cuentaCero)