public class Main {

    public static void main(String[] args) {
        // Verifica se o número de argumentos é par (cada par de números binários)
        if (args.length % 2 != 0) {
            System.out.println("Por favor, forneca um numero par de argumentos.");
            return;
        }

        // Valida os números binários fornecidos
        for (String arg : args) {
            if (!isBinary(arg)) {
                System.out.println("Erro: " + arg + " nao é um numero binario valido.");
                return;
            }
        }

        // Realiza os testes
        for (int i = 0; i < args.length; i += 2) {
            String num1 = args[i];
            String num2 = args[i + 1];

            // Chama o algoritmo Karatsuba
            String result = Karatsuba.karatsuba(num1, num2);

            // Exibe o resultado da multiplicação
            System.out.println("Resultado da multiplicacao de foi: " + result);
        }
    }

    // Método para verificar se a string é um número binário válido
    private static boolean isBinary(String str) {
        return str.matches("[01]+");
    }
}