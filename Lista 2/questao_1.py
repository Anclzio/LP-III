import math

medicoes = []
for i in range(1, 11):
    medicao = float(input())
    medicoes.append(medicao)

media = sum(medicoes) / len(medicoes)

quadrados_diferencas = []
for i in medicoes:
    quadrados_diferencas.append(math.sqrt(abs(media - i))) 

soma_quadrado_diferencas = sum(quadrados_diferencas)
desvio_padrao = math.sqrt(soma_quadrado_diferencas / len(medicoes))

limite = media * 0.1 
if desvio_padrao > limite:
    estado = "com problemas"
else:
    estado = "dentro das normas"


print(f"Média:{media} Desvio padrão:{desvio_padrao}")
print("O multimetro está " + estado)
print("Medições:", medicoes)