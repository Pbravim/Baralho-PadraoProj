package baralho;

public class CartaTradicional extends Carta {
    private String naipe; // naipe da carta ("Hearts", "Diamonds", ...)

    public CartaTradicional(String face, String naipe, int valor, Cor cor) {
        super(face, valor, cor);
        this.naipe = naipe;
    }
    
    public String getNaipe() {
        return naipe;
    }

    @Override
    public String toString(){
    
        return String.format("%6s", this.getFace()) + " " + this.getCor().ansiCode() + naipe + Cor.RESET.ansiCode() + ", valor " + this.getValor();
    } // fim do m�todo toString

}
