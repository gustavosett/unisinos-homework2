# unisinos-homework2

```
LABORATÓRIO II DESAFIO
Semestre: 20 23 / 1 Etapas descritas neste documento 1 de 4 etapas :^
```
# LABIRINTO

No Desafio do Laboratório II, você deve criar um programa que simule um
labirinto. No nosso sistema, o labirinto será uma determinada estrutura composta
por caracteres. No labirinto, posições com 'X' indicam que não é possível passar,
enquanto posições com ' ' (espaço) indicam que é possível a passagem. O local de
destino está marcado no labirinto com a letra 'D'. Um exemplo de labirinto pode
ser visto abaixo:

```
XXXXXXXXX XXXXXX
X XXXXXXXXX X XXXX
X XXXXXXX XXX XXXX
XXX XXXXXX XXX XXXX
XXX XX XXXX
XXX XX X XXXXX XXX
XXXXXX X XXXXXX X
XXXXXX XXXXXX XXXD
```
## Etapa 1. Criação do labirinto

O labirinto será um array bidimensional de caracteres. Para a criação do
labirinto, seu programa deve ler um arquivo com extensão txt que contém os
caracteres correspondentes ao labirinto. Depois de ler o arquivo, você deve passar
seu conteúdo para um array bidimensional de caracteres. Desta forma, o local de
entrada no labirinto sempre será a posição [ 0 ][ 0 ] do array.


Um exemplo de array bidimensional de caracteres que representaria um
labirinto pode ser visto no código abaixo:

char[][] labirinto =
{{' ','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'},
{' ',' ',' ',' ',' ',' ',' ',' ','X','X','X','X','X','X','X','X','X','X'},
{'X','X','X',' ','X',' ','X',' ','X','X','X',' ',' ',' ',' ','X','X','X'},
{'X','X','X','X',' ',' ','X',' ','X','X','X',' ','X','X',' ','X','X','X'},
{'X','X','X','X','X','X','X',' ','X','X','X',' ','X','X',' ',' ','X','X'},
{'X','X','X','X','X','X','X',' ',' ',' ',' ',' ','X',' ','X',' ','X','X'},
{'X','X','X','X','X','X','X','X',' ','X','X',' ','X',' ',' ',' ',' ',' '},
{'X','X','X','X','X','X','X','X',' ',' ',' ',' ','X',' ',' ','X','X','D'}};

Neste sentido, nesta etapa você deve:

- criar uma classe Labirinto, que possui como atributo a estrutura
    necessária para o armazenamento do labirinto
- na classe Labirinto, crie um método chamado criaLabirinto, que
    recebe uma String filename, que corresponde a um arquivo que
    contém a estrutura do labirinto, conforme supracitado. Este método abre
    o arquivo filename para leitura e preenche o labirinto
- ainda na classe Labirinto, você deve criar um método para andar no
    labirinto. Este método deve retornar verdadeiro, caso haja pelo menos uma
    saída para este labirinto, ou falso caso contrário. Entretanto, este método
    deve ser recursivo (com os métodos público e privado). Seu método público
    não recebe parâmetros e deve ser nomeado percorreLabirinto.


