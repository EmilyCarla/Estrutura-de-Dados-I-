import java.util.Scanner;
//certa
public class Algoritmo356 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int L, c, t;
        int media[] = new int[15];
        String[] nomes = new String[15];
        String[] sit = new String[15];
        double pr1[] = new double[15];
        double pr2[] = new double[15];

        for(L=0; L<=14; L++){
            System.out.println("\n\n Digite" + (L+1) + "nome: ");
           // input.nextLine();
            nomes[L] = input.nextLine();

            while(nomes[L].length() > 30){
                System.out.println("\nNomes com até 30 caracteres");
                System.out.println("\n\nDigite " + (L+1) + "nome: ");
                //input.nextLine();
                nomes[L] = input.nextLine();
            }
            t=30-nomes[L].length();
            for(c=1; c<=t; c++){
            nomes[L] += " ";
        }
            System.out.println("\ndigite 1 nota: ");
           // input.nextDouble();
            pr1[L] = Double.parseDouble(input.nextLine());
            System.out.println("\ndigite 2 notas");
            //input.nextDouble();
            pr2[L] = Double.parseDouble(input.nextLine());

            media[L] = (int) ((pr1[L] + pr2[L])/2+0.0001);

            if(media[L] >=5){
                sit[L] = "APROVADO";
            } else{
                sit[L] = "REPROVADO";
            }
        }
            System.out.println("\n\n\n\t\t\tRELAÇÃO FINAL\n");
            for(L=0; L<=14; L++){
                System.out.println("\n" + (L+1) + "-" + nomes[L] + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L] + "\t" + sit[L]);
                System.out.println("\n");
            }


        }

    }

