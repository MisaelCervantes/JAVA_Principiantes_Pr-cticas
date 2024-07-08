palabra = "parangaricutirimicuaro"
vocales = ['a', 'e', 'i', 'o', 'u']
resultado = ''

for letra in palabra:
    if letra.lower() not in vocales:
        resultado += letra

print(resultado)
#hacerlo p ara java
