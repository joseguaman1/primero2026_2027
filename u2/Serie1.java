public class Serie1 {
    public static void main(String[]args) {
        //S = 1!/1 + 3!/1 - 5!/2 - 7!/3 ..........
        //
        Integer n = 10;
        
        Integer impar = 1;
        Integer factorial = 1;
        Integer fibonacci = 1;
        Integer a = 0;
        Integer b = 1;
        String serie = "";
        String serie_i = "";
        int signo = 1;
        char signo1 = '+';
        
        
        for(int i = 0; i < n; i++){
            factorial = 1;   
            a = 0;
            b = 1;
            fibonacci = 1;
            
            for(int j = 1; j <= impar; j++) {
                factorial = factorial * j;
            }
            for(int k = 0; k < i; k++) {
                fibonacci = a + b;
                a = b;
                b = fibonacci;
            }
            serie = serie +signo1+ impar + "!"+"/"+fibonacci+ " ";
            serie_i = serie_i +signo1+ factorial+ " ";
            impar = impar + 2;
            signo = signo*-1;
            signo1 = (signo < 0)?'-':'+';
        }
        System.out.println(serie);
        System.out.println(serie_i);



        ////////////////////////////
        String aux = "";
        for(int i = 0; i < 1000; i++) {
            aux = aux + Character.toChars(i)+" ";
            System.out.println("---");
            System.out.println(aux);
        }

    }
}
