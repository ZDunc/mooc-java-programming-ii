import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card c: cards)
            System.out.println(c);
    }

    public void sort() {
        cards.stream()
            .sorted()
            .forEach(s -> System.out.println(s));
    }

    public int compareTo(Hand h) {
        int mySum = cards.stream()
            .map(card -> card.getValue())
            .reduce(0, (tempSum, value) -> tempSum + value);
        
        int opponentSum = h.cards.stream()
            .map(card -> card.getValue())
            .reduce(0, (tempSum, value) -> tempSum + value);

        return mySum - opponentSum;
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}
