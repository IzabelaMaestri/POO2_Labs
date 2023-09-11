public class CalculadoraDecimalAdapter implements Calculadora {

    private CalculadoraDecimal calculadoraDecimal;

    public CalculadoraDecimalAdapter() {
        this.calculadoraDecimal = new CalculadoraDecimal();
    }

    @Override
    public int somar(int a, int b) {
        return calculadoraDecimal.somarDec(a, b);
    }

    @Override
    public int subtrair(int a, int b) {
        return calculadoraDecimal.subtrairDec(a, b);
    }

    @Override
    public int multiplicar(int a, int b) {
        return calculadoraDecimal.multiplicarDec(a, b);
    }

}
