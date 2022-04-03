import java.util.Scanner;

public class ativ01saldoconta {
    public static void main(String[] args){
        Scanner input2 = new Scanner(System.in);
        System.out.print("Digite seu saldo em conta: ");
        double saldo = input2.nextDouble();
        System.out.print("Digite a taxa de juros anual: ");
        double juros = input2.nextDouble();
        System.out.print("Digite o numeros de meses no qual sua conta ficou ativa: ");
        int meses = input2.nextInt();
        double jurosmes = juros / meses;
        double jurosvezesmes = jurosmes * meses;
        double jurosmenossaldo = saldo - jurosvezesmes ;
        System.out.println("O saldo atual da sua conta e de: R$"+jurosmenossaldo);

//EU ACHO QUE TEM QUE USAR ESTRUTURA DE REPETIÇÃO VOU VER
    }
}
