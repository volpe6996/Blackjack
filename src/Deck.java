import java.util.ArrayList;
import java.util.Random;

public class Deck {
    public static ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Integer> usedCardsIndexes = new ArrayList<>();
    private Random r = new Random();

    Deck() {
        createDeckOfCards();
        createArrayOfUsedCardsIndexes();
    }

    private void createDeckOfCards() {
        {
            // Karo
            new Card(2, 0, "img/cards/karo2.png");
            new Card(3, 0, "img/cards/karo3.png");
            new Card(4, 0, "img/cards/karo4.png");
            new Card(5, 0, "img/cards/karo5.png");
            new Card(6, 0, "img/cards/karo6.png");
            new Card(7, 0, "img/cards/karo7.png");
            new Card(8, 0, "img/cards/karo8.png");
            new Card(9, 0, "img/cards/karo9.png");
            new Card(10, 0, "img/cards/karo10.png");
            new Card(10, 0, "img/cards/waletKaro.png");
            new Card(10, 0, "img/cards/damaKaro.png");
            new Card(10, 0, "img/cards/krolKaro.png");
            new Card(1, 11, "img/cards/asKaro.png");

            // Trefl
            new Card(2, 0, "img/cards/trefl2.png");
            new Card(3, 0, "img/cards/trefl3.png");
            new Card(4, 0, "img/cards/trefl4.png");
            new Card(5, 0, "img/cards/trefl5.png");
            new Card(6, 0, "img/cards/trefl6.png");
            new Card(7, 0, "img/cards/trefl7.png");
            new Card(8, 0, "img/cards/trefl8.png");
            new Card(9, 0, "img/cards/trefl9.png");
            new Card(10, 0, "img/cards/trefl10.png");
            new Card(10, 0, "img/cards/waletTrefl.png");
            new Card(10, 0, "img/cards/damaTrefl.png");
            new Card(10, 0, "img/cards/krolTrefl.png");
            new Card(1, 11, "img/cards/asTrefl.png");

            // Pik
            new Card(2, 0, "img/cards/pik2.png");
            new Card(3, 0, "img/cards/pik3.png");
            new Card(4, 0, "img/cards/pik4.png");
            new Card(5, 0, "img/cards/pik5.png");
            new Card(6, 0, "img/cards/pik6.png");
            new Card(7, 0, "img/cards/pik7.png");
            new Card(8, 0, "img/cards/pik8.png");
            new Card(9, 0, "img/cards/pik9.png");
            new Card(10, 0, "img/cards/pik10.png");
            new Card(10, 0, "img/cards/waletPik.png");
            new Card(10, 0, "img/cards/damaPik.png");
            new Card(10, 0, "img/cards/krolPik.png");
            new Card(1, 11, "img/cards/asPik.png");

            // Kier
            new Card(2, 0, "img/cards/kier2.png");
            new Card(3, 0, "img/cards/kier3.png");
            new Card(4, 0, "img/cards/kier4.png");
            new Card(5, 0, "img/cards/kier5.png");
            new Card(6, 0, "img/cards/kier6.png");
            new Card(7, 0, "img/cards/kier7.png");
            new Card(8, 0, "img/cards/kier8.png");
            new Card(9, 0, "img/cards/kier9.png");
            new Card(10, 0, "img/cards/kier10.png");
            new Card(10, 0, "img/cards/waletKier.png");
            new Card(10, 0, "img/cards/damaKier.png");
            new Card(10, 0, "img/cards/krolKier.png");
            new Card(1, 11, "img/cards/asKier.png");
        }
        {
            // Karo
            new Card(2, 0, "img/cards/karo2.png");
            new Card(3, 0, "img/cards/karo3.png");
            new Card(4, 0, "img/cards/karo4.png");
            new Card(5, 0, "img/cards/karo5.png");
            new Card(6, 0, "img/cards/karo6.png");
            new Card(7, 0, "img/cards/karo7.png");
            new Card(8, 0, "img/cards/karo8.png");
            new Card(9, 0, "img/cards/karo9.png");
            new Card(10, 0, "img/cards/karo10.png");
            new Card(10, 0, "img/cards/waletKaro.png");
            new Card(10, 0, "img/cards/damaKaro.png");
            new Card(10, 0, "img/cards/krolKaro.png");
            new Card(1, 11, "img/cards/asKaro.png");

            // Trefl
            new Card(2, 0, "img/cards/trefl2.png");
            new Card(3, 0, "img/cards/trefl3.png");
            new Card(4, 0, "img/cards/trefl4.png");
            new Card(5, 0, "img/cards/trefl5.png");
            new Card(6, 0, "img/cards/trefl6.png");
            new Card(7, 0, "img/cards/trefl7.png");
            new Card(8, 0, "img/cards/trefl8.png");
            new Card(9, 0, "img/cards/trefl9.png");
            new Card(10, 0, "img/cards/trefl10.png");
            new Card(10, 0, "img/cards/waletTrefl.png");
            new Card(10, 0, "img/cards/damaTrefl.png");
            new Card(10, 0, "img/cards/krolTrefl.png");
            new Card(1, 11, "img/cards/asTrefl.png");

            // Pik
            new Card(2, 0, "img/cards/pik2.png");
            new Card(3, 0, "img/cards/pik3.png");
            new Card(4, 0, "img/cards/pik4.png");
            new Card(5, 0, "img/cards/pik5.png");
            new Card(6, 0, "img/cards/pik6.png");
            new Card(7, 0, "img/cards/pik7.png");
            new Card(8, 0, "img/cards/pik8.png");
            new Card(9, 0, "img/cards/pik9.png");
            new Card(10, 0, "img/cards/pik10.png");
            new Card(10, 0, "img/cards/waletPik.png");
            new Card(10, 0, "img/cards/damaPik.png");
            new Card(10, 0, "img/cards/krolPik.png");
            new Card(1, 11, "img/cards/asPik.png");

            // Kier
            new Card(2, 0, "img/cards/kier2.png");
            new Card(3, 0, "img/cards/kier3.png");
            new Card(4, 0, "img/cards/kier4.png");
            new Card(5, 0, "img/cards/kier5.png");
            new Card(6, 0, "img/cards/kier6.png");
            new Card(7, 0, "img/cards/kier7.png");
            new Card(8, 0, "img/cards/kier8.png");
            new Card(9, 0, "img/cards/kier9.png");
            new Card(10, 0, "img/cards/kier10.png");
            new Card(10, 0, "img/cards/waletKier.png");
            new Card(10, 0, "img/cards/damaKier.png");
            new Card(10, 0, "img/cards/krolKier.png");
            new Card(1, 11, "img/cards/asKier.png");
        }
        {
            // Karo
            new Card(2, 0, "img/cards/karo2.png");
            new Card(3, 0, "img/cards/karo3.png");
            new Card(4, 0, "img/cards/karo4.png");
            new Card(5, 0, "img/cards/karo5.png");
            new Card(6, 0, "img/cards/karo6.png");
            new Card(7, 0, "img/cards/karo7.png");
            new Card(8, 0, "img/cards/karo8.png");
            new Card(9, 0, "img/cards/karo9.png");
            new Card(10, 0, "img/cards/karo10.png");
            new Card(10, 0, "img/cards/waletKaro.png");
            new Card(10, 0, "img/cards/damaKaro.png");
            new Card(10, 0, "img/cards/krolKaro.png");
            new Card(1, 11, "img/cards/asKaro.png");

            // Trefl
            new Card(2, 0, "img/cards/trefl2.png");
            new Card(3, 0, "img/cards/trefl3.png");
            new Card(4, 0, "img/cards/trefl4.png");
            new Card(5, 0, "img/cards/trefl5.png");
            new Card(6, 0, "img/cards/trefl6.png");
            new Card(7, 0, "img/cards/trefl7.png");
            new Card(8, 0, "img/cards/trefl8.png");
            new Card(9, 0, "img/cards/trefl9.png");
            new Card(10, 0, "img/cards/trefl10.png");
            new Card(10, 0, "img/cards/waletTrefl.png");
            new Card(10, 0, "img/cards/damaTrefl.png");
            new Card(10, 0, "img/cards/krolTrefl.png");
            new Card(1, 11, "img/cards/asTrefl.png");

            // Pik
            new Card(2, 0, "img/cards/pik2.png");
            new Card(3, 0, "img/cards/pik3.png");
            new Card(4, 0, "img/cards/pik4.png");
            new Card(5, 0, "img/cards/pik5.png");
            new Card(6, 0, "img/cards/pik6.png");
            new Card(7, 0, "img/cards/pik7.png");
            new Card(8, 0, "img/cards/pik8.png");
            new Card(9, 0, "img/cards/pik9.png");
            new Card(10, 0, "img/cards/pik10.png");
            new Card(10, 0, "img/cards/waletPik.png");
            new Card(10, 0, "img/cards/damaPik.png");
            new Card(10, 0, "img/cards/krolPik.png");
            new Card(1, 11, "img/cards/asPik.png");

            // Kier
            new Card(2, 0, "img/cards/kier2.png");
            new Card(3, 0, "img/cards/kier3.png");
            new Card(4, 0, "img/cards/kier4.png");
            new Card(5, 0, "img/cards/kier5.png");
            new Card(6, 0, "img/cards/kier6.png");
            new Card(7, 0, "img/cards/kier7.png");
            new Card(8, 0, "img/cards/kier8.png");
            new Card(9, 0, "img/cards/kier9.png");
            new Card(10, 0, "img/cards/kier10.png");
            new Card(10, 0, "img/cards/waletKier.png");
            new Card(10, 0, "img/cards/damaKier.png");
            new Card(10, 0, "img/cards/krolKier.png");
            new Card(1, 11, "img/cards/asKier.png");
        }
        {
            // Karo
            new Card(2, 0, "img/cards/karo2.png");
            new Card(3, 0, "img/cards/karo3.png");
            new Card(4, 0, "img/cards/karo4.png");
            new Card(5, 0, "img/cards/karo5.png");
            new Card(6, 0, "img/cards/karo6.png");
            new Card(7, 0, "img/cards/karo7.png");
            new Card(8, 0, "img/cards/karo8.png");
            new Card(9, 0, "img/cards/karo9.png");
            new Card(10, 0, "img/cards/karo10.png");
            new Card(10, 0, "img/cards/waletKaro.png");
            new Card(10, 0, "img/cards/damaKaro.png");
            new Card(10, 0, "img/cards/krolKaro.png");
            new Card(1, 11, "img/cards/asKaro.png");

            // Trefl
            new Card(2, 0, "img/cards/trefl2.png");
            new Card(3, 0, "img/cards/trefl3.png");
            new Card(4, 0, "img/cards/trefl4.png");
            new Card(5, 0, "img/cards/trefl5.png");
            new Card(6, 0, "img/cards/trefl6.png");
            new Card(7, 0, "img/cards/trefl7.png");
            new Card(8, 0, "img/cards/trefl8.png");
            new Card(9, 0, "img/cards/trefl9.png");
            new Card(10, 0, "img/cards/trefl10.png");
            new Card(10, 0, "img/cards/waletTrefl.png");
            new Card(10, 0, "img/cards/damaTrefl.png");
            new Card(10, 0, "img/cards/krolTrefl.png");
            new Card(1, 11, "img/cards/asTrefl.png");

            // Pik
            new Card(2, 0, "img/cards/pik2.png");
            new Card(3, 0, "img/cards/pik3.png");
            new Card(4, 0, "img/cards/pik4.png");
            new Card(5, 0, "img/cards/pik5.png");
            new Card(6, 0, "img/cards/pik6.png");
            new Card(7, 0, "img/cards/pik7.png");
            new Card(8, 0, "img/cards/pik8.png");
            new Card(9, 0, "img/cards/pik9.png");
            new Card(10, 0, "img/cards/pik10.png");
            new Card(10, 0, "img/cards/waletPik.png");
            new Card(10, 0, "img/cards/damaPik.png");
            new Card(10, 0, "img/cards/krolPik.png");
            new Card(1, 11, "img/cards/asPik.png");

            // Kier
            new Card(2, 0, "img/cards/kier2.png");
            new Card(3, 0, "img/cards/kier3.png");
            new Card(4, 0, "img/cards/kier4.png");
            new Card(5, 0, "img/cards/kier5.png");
            new Card(6, 0, "img/cards/kier6.png");
            new Card(7, 0, "img/cards/kier7.png");
            new Card(8, 0, "img/cards/kier8.png");
            new Card(9, 0, "img/cards/kier9.png");
            new Card(10, 0, "img/cards/kier10.png");
            new Card(10, 0, "img/cards/waletKier.png");
            new Card(10, 0, "img/cards/damaKier.png");
            new Card(10, 0, "img/cards/krolKier.png");
            new Card(1, 11, "img/cards/asKier.png");
        }
    }

    private void createArrayOfUsedCardsIndexes () {
        for (int i = 0; i < cards.size(); i++) {
            usedCardsIndexes.add(null);
        }
    }

    public Card randomCard () {
        while (true) {
            var index = r.nextInt(cards.size());
            if (usedCardsIndexes.get(index) == null) {
                usedCardsIndexes.add(index, index);
                return cards.get(index);
            }
        }
    }
}