import java.util.ArrayList;
import java.util.Random;

public class Card {
    private int firstValue;
    private int secondValue;
    private String imgUrl;

    public Integer getFirstValue() {
        return firstValue;
    }

    public Integer getSecondValue() {
        return secondValue;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Card(int firstValue, int secondValue, String imgUrl) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.imgUrl = imgUrl;
        Deck.cards.add(this);
    }
}
