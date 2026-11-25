public class Serie1 {
    /**
     * Metodo que permite calcular el factorial
     * 
     * @param numero Numero que se desea sacar del factorial
     * @return El factorial en Integer
     */
    public static Integer calcularFactorial(Integer numero) {
        Integer factorial = 1;
        for (int j = 1; j <= numero; j++) {
            factorial = factorial * j;
        }
        return factorial;
    }

    // fibonacci
    // Datos de entrada --- el elemento a generar en la serie
    // Dato de salida ---- Numero fibonacci pertenecienle al elemento
    /**
     * Metodo para calcular el fibonacci
     * @param elemento Elemento de la serie a calcular
     * @return El elemento calculao de la serie fiibonacci
     */
    public Integer calcularFinonacci(Integer elemento) {
        Integer fibonacci = 1;
        Integer a = 0;
        Integer b = 1;
        for (int k = 0; k < elemento; k++) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        // S = 1!/1 + 3!/1 - 5!/2 - 7!/3 ..........
        //
        Serie1 serieO = new Serie1();
        Integer n = 10;

        Integer impar = 1;
        Integer factorial = 1;
        Integer fibonacci = 1;

        String serie = "";
        String serie_i = "";
        int signo = 1;
        char signo1 = '+';

        for (int i = 0; i < n; i++) {
            // para factorial
            factorial = Serie1.calcularFactorial(impar);
            // para fibonacci
            fibonacci = serieO.calcularFinonacci(i);
            serie = serie + signo1 + impar + "!" + "/" + fibonacci + " ";
            serie_i = serie_i + signo1 + factorial + " ";
            impar = impar + 2;
            signo = signo * -1;
            signo1 = (signo < 0) ? '-' : '+';
        }
        System.out.println(serie.substring(1));
        System.out.println(serie_i.substring(1));

    }
}
