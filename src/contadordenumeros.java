import java.util.Scanner;

public class contadordenumeros {
    public static void main(String[] args){
        Scanner input5 = new Scanner(System.in);
        System.out.print("Digite seu numero: ");
        String num = input5.nextLine();
        System.out.print("Tem "+ num.length() + " Digitos");

    }
}
