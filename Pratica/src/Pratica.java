import java.util.Scanner;

public class Pratica{
    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        System.out.println("Exemplo de while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("**** Ativiade professor ****");
            System.out.println("Opção 1: Soma de 4 valores");
            System.out.println("Opção 2: Somar três notas");
            System.out.println("Opção 3: Salário novo ");
            System.out.println("Opção 0: Sair");
            System.out.println("***************");
            System.out.println("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("****************");
            int i;
            switch (opcao){
                case 1:

                    int[] numeros= new int [4];
                    int soma = 0;
                    System.out.println("Opção 1 escolhida insira quatro valores ");

                    for(i = 0 ; i < numeros.length; i++ ){
                        numeros[i] = in.nextInt();
                        soma += numeros[i];

                    }
                    System.out.println("O valor da soma de quatro números = "+soma);

                    break;
                case 2:
                    double[] notas = new double[3];
                    double mediaNotas = 0;
                    System.out.println("Opção 2 escolhida insira três notas");

                    for(i = 0;i < notas.length; i++ ){
                        notas[i] = in.nextDouble();
                        mediaNotas += notas[i];

                    }

                    mediaNotas = mediaNotas/notas.length;
                    System.out.println("A soma das notas são = "+mediaNotas);

                    break;
                case 3:
                    System.out.println("Opção 3 escolhida Insira seu salário ");
                    double salario = in.nextDouble();
                    salario = salario * 1.25;
                    System.out.println("O seu salário com acréscimo de 25 porcento é "+ salario);
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida. ");
                    //sair
                    break;
                default:
                    System.out.println("O número é invalido!. ");

            }
        }while(opcao != 0);

    }

}
