Este projeto implementa a multiplicação binária de grandes números utilizando o Algoritmo de Karatsuba, com todas as operações realizadas sobre strings para representar números binários. A execução é feita via linha de comando e os números de entrada são inseridos horizontalmente, sem quebra de linha.

Compilação e Execução
-Passo 1: Compilando o código

Para compilar o projeto, utilize o comando abaixo no terminal ou CMD. Certifique-se de estar no diretório onde os arquivos Main.java e Karatsuba.java estão localizados.

javac Main.java Karatsuba.java

-Passo 2: Executando o programa

Após a compilação, execute o programa com o seguinte comando:


java Main [números binários]

Os números binários devem ser inseridos de forma horizontal, separados por espaços, como no exemplo a seguir:
java Main 1 10 11 101 110 111 1000 1101 1011 10101 11101 110110 101101

Exemplo de Execução:

Ao rodar o programa com os números binários 1010 e 1010, ele executará a multiplicação utilizando o algoritmo de Karatsuba e retornará o resultado.
java Main 1010 1010

Observação

    Todos os testes foram realizados utilizando o terminal/CMD no Windows.
    O código não utiliza tipos de dados inteiros (int, long, etc.), exceto nas variáveis de controle dos loops for.

Estrutura do Código

    Main.java: Gerencia a entrada do usuário e chama as operações necessárias para realizar a multiplicação binária.
    Karatsuba.java: Implementa o algoritmo de Karatsuba, assim como as funções auxiliares para somar e subtrair números binários representados como strings.

    cd Desktop
    cd karatsubaalgoritimo
    cd t1
    cd src
    path que eu utilizei no cmd