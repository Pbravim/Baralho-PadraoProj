package baralho;

public class CartaUno extends Carta{

    public CartaUno(String face, int valor, Cor cor) {
        super(face, valor, cor);
    }
 
    @Override
    public String toString(){
        return String.format("%6s", "") + getCor().ansiCode() + " " +  getFace() + Cor.RESET.ansiCode() +", valor " + getValor();
    }

}
