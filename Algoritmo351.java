import java.util.Scanner;
//certa
public class Algoritmo351 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int L, num;
        String[] nomes = new String[5];
        for(L=0; L<=4; L++ ){
            System.out.println("\nnome " + (L+1) + ":");
            nomes[L] = input.nextLine();
        }

        System.out.println("\nDigite o numero da pessoa: ");
        num = input.nextInt();

        while(num<1 || num>5){
            System.out.println("\n Numero fora do intervalo");
            System.out.println("\n Digite o numero da pessoa");
            num = input.nextInt();
        }

        System.out.println("\n" + nomes[num -1]);
        System.out.println("\n");

        input.close();
    }
    
}
