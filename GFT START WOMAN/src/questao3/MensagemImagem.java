package questao3;

/**
 *
 * @author Thais
 */
public class MensagemImagem extends Mensagem{
    
    private String linkImagem;
    
    public MensagemImagem(String mensagem, String reacoes, String linkImagem) {
        super(mensagem, reacoes);
        this.linkImagem = linkImagem;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

}
