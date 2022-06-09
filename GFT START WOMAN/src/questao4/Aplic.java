package questao4;

import java.util.Scanner;

/**
 *
 * @author Thais
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        int opcao;

        do {
            System.out.println("\n1 - Media aritmetica");
            System.out.println("2 - Media Ponderada");
            System.out.println("3 - Sair");
            System.out.print("\n\t Digite a opcao: ");
            opcao = sc.nextInt();
                        
            switch(opcao){
                case 1: System.out.print("\nDigite a primeira nota: ");
                objAluno.setNota1(sc.nextDouble());
                System.out.print("Digite a segunda nota: ");
                objAluno.setNota2(sc.nextDouble());
                System.out.println("Media aritmetica: " + objAluno.calcMediaAritmetica());
                break;
                
                case 2:System.out.print("\nDigite a primeira nota e seu peso (separado por um espaço): ");
                objAluno.setNota1(sc.nextDouble());
                objAluno.setPeso1(sc.nextDouble());
                System.out.print("Digite a segunda nota e seu peso (separado por um espaço): ");
                objAluno.setNota2(sc.nextDouble());
                objAluno.setPeso2(sc.nextDouble());
                System.out.print("Digite a terceira nota e seu peso (separado por um espaço): ");
                objAluno.setNota3(sc.nextDouble());
                objAluno.setPeso3(sc.nextDouble());
                System.out.print("Media Ponderada: " + objAluno.calcMediaPonderada() + "\n");
                break;
                
                default: System.out.println("\nOpção invalida");
            }
        } while (opcao < 3);
    }
    
}
