import java.util.ArrayList;
import java.util.Random;

public class Card {
    private Integer firstValue;
    private Integer secondValue;
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

    public Card(Integer firstValue, Integer secondValue, String imgUrl) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.imgUrl = imgUrl;
    }
}
