public class InverterString {
    public static void main(String[] args) throws Exception {
        
        String texto = "Sou um texto";

        String inverterTexto = inverterString(texto);

        System.out.println("String original: " + texto);
        System.out.println("String invertida: " + inverterTexto);

    }

    public static String inverterString(String texto) {
        
        StringBuilder sb = new StringBuilder();

        for (int caractere = texto.length() - 1; caractere >= 0; caractere--) {
            sb.append(texto.charAt(caractere));
        }
        return sb.toString();
    }
}
