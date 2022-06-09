package questao3;
/**
 *
 * @author Thais
 */
public class Aplic {
    public static void main(String[] args) {  
        
    Usuario usuario1 = new Usuario("Thais");
    Usuario usuario2 = new Usuario("Ana");
    Usuario usuario3 = new Usuario("Gabriela");
    
    Mensagem mensagem1 = new Mensagem("Ola, tudo bem?", "Coracao");
    MensagemVideo mensagemVideo1 = new MensagemVideo("Tudo e voces? Viram esse video novo?", "Surpreso", "www.youtube.com/aula10");
    Mensagem mensagem2 = new Mensagem("Adorei o video, muito explicativo!", "Curtir");
    MensagemImagem mensagemImagem1 = new MensagemImagem("Postaram uma foto dos bastidores!", "Curtir", "www.facebook.com/aulascria");
    
    System.out.println("CHAT\n");
    System.out.println("" + usuario1.getNome() + ": " + mensagem1.getMensagem() + " || " + mensagem1.getReacoes());
    System.out.println("" + usuario2.getNome() + ": " + mensagemVideo1.getMensagem() + " || " 
                        + mensagemVideo1.getReacoes() + " - " + mensagemVideo1.getLinkVideo());
    System.out.println("" + usuario3.getNome() + ": " + mensagem2.getMensagem() + " || " + mensagem2.getReacoes());
    System.out.println("" + usuario1.getNome() + ": " + mensagemImagem1.getMensagem() + " || " 
                        + mensagemImagem1.getReacoes() + " - " + mensagemImagem1.getLinkImagem());
    }
}
