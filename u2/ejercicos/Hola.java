import java.util.Scanner;

public class Hola {
    public static void main(String[] args) {
        float a, b, c = 0.0f;
        int option = 0;
        Scanner sc = new Scanner(System.in);
        // MENU
        System.out.println("Bienvenido a la calculadora \n Menu");
        while (true) {
            System.out.println("Opcion 1: Suma");
            System.out.println("Opcion 2: Resta");
            System.out.println("Opcion 3: Multiplicaion");
            System.out.println("Opcion 4: Division");
            option = sc.nextInt();
            // DATOS
            System.out.println("Ingrese a:");
            a = sc.nextFloat();
            System.out.println("Ingrese b:");
            b = sc.nextFloat();
            switch (option) {
                case 1:

                    c = a + b;
                    System.out.println("La suma de " + a + " y " + b + " es: " + c);

                    break;
                case 2:

                    c = a - b;
                    System.out.println("La resta de " + a + " y " + b + " es: " + c);

                    break;

                case 4:
                    c = a / b;
                    System.out.println("La division de " + a + " y " + b + " es: " + c);

                    break;

                case 3:

                    c = a * b;
                    System.out.println("La multiplicacion de " + a + " y " + b + " es: " + c);

                    break;

                default:
                    System.out.println("Pendejo elige bien");
                    break;
            }
            System.out.println("Desea salir presione s?");
            if(sc.next().equalsIgnoreCase("s"))
                break;
        }

        sc.close();
    }
}