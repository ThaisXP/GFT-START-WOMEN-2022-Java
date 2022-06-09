package questao2;

import java.util.Scanner;

/**
 *
 * @author Thais
 */
public class Aplic {
    
    Scanner sc = new Scanner(System.in);
    
    double a;
    double b;
    double c;
    double x1;
    double x2;
    double delta;
    
    public Aplic(){
        System.out.print("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = sc.nextDouble();
        
        delta = (b * b) - (4 * (a * c));
        System.out.println("\nDelta: " + delta);
 
        if (delta >= 0) {
            calcularX();
        } else {
            System.out.println("Delta menor que 0 não possui raiz");
        }
    }
    
    private void calcularX() {
 
        x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
        x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
 
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
 
    }
    public static void main(String[] args) {
        
        new Aplic();
    }
    
}
