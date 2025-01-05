import java.util.ArrayList;

public class Card {
    private Integer firstValue;
    private Integer secondValue;
    private String imgUrl;
    public static ArrayList<Card> decksOfCards;

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

        createDecksOfCards();
    }

    private void createDecksOfCards() {
        decksOfCards = new ArrayList<>();

        {
            // Karo
            decksOfCards.add(new Card(2, null, "img/cards/ready/karo2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/karo3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/karo4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/karo5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/karo6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/karo7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/karo8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/karo9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/karo10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletKaro.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaKaro.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolKaro.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asKaro.png"));

            // Trefl
            decksOfCards.add(new Card(2, null, "img/cards/ready/trefl2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/trefl3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/trefl4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/trefl5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/trefl6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/trefl7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/trefl8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/trefl9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/trefl10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletTrefl.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaTrefl.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolTrefl.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asTrefl.png"));

            // Pik
            decksOfCards.add(new Card(2, null, "img/cards/ready/pik2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/pik3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/pik4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/pik5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/pik6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/pik7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/pik8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/pik9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/pik10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletPik.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaPik.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolPik.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asPik.png"));

            // Kier
            decksOfCards.add(new Card(2, null, "img/cards/ready/kier2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/kier3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/kier4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/kier5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/kier6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/kier7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/kier8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/kier9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/kier10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletKier.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaKier.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolKier.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asKier.png"));
        }
        {
            // Karo
            decksOfCards.add(new Card(2, null, "img/cards/ready/karo2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/karo3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/karo4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/karo5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/karo6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/karo7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/karo8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/karo9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/karo10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletKaro.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaKaro.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolKaro.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asKaro.png"));

            // Trefl
            decksOfCards.add(new Card(2, null, "img/cards/ready/trefl2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/trefl3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/trefl4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/trefl5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/trefl6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/trefl7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/trefl8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/trefl9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/trefl10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletTrefl.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaTrefl.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolTrefl.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asTrefl.png"));

            // Pik
            decksOfCards.add(new Card(2, null, "img/cards/ready/pik2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/pik3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/pik4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/pik5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/pik6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/pik7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/pik8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/pik9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/pik10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletPik.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaPik.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolPik.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asPik.png"));

            // Kier
            decksOfCards.add(new Card(2, null, "img/cards/ready/kier2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/kier3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/kier4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/kier5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/kier6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/kier7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/kier8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/kier9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/kier10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletKier.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaKier.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolKier.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asKier.png"));
        }
        {
            // Karo
            decksOfCards.add(new Card(2, null, "img/cards/ready/karo2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/karo3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/karo4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/karo5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/karo6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/karo7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/karo8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/karo9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/karo10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletKaro.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaKaro.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolKaro.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asKaro.png"));

            // Trefl
            decksOfCards.add(new Card(2, null, "img/cards/ready/trefl2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/trefl3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/trefl4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/trefl5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/trefl6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/trefl7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/trefl8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/trefl9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/trefl10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletTrefl.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaTrefl.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolTrefl.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asTrefl.png"));

            // Pik
            decksOfCards.add(new Card(2, null, "img/cards/ready/pik2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/pik3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/pik4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/pik5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/pik6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/pik7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/pik8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/pik9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/pik10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletPik.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaPik.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolPik.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asPik.png"));

            // Kier
            decksOfCards.add(new Card(2, null, "img/cards/ready/kier2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/kier3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/kier4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/kier5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/kier6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/kier7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/kier8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/kier9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/kier10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletKier.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaKier.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolKier.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asKier.png"));
        }
        {
            // Karo
            decksOfCards.add(new Card(2, null, "img/cards/ready/karo2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/karo3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/karo4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/karo5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/karo6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/karo7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/karo8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/karo9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/karo10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletKaro.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaKaro.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolKaro.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asKaro.png"));

            // Trefl
            decksOfCards.add(new Card(2, null, "img/cards/ready/trefl2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/trefl3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/trefl4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/trefl5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/trefl6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/trefl7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/trefl8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/trefl9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/trefl10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletTrefl.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaTrefl.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolTrefl.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asTrefl.png"));

            // Pik
            decksOfCards.add(new Card(2, null, "img/cards/ready/pik2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/pik3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/pik4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/pik5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/pik6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/pik7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/pik8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/pik9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/pik10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletPik.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaPik.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolPik.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asPik.png"));

            // Kier
            decksOfCards.add(new Card(2, null, "img/cards/ready/kier2.png"));
            decksOfCards.add(new Card(3, null, "img/cards/ready/kier3.png"));
            decksOfCards.add(new Card(4, null, "img/cards/ready/kier4.png"));
            decksOfCards.add(new Card(5, null, "img/cards/ready/kier5.png"));
            decksOfCards.add(new Card(6, null, "img/cards/ready/kier6.png"));
            decksOfCards.add(new Card(7, null, "img/cards/ready/kier7.png"));
            decksOfCards.add(new Card(8, null, "img/cards/ready/kier8.png"));
            decksOfCards.add(new Card(9, null, "img/cards/ready/kier9.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/kier10.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/waletKier.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/damaKier.png"));
            decksOfCards.add(new Card(10, null, "img/cards/ready/krolKier.png"));
            decksOfCards.add(new Card(1, 11, "img/cards/ready/asKier.png"));
        }
    }
}
