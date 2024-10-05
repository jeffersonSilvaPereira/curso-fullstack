import java.util.Scanner;

public class EX09S05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os segundos para transforma em horas: ");
        int segundosInformado = sc.nextInt();

        sc.close();

        int hora = segundosInformado / 3600;

        int minutos = (segundosInformado - (hora * 3600)) / 60;

        int segundos = (segundosInformado - (hora * 3600) - (minutos * 60));


        System.out.printf("%02d/%02d/%02d", hora, minutos, segundos);
        
    }
}
