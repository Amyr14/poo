
from Filme import Filme
import json

def nota_filme(filme):
    return filme.nota

f = open('filmes.json')
array_json = json.loads(f.read())
lista_filmes = []

for json in array_json:
    filme = Filme()
    filme.converte_json(json)
    lista_filmes.append(filme)

lista_filmes.sort(key=nota_filme)

for filme in lista_filmes:
    print(filme)