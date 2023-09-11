
public class MainCalc {

    public static void main(String[] args) {
        Calculadora calculadoraDec = new CalculadoraDecimalAdapter();
        Calculadora calculadoraBin = new CalculadoraBinariaAdapter();

        int num1 = 10;
        int num2 = 3;

        int somaDec = calculadoraDec.somar(num1, num2);
        System.out.println("Soma Decimal: " + somaDec);
        int somaBin = calculadoraBin.somar(num1, num2);
        System.out.println("Soma Binária: " + somaBin);

        int subDec = calculadoraDec.subtrair(num1, num2);
        System.out.println("Subtração Decimal: " + subDec);
        int subBin = calculadoraBin.subtrair(num1, num2);
        System.out.println("Subtração Binária: " + subBin);

        int multiDec = calculadoraDec.multiplicar(num1, num2);
        System.out.println("Multiplicação Decimal: " + multiDec);
        int multiBin = calculadoraBin.multiplicar(num1, num2);
        System.out.println("Multiplicação Binária: " + multiBin);

    }
}
