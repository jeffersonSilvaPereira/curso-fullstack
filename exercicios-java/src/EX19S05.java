import java.util.Scanner;

public class EX19S05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salario.");
        double salario = sc.nextDouble();

        sc.close();

        double aumento = 0;

        if (salario > 0 && salario <= 300) {
            aumento = 1.05;
        } else if (salario > 300 && salario <= 500) {
            aumento = 1.07;
        } else if (salario > 500) {
            aumento = 1.10;
        } else {
            System.out.println("Não existe salario negativo.");
        }

        System.out.printf("NOVO SALÁRIO: R$%.2f", salario * aumento);
    }
}
