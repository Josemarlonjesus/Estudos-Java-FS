import java.util.Scanner;

public class identifiqueomaior { 
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("DIGITE UM VALOR: ");
        int n1 = input1.nextInt();
        System.out.print("DIGITE OUTRO VALOR: ");
        int n2 = input1.nextInt();
        if (n1 > n2){
            System.out.println("O PRIMEIRO VALOR "+ n1 + " É MAIOR QUE O SEGUNDO VALOR "+ n2);
        }
        if (n1 < n2){
            System.out.println("O PRIMEIRO VALOR "+ n1 + " É MENOR QUE O SEGUNDO VALOR "+ n2);
        }
        if (n1 == n2){
            System.out.println("O PRIMEIRO VALOR "+ n1 + " É IGUAL AO SEGUNDO VALOR "+ n2);
        }
     input1.close();
    }
}
