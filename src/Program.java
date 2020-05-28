
import Entities.Funcoes;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @luis pires 27/05/2020
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        Funcoes calcula = new Funcoes();
        
        System.out.print("Quantos canculos deseja fazer ? ");
        int nCalculos = sc.nextInt();

        int i = 0;
        while (i < nCalculos) {

            System.out.println("Qual operação você deseja realizar?");
            System.out.print("Digite 1 para soma,  2 subtração,  3 multiplicação,  4 divisão  ou 5 para calcular porcentagem:  ");
            int opcao = sc.nextInt();

            if (opcao == 5) {
                System.out.println("Você optou por porcentagem neste caso passe os dois valores:  ");
                System.out.print("Digite quantos porcentos:  ");
                double porcentag = sc.nextDouble();
                System.out.print("Digite o Valor:  ");
                double val = sc.nextDouble();

                System.out.println("Sua resposta é  " + porcentag + " de " + val + " a resposta é: " + calcula.porcentagem(val, porcentag));              if(nCalculos==1){
                 break;
                }             
            }           
            System.out.print("Digite um seu primeiro Valor:  ");
            double vl = sc.nextDouble();
            System.out.print("Digite um seu segundo Valor:  ");
            double v2 = sc.nextDouble();

            switch (opcao) {

                case 1:
                    System.out.println("Você optou por soma o valor é:  " + calcula.soma(vl, v2));
                    break;
                case 2:
                    System.out.println("Você optou por subtração o valor é:  " + calcula.sub(vl, v2));
                    break;
                case 3:
                    System.out.println("Você optou por multiplicação o valor é:  " + calcula.mult(vl, v2));
                    break;
                case 4:
                    System.out.println("Você optou por divisão o valor é:  " + calcula.div(vl, v2));
                    break;

                default:
                    System.out.println("Não temos essa opção");
                    break;
            }
            i++;
        }

        System.out.println("obrigado por utilizar nosso sistema de calculo e até a proxima!");
    }

}
