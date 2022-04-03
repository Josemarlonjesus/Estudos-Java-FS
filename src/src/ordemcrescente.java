import java.util.Scanner;

public class ordemcrescente {
    public static void main(String[] args){
        //4. Dado 3 números, colocá-los em ordem decrescente
        Scanner input4 = new Scanner(System.in);
        System.out.print("DIGITE UM VALOR INTEIRO: ");
        int a = input4.nextInt();
        System.out.print("DIGITE MAIS UM VALOR INTEIRO: ");
        int b = input4.nextInt();
        System.out.print("DIGITE OUTRO VALOR INTEIRO: ");
        int c = input4.nextInt();
        if (a<b){
            if(b<c) {
                System.out.println(c + "," + b+ ","+a);
            }
            if(c<b){
                System.out.println(b+ ","+c+ ","+a);
            }
        }
        if (b<a){
            if(a<c) {
                System.out.println(c + "," + a+ ","+b);
            }
            if(c<a){
                System.out.println(a+ ","+c+ ","+b);
            }
        }
        if (c<b){
            if(b<a) {
                System.out.println(b + "," + a+ ","+c);
            }
            if(a<b){
                System.out.println(a+ ","+b+ ","+c);
            }
        }










    }
}
