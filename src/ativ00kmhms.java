import java.util.Scanner;

public class ativ00kmhms {
    public static void main(String[] args){
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

        System.out.println("" +
                "" +
                "" +
                "" +
                "——_¦¦¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¦\n" +
                "—__¦¦¦¦ #OBRIGADO ¦\n" +
                "___¦¦¦¦¦¦ ¦\n" +
                "¦¦¦¦¦¦¦¦¦_____________________________¦\n" +
                "¯(@)¯¯¯¯¯¯¯(@)(@)¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯(@)¯");
    }
}
