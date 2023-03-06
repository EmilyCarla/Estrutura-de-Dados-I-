import java.util.Scanner;
//certa
public class Algoritmo348 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      
        //String nomes[] = new String [5];
        String[] nomes = new String [5];
        double pr1[] = new double [5];
        double pr2[] = new double [5];
        double media[] = new double [5];

        for(int L=0; L<=4; L++){
            System.out.println("\nDigite " + (L+1) + "° nome: ");
            nomes[L] = input.next();
        
       // for(int L=0; L<=4; L++){
            System.out.println("\nDigite 1° nota: ");
            pr1[L] = input.nextDouble();
            System.out.println("\nDigite 2° nota: ");
            pr2[L] = input.nextDouble();
            media[L] = ((pr1[L] + pr2[L])/2);
        }
        
        System.out.println("\n\n\n\t\t\t\tRELAÇÃO FINAL\n");
        for( int L=0; L<=4; L++){
            System.out.println("\n" + " - " + nomes[L]);
            System.out.println("\n" + pr1[L] + "\t" + pr2[L] + "\t" + media[L]);
        }

        System.out.println("\n");

        
    }
}