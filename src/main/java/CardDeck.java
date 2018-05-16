import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

    private Card card;
    private ArrayList<Card> deckofcards;

    public CardDeck(Card card) {
        this.card = card;
        this.deckofcards = new ArrayList<>();
    }

    public int countDeck() {
        return this.deckofcards.size();
    }

    public void buildDeck(){
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                deckofcards.add(card);
            }
        }
        Collections.shuffle(deckofcards);
    }

}
