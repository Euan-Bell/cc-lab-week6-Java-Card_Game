import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardDeckTest {

    CardDeck cardDeck;
    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.ACE);
        cardDeck = new CardDeck(card);
    }

    @Test
    public void canCountDeck() {
        assertEquals(0, cardDeck.countDeck());
    }

//    @Test
//    public void canGetCardFromDeck() {
//
//    }
}
