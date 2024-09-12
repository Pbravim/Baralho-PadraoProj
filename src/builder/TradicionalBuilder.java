package builder;

import baralho.Baralho;
import baralho.Carta;
import baralho.Cor;

public class TradicionalBuilder implements BaralhoBuilderInterface {
    private Baralho baralho;
    public void reset() {
        baralho = new Baralho();
    }

    @Override
    public void addCartasPadrao() {
        String faces[] = { "As", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Valete", "Dama", "Rei" };
        String naipes[] = { "\u2665", "\u2666", "\u2663", "\u2660" };

        for (int i = 0; i < faces.length; i++) {
            for (int j = 0; j < naipes.length; j++) {
                int valor = i + 1;
                baralho.adicionarCarta(new Carta(faces[i], naipes[j], valor, naipes[j] == "\u2665" || naipes[j] == "\u2666" ? Cor.VERMELHO: Cor.PRETO ));
            }
        }

    }

    public void addCartasEspeciais() {
    }

    @Override
    public Baralho getResult() {
        return baralho;
    }
}
