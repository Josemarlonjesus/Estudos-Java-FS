import java.util.Scanner;

public class valorvenda {
     public static void main(String[] args){
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

     }
}
