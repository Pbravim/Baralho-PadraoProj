package builder;

import baralho.Baralho;

public interface BaralhoBuilderInterface {
    void reset();
    void addCartasPadrao();
    void addCartasEspeciais();
    Baralho getResult();
}
