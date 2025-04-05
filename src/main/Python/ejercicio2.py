def son_anagramas(palabra1, palabra2):
    palabra1 = palabra1.lower().replace(" ", "")
    palabra2 = palabra2.lower().replace(" ", "")
    return sorted(palabra1) == sorted(palabra2)

# Ejemplos
print(son_anagramas("amor", "roma"))         # True
print(son_anagramas("listen", "silent"))     # True
print(son_anagramas("python", "java"))       # False
