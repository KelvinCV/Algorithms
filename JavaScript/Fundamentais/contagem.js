// Algoritmo Fundamental Nº 2
// Descrição : Contagem.
// Problema  : Dado um conjunto de N notas de um exame, fazer uma contagem do
//             número de alunos que passaram no exame. Passará o aluno que
//             tirar nota 50 ou maior (no intervalo de 0 a 100).
// Aplicações: Todas as formas de contagem.

var n = prompt ("Informe a quantidade de notas");
var nota;
var contador = 0;
var i = 0;

while (i < n) {
    nota = prompt("Informe uma nota de 0 a 100")

    if(nota >= 50) {
        contador = contador + 1;
    }

    i = i + 1
}

document.write("Número de alunos que passaram no exame é igual a " + contador);
