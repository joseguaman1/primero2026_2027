import java.util.Scanner;

public class PalabraInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        String res = "";
        System.out.println("Ingrese la palabra");
        palabra = sc.next();
        for(int i = palabra.length()-1; i >= 0; i--){
            res = res+palabra.charAt(i);
        }
        System.out.println("La palabra invertida es: "+res);
        res = "";
        for(int i = 0; i < palabra.length(); i++){
            res = palabra.charAt(i)+res;
            //int ayux = contar("select cpunt form users");
        }
        System.out.println("La palabra invertida es: "+res);
        sc.close();
    }
}
