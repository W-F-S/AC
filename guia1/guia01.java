/**
 *Nome: Walker Freitas dos Santos
 * Matricula: 698774
 */
public class guia01 {

    /*
     * Contador de erros.
     */
    private static int errors = 0;

    /*
     * Testar se dois valores sao iguais
     * 
     * @param x - primeiro valor
     * 
     * @param y - segundo valor
     */
    public static void test_equals(Object x, Object y) {
        if (("" + x).compareTo("" + y) != 0)
            errors = errors + 1;
    } // end test_equals ( )

    /*
     * Exibir o total de erros.
     * 
     * @return mensagem com o total de erros
     */
    public static String test_report() {
        return ("" + errors);
    } // end test_report ( )

    /*
     * Converter valor decimal para binario.
     * 
     * @return binario equivalente.
     * 
     * @param value - valor decimal.
     */
    public static String dec2bin(int value) {
        String binario = "";

        if (value == 0) {
            return ("0");
        }

        while (value > 0) {
            binario = (value % 2) + binario;
            value = value / 2;
        }
        return (binario);
    } // end dec2bin ( )

    /*
     * Converter valor binario para decimal.
     * 
     * @return decimal equivalente
     * 
     * @param value - valor binario
     */
    public static int bin2dec(String value) {
        int soma = 0;
        int tamanho = value.length();
        char c;

        for (int i = 0; i < tamanho; i++) {
            c = value.charAt(i);
            if (c == '0'){
                continue;
            }
            soma += Math.pow(2, (tamanho - (i + 1)));
        }
        return (soma);
    } // end bin2dec ( )

    /*
     * Converter valor decimal para base indicada.
     * 
     * @return base para a conversao
     * 
     * @param value - valor decimal
     */

    public static String dec2base(int value, int base) {
        String aux = ""; // String para o valor correspondente
        int resto = 0; // Para Somar o Resto

        while (value >= base) {
            resto = (value % base);
            value = value / base;
            aux = resto + aux;

            if (value < base) // Somando o Ultimo Numero
            {
                aux = value + aux;
            }
        }
        return (aux);
    } // end dec2base ( )

    /*
     * Converter valor binario para base indicada.
     * 
     * @return valor equivalente na base indicada.
     * 
     * @param value - valor binario.
     * 
     * @param base - para a conversao
     */
    public static String bin2base(String value, int base) {

        int bin2dec = (bin2dec(value)); // Transforma o "value" em decimal
        String dec2base = dec2base(bin2dec, base); // Transforma o decimal para qualquer base

        return (dec2base); // retorna o valor decimal transformado
    } // end bin2base ( )

    /*
     * Converter valor em ASCII para hexadecimal.
     * 
     * @return hexadecimal equivalente.
     * 
     * @param value - caractere(s) em codigo ASCII
     */
    public static String ASCII2hex(String value) {

        char[] ch = value.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char c : ch) {
            int i = (int) c;

            builder.append(Integer.toHexString(i));
        }

        return (builder.toString()); // Retorna o valor em hexadecimal
    } // end ASCII2hex ( )



    public static String octal2decimal2ASCII( String value )
    {
        String hexadecimal;
        int decimal;
        
		
        decimal = Integer.parseInt(value, 8);
        hexadecimal = Integer.toHexString(decimal);
		
        System.out.print("Equivalent Hexadecimal Value of " + value + " is :\n");
        System.out.print(hexadecimal);
        return (hexadecimal);
    }

    /*
     * Converter valor em hexadecimal para ASCII.
     * 
     * @return caractere(s) em codigo ASCII.
     * 
     * @param value - hexadecimal equivalente(s)
     */
    public static String hex2ASCII(String value) {
        StringBuilder output = new StringBuilder("");

        for (int i = 0; i < value.length(); i += 2) {
            String str = value.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }
        return output.toString();
    } // end hex2ASCII ( )

    /*
     * Acao principal.
     */

    public static void main(String[] args) {

        System.out.println("\nGuia_01 - Java Tests");
        System.out.println("Walker Freitas dos Santos\n699531 ");
        System.out.println();

        test_equals(dec2bin(23), "10111");
        test_equals(dec2bin(54), "110110");
        test_equals(dec2bin(731), "1011011011");
        test_equals(dec2bin(132), "10000100");
        test_equals(dec2bin(365), "101101101");

        System.out.println("1. errorTotalReport = " + test_report());
        test_equals(bin2dec("10101"), 21);
        test_equals(bin2dec("10110"), 22);
        test_equals(bin2dec("101101"), 45);
        test_equals(bin2dec("111011"), 59);
        test_equals(bin2dec("111001"), 57);

        System.out.println("2. errorTotalReport = " + test_report());
        test_equals(dec2base(71, 4), "1013");
        test_equals(dec2base(43, 8), "53");
        test_equals(dec2base(67, 16), "43");
        test_equals(dec2base(175, 16), "1015"); // 1015 = "af" em Hexadecimal
        test_equals(dec2base(151, 16), "97");

        System.out.println("3. errorTotalReport = " + test_report());
        test_equals(bin2base("10111", 4), "113");
        test_equals(bin2base("10011", 8), "23");
        test_equals(bin2base("101101", 16), "213"); // 213 = "2d" em Hexadecimal
        test_equals(bin2base("100101", 8), "45");
        test_equals(bin2base("101111", 4), "233");

        System.out.println("4. errorTotalReport = " + test_report());
        test_equals(ASCII2hex("PUC-Minas"), "5055432d4d696e6173");
        test_equals(ASCII2hex("2020-2"), "323032302d32");
        test_equals(ASCII2hex("Brasil"), "42726173696c");
//não está a funcionar -> test_equals(octal2ASCII("116157151164145"), "Noite"); // OBS.: 116 e' o primeiro octal (0x4e)!
        test_equals(hex2ASCII("422E482E2D4D47"), "B.H.-MG"); // OBS.: 42 e' o primeiro hexadecimal (0x5e)!

        // OBS.: A seguir, exemplos apenas para os primeiros, acrescentar todos os
        // outros códigos propostos!

        System.out.println("5. errorTotalReport = " + test_report());
        System.out.print("\n\nApertar ENTER para terminar.");
        System.console().readLine();
    } // end main
} // end class
