import java.util.*;
     // represents a deck of cards of any size
     public class Deck
     {
          // a stack of Card objects
          protected Stack cards;
          // a collection of all drawn cards
          protected List drawnCards;
          // allows random retrieval of cards in the above List
          protected Random random;
          // creates a Deck of the given size
          public Deck(int size)
          {
               // push the sent number of Cards onto the stack
               cards = new Stack();
               for(int i = 0; i < size; i++)
               {
                    cards.push(new Card(i));
     }
               // create a pool for drawn cards and our number generator
               drawnCards = new ArrayList();
               random = new Random();
               // shuffle the deck
               shuffle();
          }
          // returns the number of cards associated with this Deck
          public int getSize()
          {
               return cards.size() + drawnCards.size();
          }
          // draws the top card from the deck
          public Card draw()
          {
               // if the stack is empty, fill it using the drawn pile
               if(cards.isEmpty())
               {
                    shuffle();
               }
               // pop the top Card, add it to the pile, then return it
               Object card = cards.pop();
               drawnCards.add(card);
               return (Card)card;
          }
          // randomly shuffles the cards in this Deck
          public void shuffle()
          {
               // clear the stack
               while(!cards.isEmpty())
               {
                    drawnCards.add(cards.pop());
//More on Methods
     }
               // randomly draw cards from the drawn pile back onto the stack
               Object card = null;
               while(!drawnCards.isEmpty())
               {
                    card = drawnCards.remove(
                                 Math.abs(random.nextInt())%drawnCards.size());
                    cards.push(card);
               }
          }
     }    // Deck