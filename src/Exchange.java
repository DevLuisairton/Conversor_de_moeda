public class Exchange {
    private final double cotacaoDolar = 5.5;
    private final double iof = 0.0586;
    private final double taxaOperacaoEmPercentual = 1;

    public double comprarDolar(double valorReal) {
        // Converter real para dólar
        double valorDolar = valorReal / cotacaoDolar;

        // Aplicar IOF
        double valorDolarComIOF = valorDolar - (valorDolar * iof);

        // Aplicar taxa de operação em percentual
        double taxaOperacao = valorDolarComIOF * (taxaOperacaoEmPercentual / 100);

        // Calcular valor final descontando a taxa de operação
        double valorFinal = valorDolarComIOF - taxaOperacao;

        return valorFinal;
    }

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        double valorReal = 1000;
        double valorDolar = exchange.comprarDolar(valorReal);
        System.out.println("Valor em dólar: " + valorDolar);
    }
}
