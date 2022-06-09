package questao4;

/**
 *
 * @author Thais
 */
public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    private double peso1;
    private double peso2;
    private double peso3;

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setPeso1(double peso1) {
        this.peso1 = peso1;
    }

    public void setPeso2(double peso2) {
        this.peso2 = peso2;
    }

    public void setPeso3(double peso3) {
        this.peso3 = peso3;
    }
    
    public double calcMediaAritmetica(){
        return((nota1 + nota2) / 2);
    }
    
    public double calcMediaPonderada(){
        return (((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 10);
    }
}
