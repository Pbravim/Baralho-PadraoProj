import baralho.Baralho;
import factory.BaralhoFactory;

public class Main {
    public static void main(String[] args) {
        BaralhoFactory factory = new BaralhoFactory();

        Baralho baralhoUno = factory.criarBaralho("uno");
        System.out.println("Baralho UNO - Tamanho: " + baralhoUno.size());
        System.out.println(baralhoUno);

        // Embaralhar o baralho UNO
        baralhoUno.shuffle();
        System.out.println("\nBaralho UNO embaralhado:");
        System.out.println(baralhoUno);

        // Distribuir 5 cartas do baralho UNO
        System.out.println("\nDistribuindo 5 cartas do baralho UNO:");
        for (int i = 0; i < 5; i++) {
            System.out.println(baralhoUno.dealCard());
        }

        // Exibir o tamanho do baralho UNO após a distribuição
        System.out.println("\nTamanho do baralho UNO após distribuição: " + baralhoUno.size());

        Baralho baralhoTradicional = factory.criarBaralho("tradicional");
        System.out.println("\nBaralho Tradicional - Tamanho: " + baralhoTradicional.size());
        System.out.println(baralhoTradicional);

        // Embaralhar o baralho Tradicional
        baralhoTradicional.shuffle();
        System.out.println("\nBaralho Tradicional embaralhado:");
        System.out.println(baralhoTradicional);

        // Distribuir 5 cartas do baralho Tradicional
        System.out.println("\nDistribuindo 5 cartas do baralho Tradicional:");
        for (int i = 0; i < 5; i++) {
            System.out.println(baralhoTradicional.dealCard());
        }

        // Exibir o tamanho do baralho Tradicional após a distribuição
        System.out.println("\nTamanho do baralho Tradicional após distribuição: " + baralhoTradicional.size());
    }
}
