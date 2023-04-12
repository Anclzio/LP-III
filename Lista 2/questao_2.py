import random
import time

game_state = True

while game_state:
    input("Pressione Enter para lançar os dados...")
    dado1 = random.randint(1, 6)
    dado2 = random.randint(1, 6)
    soma_dados = dado1 + dado2

    print(f"Dado 1: {dado1}, Dado 2: {dado2}")
    if soma_dados == 7 or soma_dados == 11:
        print("Você ganhou :-)")
        time.sleep(2)  # pausa por 2 segundos
        game_state = False
    elif soma_dados == 2 or soma_dados == 3 or soma_dados == 12:
        print("Você perdeu :-(")
        time.sleep(2)  # pausa por 2 segundos
        game_state = False
    else:
        ponto = soma_dados
        print(f"Ponto: {ponto}")
        print("Iniciando estágio 2")
        jogada = 1
        while True:
            input("Pressione Enter para lançar os dados novamente...")
            dado1 = random.randint(1, 6)
            dado2 = random.randint(1, 6)
            soma_dados = dado1 + dado2

            print("Dado 1: {}, Dado 2: {}".format(dado1, dado2))
            jogada += 1
            print(f"Jogada {jogada}: {soma_dados}")
            if soma_dados == 7:
                print("Você perdeu :-(")
                time.sleep(2)  # pausa por 2 segundos
                game_state = False
                break
            elif soma_dados == ponto:
                print("Você ganhou :-)")
                time.sleep(2)  # pausa por 2 segundos
                game_state = False
                break