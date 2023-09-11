public class CalculadoraBinariaAdapter implements Calculadora {

    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraBinariaAdapter() {
        this.calculadoraBinaria = new CalculadoraBinaria();
    }

    @Override
    public int somar(int a, int b) {
        String binaryA = Integer.toBinaryString(a);
        String binaryB = Integer.toBinaryString(b);
        String result = calculadoraBinaria.somarBin(binaryA, binaryB);
        return Integer.parseInt(result, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String binaryA = Integer.toBinaryString(a);
        String binaryB = Integer.toBinaryString(b);
        String result = calculadoraBinaria.subtrairBin(binaryA, binaryB);
        return Integer.parseInt(result, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        String binary1 = Integer.toBinaryString(a);
        String binary2 = Integer.toBinaryString(b);

        int maxLength = Math.max(binary1.length(), binary2.length());

        binary1 = String.format("%" + maxLength + "s", binary1).replace(' ', '0');
        binary2 = String.format("%" + maxLength + "s", binary2).replace(' ', '0');

        int result = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            if (binary2.charAt(i) == '1') {
                result += a << (maxLength - i - 1);
            }
        }

        return result;
    }

}
