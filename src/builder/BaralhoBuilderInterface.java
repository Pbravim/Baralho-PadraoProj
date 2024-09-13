package builder;

import baralho.Baralho;

public interface BaralhoBuilderInterface {
    void reset();
    void addCartas();
    Baralho getResult();
}
