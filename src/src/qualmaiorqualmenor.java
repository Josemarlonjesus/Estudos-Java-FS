import java.util.Scanner;

public class qualmaiorqualmenor {
    //3. Dado 3 números, verificar qual o maior e o menor deles
    public static void main(String[] args) {
        Scanner input3 = new Scanner(System.in);
        System.out.print("DIGITE UM NÚMERO: ");
        int n1 = input3.nextInt();
        System.out.print("DIGITE MAIS UM NÚMERO: ");
        int n2 = input3.nextInt();
        System.out.print("DIGITE OUTRO NÚMERO: ");
        int n3 = input3.nextInt();
        if (n1 > n2){
            if (n2 > n3){
                System.out.println("MAIOR(A)" +n1+ "MENOR" + n3);
            }
            else{
                System.out.println("MAIOR(B)" +n1+ "MENOR " +n2 );
            }
        }
        if (n2 > n1){
            if (n1 > n3){
                System.out.println("MAIOR(C)"+n2+ " menor "+n3 );
            }
            else{
                System.out.println("MAIOR(d)"+n2+ " menor "+n1 );
            }
        }
        if (n3 > n1){
            if (n1 > n2){
                System.out.println("maior(E)"+n3+"menor"+n2);
            }
            else if(n2 > n1) {
                System.out.println("maior(F)"+n3+"menor"+n1);
            }
        }
// Não faço ideia do pq ele executa a função (d) e o (f) ao mesmo tempo quando o maior e o n3
    }
}

