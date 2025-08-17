import java.util.Scanner;

public class PrimeiroPrograma{

    public static void main (String[] args){

        int numero = 0;

        Scanner sc = new Scanner (System.in);

        System.out.println("Digita um numero:");
        
        numero = sc.nextInt();

        System.out.println("O número digitado foi:"+numero);
    }
}
