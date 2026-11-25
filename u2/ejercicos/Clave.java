import java.util.Scanner;

public class Clave {
    /*
     * Inicio
     * clave = "casa"
     * clave_i = ""
     * cont = 0
     * para i hasta 3 hacer
     * leer clave_i
     * si clave == clave_i
     * presentar "Acceso concedido"
     * saltar
     * fin_si
     * cont++
     * fin_para
     * si cont == 3
     * presentar "Acceso denegado"
     * 
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave = "Hola";
        String clave_i = "";
        int intentos = 3;
        int cont = 0;
        for (int i = 0; i < intentos; i++) {
            System.out.println("Ingrsee su clave");
            clave_i = sc.next();
            if(clave.equals(clave_i)){
                System.out.println("Acceso correcto");
                break;                
            }
            cont++;
        }
        if(cont == 3) 
            System.out.println("Acceso denegado");
        sc.close();
    }
}
