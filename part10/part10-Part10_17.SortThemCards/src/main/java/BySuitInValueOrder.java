import java.util.Comparator;
import java.util.Collections;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        int suitOrder = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (suitOrder == 0) {
            return c1.compareTo(c2);
        }
        
        return suitOrder;
    }
}
