def es_palindromo(texto):
    texto = str(texto).lower().replace(" ", "")
    return texto == texto[::-1]

# Ejemplos
print(es_palindromo("reconocer"))      # True
print(es_palindromo("Anita lava la tina"))  # True
print(es_palindromo(12321))            # True
print(es_palindromo(12345))            # False
