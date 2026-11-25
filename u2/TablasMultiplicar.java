import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabla = 1;
        int n = 1;
        int res = 0;
        System.out.println("Ingrese la tabla");
        tabla = sc.nextInt();
        System.out.println("Ingrese el numero");
        n = sc.nextInt();
        for(int i = 1; i <= n;i++) {
            res = tabla * i;
            System.out.println(tabla+" * "+i+" = "+res);
        }

    }
}
