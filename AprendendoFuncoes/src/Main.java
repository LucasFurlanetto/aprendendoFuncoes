//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int primeiroNumero = 10;
        int segundoNumero = 20;

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;

        int somaViaFuncao = somarValores(primeiroNumero, segundoNumero);
        System.out.println("Valor soma: " +  somaViaFuncao);

        int subtrairViaFuncao = subtrairValores(primeiroNumero, segundoNumero);
        System.out.println(subtrairViaFuncao);

        int multiplicasViaFuncao = multiplicarValores(primeiroNumero, segundoNumero);
        System.out.println(multiplicasViaFuncao);

        int dividirViaFuncao = dividirViaFuncao(primeiroNumero, segundoNumero);
        System.out.println(dividirViaFuncao);


    }
    public static int somarValores(int numA, int numB){
        return numA + numB;
    }
    public static int subtrairValores(int numA, int numB){
        if (numA < 0){
            numA = numB * -1;
        }

        return numA - numB;
    }

    public static int multiplicarValores(int numA, int numB){
        return numA * numB;
    }

    public static int dividirViaFuncao(int numA, int numB){
        return numA / numB;
    }
}
