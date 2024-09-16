package builder;

import baralho.Baralho;
import baralho.CartaUno;
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
                baralho.adicionarCarta(new CartaUno(Integer.toString(i), i, cor));
                baralho.adicionarCarta(new CartaUno(Integer.toString(i), i, cor));
            }
        }
    }

    public void addCartasEspeciais() {
        for (Cor cor : cores) {
            for (int i = 0; i < 2; i++) {
                baralho.adicionarCarta(new CartaUno("Compre 2", 20, cor));
                baralho.adicionarCarta(new CartaUno("Inverter", 20, cor));
                baralho.adicionarCarta(new CartaUno("Pular", 20, cor));
            }
        }

        for (int i = 0; i < 4; i++) {
             baralho.adicionarCarta(new CartaUno("Curinga", 50, cores));
             baralho.adicionarCarta(new CartaUno("Compre 4", 50, cores));
        }

         baralho.adicionarCarta(new CartaUno("Trocar as Mãos", 50, cores));
    }

    @Override
    public Baralho getResult() {
        return baralho;
    }

}
