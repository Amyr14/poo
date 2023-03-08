from Pessoa import Pessoa
from Aluno import Aluno
from Professor import Professor

alunos = []
profs = []

joao = Aluno('João', [4, 5])
alunos.append(joao)
jose = Aluno('José', [10, 9])
alunos.append(jose)
livia = Aluno('Livia', [7, 9])
alunos.append(livia)
vinicius = Aluno('Vinicius', [7, 4])
alunos.append(vinicius)
vitor = Aluno('Vitor', [5, 3])
alunos.append(vitor)
cleber = Professor('Cleber', 3000)
profs.append(cleber)
vilson = Professor('Vilson', 5000)
profs.append(vilson)

for aluno in alunos:
    print(aluno)

for prof in profs:
    print(prof)

