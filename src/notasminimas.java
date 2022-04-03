import java.util.Scanner;

public class notasminimas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("VALORES DISPONIVEIS: R$ 1,00, R$5,00,R$10,00,R$50,00,R$100,00");
        System.out.print("Digite que deseja retirar: ");
        int retirada = input.nextInt();
        int nota100_input = 100;
        int nota50_input = 50;
        int nota10_input = 10;
        int nota05_input = 5;
        int nota01_input = 1;
        if (nota100_input >= nota100_input) {
            nota100_input = retirada / 100;
            retirada = retirada % 100;
            if (nota100_input != 0) {
                System.out.println(nota100_input + " Notas de R$100");
            }
        }


        if (nota50_input >= nota50_input) {
            nota50_input = retirada / 50;
            retirada = retirada % 50;
            if (nota50_input != 0) {
                System.out.println(nota50_input + " Notas de R$50");
            }
        }
        if (nota10_input >= nota10_input) {
                nota10_input = retirada / 10;
                retirada = retirada % 10;
            if (nota10_input != 0) {
                    System.out.println(nota10_input + " Notas de R$10");
            }
        }
        if (nota05_input >= nota05_input){
            nota05_input = retirada / 5;
            retirada = retirada % 5;
            if(nota05_input != 0){
                System.out.println(nota05_input+" Notas de R$5");
            }

        }
        if (nota01_input >= nota01_input){
            nota01_input = retirada / 1;
            retirada = retirada % 1;
            if(nota01_input != 0 ){
                System.out.println(nota01_input+" Notas de R$1");
            }
        }

    }
}

