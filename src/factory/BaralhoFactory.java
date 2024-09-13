package factory;


import baralho.Baralho;
import builder.BaralhoBuilderInterface;
import builder.Director;
import builder.TradicionalBuilder;
import builder.UnoBuilder;

public class BaralhoFactory implements BaralhoFactoryInterface {
    @Override
    public Baralho criarBaralho(String tipo) {
        BaralhoBuilderInterface builder;
        Director director;
        switch (tipo.toLowerCase()) {
            case "uno":
                builder = new UnoBuilder();
                break;
            case "tradicional":
                builder = new TradicionalBuilder();
                break;
            default:
                throw new IllegalArgumentException("Tipo de baralho desconhecido: " + tipo);
        }
        director = new Director(builder);
        director.setBuilder(builder);

        return director.makeBaralho();
    }
}
