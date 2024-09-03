public class FaturamentoDistribuidora {
    public static void main(String[] args) throws Exception {
        
        double[] faturamentoDiario = {31490.78, 37277.94, 37708,43, 0.00, 0.00, 17934.22, 0.00, 6965.12, 24390.93, 14179.64, 0.00, 39807.66, 27261.63, 39775.64, 29797.62, 17216.50, 0.00, 12974.20, 28490.98, 8748.09, 8889.00, 17767.55, 0.00, 0.00, 3071.32, 48275.29, 10299.67, 39874.10};
        
        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        for (int faturamento = 0; faturamento < faturamentoDiario.length; faturamento++) {
            if (faturamentoDiario[faturamento] >= 0 ) {
                if (faturamentoDiario[faturamento] < menorFaturamento) {
                    menorFaturamento = faturamentoDiario[faturamento];
                }
            if (faturamentoDiario[faturamento] > maiorFaturamento) {
                maiorFaturamento = faturamentoDiario[faturamento];
                }
                somaFaturamento += faturamentoDiario[faturamento];
                diasComFaturamento++;
            }
        }

        double mediaFaturamento = somaFaturamento / diasComFaturamento;

        int diasAcimaDaMedia = 0;
        for (int faturamento = 0; faturamento < faturamentoDiario.length; faturamento++) {
            if (faturamentoDiario[faturamento] > mediaFaturamento){
            diasAcimaDaMedia++;
            }
        }

        String xml = "<faturamento>\n" +
                "   <menorFaturamento>" + menorFaturamento + "</menorFaturamento\n" +
                "   <maiorFaturamento>" + maiorFaturamento + "</maiorFaturamento\n" +
                "   <diasAcimaDaMedia>" + diasAcimaDaMedia + "</diasAcimaDaMedia\n" +
                "</faturamento>";

        System.out.println(xml);

    }
}
