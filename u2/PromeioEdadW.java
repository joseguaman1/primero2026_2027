import java.util.Scanner;

public class PromeioEdadW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 1;
        int contador = 0; 
        int edad = 0;
        float promedio = 0.0f;
        while(option == 1) {
            System.out.println("Ingrese la edad");
            edad = edad + sc.nextInt();
            contador++;
            System.out.println("Presione 1 si requiere agregar mas");
            option = sc.nextInt();
        }
        promedio = (float)edad / (float)contador;
               
        System.out.println("El promedio de edad es ---> "+promedio);
        
    }
}
