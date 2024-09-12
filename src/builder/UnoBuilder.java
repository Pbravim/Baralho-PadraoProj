package builder;

import baralho.Baralho;
import baralho.Carta;
import baralho.Cor;

public class UnoBuilder implements BaralhoBuilderInterface {
    private Baralho baralho;
    private Cor[] cores = {Cor.VERMELHO, Cor.VERDE, Cor.AZUL, Cor.AMARELO };

    @Override
    public void reset() {
        baralho = new Baralho();

    }

    @Override
    public void addCartasPadrao() {
        for (Cor cor : cores) {
            for (int i = 0; i <= 9; i++) {
                baralho.adicionarCarta(new Carta(Integer.toString(i), cor.getValue(), i, cor));
                baralho.adicionarCarta(new Carta(Integer.toString(i), cor.getValue(), i, cor));
            }
        }
    }
    @Override
    public void addCartasEspeciais() {
        for (Cor cor : cores) {
            for (int i = 0; i < 2; i++) {
                baralho.adicionarCarta(new Carta("Compre 2", cor.getValue(), 20, cor));
                baralho.adicionarCarta(new Carta("Inverter", cor.getValue(), 20, cor));
                baralho.adicionarCarta(new Carta("Pular", cor.getValue(), 20, cor));
            }
        }

        for (int i = 0; i < 4; i++) {
            baralho.adicionarCarta(new Carta("Curinga", "preto", 50));
            baralho.adicionarCarta(new Carta("Compre 4", "preto", 50));
        }

        baralho.adicionarCarta(new Carta("Trocar as Mãos", "preto", 50));
    }

    @Override
    public Baralho getResult() {
        return baralho;
    }

}
