import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fact = 1;
        int n = 0;
        System.out.println("Ingrese el valor del numero");
        n = sc.nextInt();
        for(int i = 2; i <= n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
