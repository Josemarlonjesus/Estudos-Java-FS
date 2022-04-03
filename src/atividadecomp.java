import java.util.Scanner;

public class atividadecomp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quilometragem percorrida: ");
        double km = input.nextDouble();
        System.out.print("Digite o tempo percorrido em minutos: ");
        double min = input.nextDouble();
        min = min / 60;
        double kmh = km / min;
        System.out.println("Foi percorrido "+ km+"KM em uma velocidade de "+kmh+"KM/h");
        double ms = kmh / 3.6;
        System.out.println("Foi percorrido "+ km+"KM em uma velocidade de "+ms+"M/S");
        System.out.println("."+
                "."+
                "."+
                ".");

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
        System.out.println("."+
                "."+
                "."+
                ".");
        Scanner input3 = new Scanner(System.in);
        System.out.println("VALORES DISPONIVEIS: R$ 1,00, R$5,00,R$10,00,R$50,00,R$100,00");
        System.out.print("Digite que deseja retirar: ");
        int retirada = input3.nextInt();
        int nota100_input3 = 100;
        int nota50_input3 = 50;
        int nota10_input3 = 10;
        int nota05_input3 = 5;
        int nota01_input3 = 1;
        if (nota100_input3 >= nota100_input3) {
            nota100_input3 = retirada / 100;
            retirada = retirada % 100;
            if (nota100_input3 != 0) {
                System.out.println(nota100_input3 + " Notas de R$100");
            }
        }


        if (nota50_input3 >= nota50_input3) {
            nota50_input3 = retirada / 50;
            retirada = retirada % 50;
            if (nota50_input3 != 0) {
                System.out.println(nota50_input3 + " Notas de R$50");
            }
        }
        if (nota10_input3 >= nota10_input3) {
            nota10_input3 = retirada / 10;
            retirada = retirada % 10;
            if (nota10_input3!= 0) {
                System.out.println(nota10_input3 + " Notas de R$10");
            }
        }
        if (nota05_input3 >= nota05_input3){
            nota05_input3 = retirada / 5;
            retirada = retirada % 5;
            if(nota05_input3 != 0){
                System.out.println(nota05_input3+" Notas de R$5");
            }

        }
        if (nota01_input3 >= nota01_input3){
            nota01_input3 = retirada / 1;
            retirada = retirada % 1;
            if(nota01_input3 != 0 ){
                System.out.println(nota01_input3+" Notas de R$1");
            }
        }
        System.out.println("."+
                "."+
                "."+
                ".");
        Scanner input4 = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double produto = input4.nextDouble();
        System.out.print("Digite o valor do imposto fixo: ");
        double imposto = input4.nextLong();
        System.out.print("Digite a porcentagem de lucro que deseja: ");
        double lucro = input4.nextLong();
        double precosoma = produto + imposto;
        double precofianl = (precosoma * lucro) / 100 ;
        System.out.println("R$"+precofianl +" Esse vai ser o valor do seu lucro sobre o produto.");

        System.out.println("."+
                "."+
                "."+
                ".");
        Scanner input5 = new Scanner(System.in);
        System.out.print("Digite seu numero: ");
        String num = input5.nextLine();
        System.out.print("Tem "+ num.length() + " Digitos");
    }
}

