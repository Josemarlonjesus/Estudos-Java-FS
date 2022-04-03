import java.util.Scanner;

public class crescente {
    public static void main(String[] args){
        Scanner input2 = new Scanner(System.in);
        System.out.print("DIGITE UM NUMERO: ");
        int num1 = input2.nextInt();
        System.out.print("DIGITE OUTRO NUMERO: ");
        int num2 = input2.nextInt();

        if (num1 > num2){
            System.out.println(num2+", "+num1);
        }
        if (num2 > num1) {
            System.out.println(num1+", "+num2);
        }
        else{
            System.out.println("Os números são iguais ");
        }
    }
}
