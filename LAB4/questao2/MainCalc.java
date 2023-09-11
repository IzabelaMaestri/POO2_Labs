
public class MainCalc {
    
    public static void main(String[] args) {

        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();

        String bin1 = "1010";
        String bin2 = "0011";

        String somaBin = calculadoraBinaria.somar(bin1, bin2);
        System.out.println("Soma Binaria: " + somaBin);

        String subBin = calculadoraBinaria.subtrair(bin1, bin2);
        System.out.println("Subtração Binaria: " + subBin);

        Calculadora calculadoraBinariaAdapter = new CalculadoraBinariaAdapter();

        int num1 = 10;
        int num2 = 3;
        
        int soma = calculadoraBinariaAdapter.somar(num1, num2);
        System.out.println("Soma: " + soma);
        
        int subtracao = calculadoraBinariaAdapter.subtrair(num1, num2);
        System.out.println("Subtração: " + subtracao);

        int multiplicar = calculadoraBinariaAdapter.multiplicar(num1, num2);
        System.out.println("Multiplicação: " + multiplicar);
        
    }
}
