package baralho;// classe DeckOfCards representa um baralho.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho
{
   private List<Carta> deck; // ArrayList usado como uma pilha de objetos
   private Random randomNumbers; // gerador de n�mero aleat�rio

   // construtor preenche baralho de cartas
   public Baralho() {
       deck = new ArrayList<>();
       randomNumbers = new Random();
   }

   public void adicionarCarta(Carta carta){ deck.add(carta);}
   public boolean hasCard() {
	   return deck.size() > 0;
   }
   
   // embaralha as cartas com um algoritmo de uma passagem
   public void shuffle()
   {
      // depois de embaralhar, a distribui��o deve iniciar em deck[ 0 ] novamente
      // para cada Card, seleciona outro Card aleat�rio e os compara
      for ( int first = 0; first < deck.size(); first++ )
      {
         // seleciona um n�mero aleat�rio entre 0 e 51
         int second =  randomNumbers.nextInt(deck.size() );

         // compara Card atual com Card aleatoriamente selecionado
         Carta temp = deck.remove( second );     
         deck.add(0, temp);
      } // for final
   } // fim do m�todo shuffle

   // retira uma carta, do topo do monte
   public Carta dealCard()
   {
       return deck.remove(deck.size()-1); // retorna Card atual no array
   } // fim do m�todo dealCard
   
   
   public int size() {
	   return deck.size();
   }
   
   public String toString() {
	  String s = "";
	  int column = 0;
	  for (Carta card : deck) {
		  column++;
		  s += card.toString() + "   ";
		  if (column % 4 == 0) {
			  s += "\n";
			  column = 0;
		  }
	  }
      return s;
   }

} // fim da classe DeckOfCards


