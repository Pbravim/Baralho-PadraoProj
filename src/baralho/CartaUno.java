package baralho;

import java.util.Arrays;

public class CartaUno extends Carta{

    public CartaUno(String face, int valor, Cor cor) {
        super(face, valor, cor);
    }
    public CartaUno(String face, int valor, Cor[] cores) {
        super(face, valor, cores);
    }

    @Override
    public String toString() {
        String result = "";

        if (getCor().length > 1) {
            result += String.format("%6s", getFace()) + " [";
            for (int i = 0; i < getCor().length; i++) {
                result += getCor()[i].ansiCode() + getCor()[i].name();
                if (i < getCor().length - 1) {
                    result += ", ";
                }
            }
            result += Cor.RESET.ansiCode() + "]";
        } else {
            result += String.format("%6s", "") + getCor()[0].ansiCode() + getFace() + Cor.RESET.ansiCode();
        }

        result += ", valor " + getValor();

        return result;
    }
}
