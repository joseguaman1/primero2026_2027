import java.util.Scanner;

public class DDivision {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int dividendo, divisor, cont = 0;
        System.out.println("Ingrese el dividendo");
        dividendo = sn.nextInt();
        System.out.println("Ingrese el divisor");
        divisor = sn.nextInt();
        while (dividendo >= divisor && divisor > 0) {
            dividendo = dividendo - divisor;
            cont++;
        }
        if(cont > 0)
            System.out.println("EL resultado es---> "+cont+" y el rtesiduo es ---> "+dividendo);
        else
            System.out.println("No se puede ividir para 0");
    }
}
