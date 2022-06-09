package questao1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Thais
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palavra1;
        String palavra2;
        int i;
        int j;
        
        System.out.print("Digite a primeira palavra: ");
        palavra1 = sc.nextLine();
        System.out.print("Digite a segunda palavra: ");
        palavra2 = sc.nextLine();
       
        if (palavra1.length() != palavra2.length()) {
            System.out.println("As palavras não são um anagrama");
        } else{
            char[] ch1 = palavra1.toCharArray();
            char[] ch2 = palavra2.toCharArray();
            
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            String sch1 = new String(ch1);
            String sch2 = new String(ch2);
            if (sch1.equals(sch2)){
                System.out.println("As palavras são um anagrama");
            } else{
                System.out.println("As palavras não são um anagrama");
            }
    }
    }
    
}
