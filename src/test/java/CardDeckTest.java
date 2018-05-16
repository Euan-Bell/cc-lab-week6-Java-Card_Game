import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardDeckTest {

    CardDeck cardDeck;

    @Before
    public void before() {
        cardDeck = new CardDeck();
        cardDeck.buildDeck();
    }

    @Test
    public void canCountDeck() {
        assertEquals(52, cardDeck.countDeck());
    }

    @Test
    public void canGetCardFromDeck() {
        cardDeck.removeCard();
        assertEquals(51, cardDeck.countDeck());
    }
}
