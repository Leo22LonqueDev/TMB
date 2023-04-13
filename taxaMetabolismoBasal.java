import java.util.Scanner;

public class taxaMetabolismoBasal {
    
    public static void main(String[] args) {
        
        String nome, sexo;
        double pesoFinal, idadeFinal, alturaFinal, totalFinalMasculino, totalFinalFeminino;
        int peso, idade, altura;

        Scanner entrada = new Scanner(System.in);

            System.out.println("------OLÁ------");
            System.out.println("\nBem-vindo ao calculador da Taxa de Metabolismo Basal");
            
            System.out.print("Insira o seu nome por favor: ");
            nome = entrada.nextLine();
            System.out.println("Seu nome é " + nome + "!");

            System.out.print("Gostaria de saber qual sua idade: ");
            idade = entrada.nextInt();
            System.out.println("Sua idade é " + idade + " anos!");
            
            System.out.print("Gostaria de saber seu sexo, M ou F: ");
            sexo = entrada.next();
            System.out.println("Seu sexo é " + sexo + "!");

            System.out.print("Gostaria de saber o seu peso: ");
            peso = entrada.nextInt();
            System.out.println("Seu peso é " + peso + " Kg!");

            System.out.print("Gostaria de saber a sua altura em centimetros: ");
            altura = entrada.nextInt();
            System.out.println("Sua altura é " + altura + " cm!");

        entrada.close();

            if (sexo.equals("m")) {
                pesoFinal = (13.8 * peso);
                alturaFinal = (5 * altura);
                idadeFinal = (6.8 * idade);
                totalFinalMasculino = (66 + (pesoFinal + alturaFinal - idadeFinal));
                System.out.printf(nome + ", seu TMB é de: %.2f", totalFinalMasculino);
            } else {
                totalFinalFeminino = (655 + ((9.6 * peso) + (1.8 * altura) - (4.7 * idade)));
                System.out.printf(nome + ", seu TMB é de: %.2f", totalFinalFeminino);
            }
    }
}
