package questao3;

/**
 *
 * @author Thais
 */
public class MensagemVideo extends Mensagem{
    
    private String linkVideo;
    
    public MensagemVideo(String mensagem, String reacoes, String linkVideo) {
        super(mensagem, reacoes);
        this.linkVideo = linkVideo;
    }

    public String getLinkVideo() {
        return linkVideo;
    }
       
}
