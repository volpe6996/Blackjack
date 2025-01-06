import java.util.ArrayList;
import java.util.Random;

public class Deck {
    public ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Integer> usedCardsIndexes = new ArrayList<>();
    private Random r = new Random();

    Deck()
    {
        createDeckOfCards();
        createArrayOfUsedCardsIndexes();
    }

    private void createDeckOfCards() {
        {
            // Karo
            cards.add(new Card(2, null, "img/cards/karo2.png"));
            cards.add(new Card(3, null, "img/cards/karo3.png"));
            cards.add(new Card(4, null, "img/cards/karo4.png"));
            cards.add(new Card(5, null, "img/cards/karo5.png"));
            cards.add(new Card(6, null, "img/cards/karo6.png"));
            cards.add(new Card(7, null, "img/cards/karo7.png"));
            cards.add(new Card(8, null, "img/cards/karo8.png"));
            cards.add(new Card(9, null, "img/cards/karo9.png"));
            cards.add(new Card(10, null, "img/cards/karo10.png"));
            cards.add(new Card(10, null, "img/cards/waletKaro.png"));
            cards.add(new Card(10, null, "img/cards/damaKaro.png"));
            cards.add(new Card(10, null, "img/cards/krolKaro.png"));
            cards.add(new Card(1, 11, "img/cards/asKaro.png"));

            // Trefl
            cards.add(new Card(2, null, "img/cards/trefl2.png"));
            cards.add(new Card(3, null, "img/cards/trefl3.png"));
            cards.add(new Card(4, null, "img/cards/trefl4.png"));
            cards.add(new Card(5, null, "img/cards/trefl5.png"));
            cards.add(new Card(6, null, "img/cards/trefl6.png"));
            cards.add(new Card(7, null, "img/cards/trefl7.png"));
            cards.add(new Card(8, null, "img/cards/trefl8.png"));
            cards.add(new Card(9, null, "img/cards/trefl9.png"));
            cards.add(new Card(10, null, "img/cards/trefl10.png"));
            cards.add(new Card(10, null, "img/cards/waletTrefl.png"));
            cards.add(new Card(10, null, "img/cards/damaTrefl.png"));
            cards.add(new Card(10, null, "img/cards/krolTrefl.png"));
            cards.add(new Card(1, 11, "img/cards/asTrefl.png"));

            // Pik
            cards.add(new Card(2, null, "img/cards/pik2.png"));
            cards.add(new Card(3, null, "img/cards/pik3.png"));
            cards.add(new Card(4, null, "img/cards/pik4.png"));
            cards.add(new Card(5, null, "img/cards/pik5.png"));
            cards.add(new Card(6, null, "img/cards/pik6.png"));
            cards.add(new Card(7, null, "img/cards/pik7.png"));
            cards.add(new Card(8, null, "img/cards/pik8.png"));
            cards.add(new Card(9, null, "img/cards/pik9.png"));
            cards.add(new Card(10, null, "img/cards/pik10.png"));
            cards.add(new Card(10, null, "img/cards/waletPik.png"));
            cards.add(new Card(10, null, "img/cards/damaPik.png"));
            cards.add(new Card(10, null, "img/cards/krolPik.png"));
            cards.add(new Card(1, 11, "img/cards/asPik.png"));

            // Kier
            cards.add(new Card(2, null, "img/cards/kier2.png"));
            cards.add(new Card(3, null, "img/cards/kier3.png"));
            cards.add(new Card(4, null, "img/cards/kier4.png"));
            cards.add(new Card(5, null, "img/cards/kier5.png"));
            cards.add(new Card(6, null, "img/cards/kier6.png"));
            cards.add(new Card(7, null, "img/cards/kier7.png"));
            cards.add(new Card(8, null, "img/cards/kier8.png"));
            cards.add(new Card(9, null, "img/cards/kier9.png"));
            cards.add(new Card(10, null, "img/cards/kier10.png"));
            cards.add(new Card(10, null, "img/cards/waletKier.png"));
            cards.add(new Card(10, null, "img/cards/damaKier.png"));
            cards.add(new Card(10, null, "img/cards/krolKier.png"));
            cards.add(new Card(1, 11, "img/cards/asKier.png"));
        }
        {
            // Karo
            cards.add(new Card(2, null, "img/cards/karo2.png"));
            cards.add(new Card(3, null, "img/cards/karo3.png"));
            cards.add(new Card(4, null, "img/cards/karo4.png"));
            cards.add(new Card(5, null, "img/cards/karo5.png"));
            cards.add(new Card(6, null, "img/cards/karo6.png"));
            cards.add(new Card(7, null, "img/cards/karo7.png"));
            cards.add(new Card(8, null, "img/cards/karo8.png"));
            cards.add(new Card(9, null, "img/cards/karo9.png"));
            cards.add(new Card(10, null, "img/cards/karo10.png"));
            cards.add(new Card(10, null, "img/cards/waletKaro.png"));
            cards.add(new Card(10, null, "img/cards/damaKaro.png"));
            cards.add(new Card(10, null, "img/cards/krolKaro.png"));
            cards.add(new Card(1, 11, "img/cards/asKaro.png"));

            // Trefl
            cards.add(new Card(2, null, "img/cards/trefl2.png"));
            cards.add(new Card(3, null, "img/cards/trefl3.png"));
            cards.add(new Card(4, null, "img/cards/trefl4.png"));
            cards.add(new Card(5, null, "img/cards/trefl5.png"));
            cards.add(new Card(6, null, "img/cards/trefl6.png"));
            cards.add(new Card(7, null, "img/cards/trefl7.png"));
            cards.add(new Card(8, null, "img/cards/trefl8.png"));
            cards.add(new Card(9, null, "img/cards/trefl9.png"));
            cards.add(new Card(10, null, "img/cards/trefl10.png"));
            cards.add(new Card(10, null, "img/cards/waletTrefl.png"));
            cards.add(new Card(10, null, "img/cards/damaTrefl.png"));
            cards.add(new Card(10, null, "img/cards/krolTrefl.png"));
            cards.add(new Card(1, 11, "img/cards/asTrefl.png"));

            // Pik
            cards.add(new Card(2, null, "img/cards/pik2.png"));
            cards.add(new Card(3, null, "img/cards/pik3.png"));
            cards.add(new Card(4, null, "img/cards/pik4.png"));
            cards.add(new Card(5, null, "img/cards/pik5.png"));
            cards.add(new Card(6, null, "img/cards/pik6.png"));
            cards.add(new Card(7, null, "img/cards/pik7.png"));
            cards.add(new Card(8, null, "img/cards/pik8.png"));
            cards.add(new Card(9, null, "img/cards/pik9.png"));
            cards.add(new Card(10, null, "img/cards/pik10.png"));
            cards.add(new Card(10, null, "img/cards/waletPik.png"));
            cards.add(new Card(10, null, "img/cards/damaPik.png"));
            cards.add(new Card(10, null, "img/cards/krolPik.png"));
            cards.add(new Card(1, 11, "img/cards/asPik.png"));

            // Kier
            cards.add(new Card(2, null, "img/cards/kier2.png"));
            cards.add(new Card(3, null, "img/cards/kier3.png"));
            cards.add(new Card(4, null, "img/cards/kier4.png"));
            cards.add(new Card(5, null, "img/cards/kier5.png"));
            cards.add(new Card(6, null, "img/cards/kier6.png"));
            cards.add(new Card(7, null, "img/cards/kier7.png"));
            cards.add(new Card(8, null, "img/cards/kier8.png"));
            cards.add(new Card(9, null, "img/cards/kier9.png"));
            cards.add(new Card(10, null, "img/cards/kier10.png"));
            cards.add(new Card(10, null, "img/cards/waletKier.png"));
            cards.add(new Card(10, null, "img/cards/damaKier.png"));
            cards.add(new Card(10, null, "img/cards/krolKier.png"));
            cards.add(new Card(1, 11, "img/cards/asKier.png"));
        }
        {
            // Karo
            cards.add(new Card(2, null, "img/cards/karo2.png"));
            cards.add(new Card(3, null, "img/cards/karo3.png"));
            cards.add(new Card(4, null, "img/cards/karo4.png"));
            cards.add(new Card(5, null, "img/cards/karo5.png"));
            cards.add(new Card(6, null, "img/cards/karo6.png"));
            cards.add(new Card(7, null, "img/cards/karo7.png"));
            cards.add(new Card(8, null, "img/cards/karo8.png"));
            cards.add(new Card(9, null, "img/cards/karo9.png"));
            cards.add(new Card(10, null, "img/cards/karo10.png"));
            cards.add(new Card(10, null, "img/cards/waletKaro.png"));
            cards.add(new Card(10, null, "img/cards/damaKaro.png"));
            cards.add(new Card(10, null, "img/cards/krolKaro.png"));
            cards.add(new Card(1, 11, "img/cards/asKaro.png"));

            // Trefl
            cards.add(new Card(2, null, "img/cards/trefl2.png"));
            cards.add(new Card(3, null, "img/cards/trefl3.png"));
            cards.add(new Card(4, null, "img/cards/trefl4.png"));
            cards.add(new Card(5, null, "img/cards/trefl5.png"));
            cards.add(new Card(6, null, "img/cards/trefl6.png"));
            cards.add(new Card(7, null, "img/cards/trefl7.png"));
            cards.add(new Card(8, null, "img/cards/trefl8.png"));
            cards.add(new Card(9, null, "img/cards/trefl9.png"));
            cards.add(new Card(10, null, "img/cards/trefl10.png"));
            cards.add(new Card(10, null, "img/cards/waletTrefl.png"));
            cards.add(new Card(10, null, "img/cards/damaTrefl.png"));
            cards.add(new Card(10, null, "img/cards/krolTrefl.png"));
            cards.add(new Card(1, 11, "img/cards/asTrefl.png"));

            // Pik
            cards.add(new Card(2, null, "img/cards/pik2.png"));
            cards.add(new Card(3, null, "img/cards/pik3.png"));
            cards.add(new Card(4, null, "img/cards/pik4.png"));
            cards.add(new Card(5, null, "img/cards/pik5.png"));
            cards.add(new Card(6, null, "img/cards/pik6.png"));
            cards.add(new Card(7, null, "img/cards/pik7.png"));
            cards.add(new Card(8, null, "img/cards/pik8.png"));
            cards.add(new Card(9, null, "img/cards/pik9.png"));
            cards.add(new Card(10, null, "img/cards/pik10.png"));
            cards.add(new Card(10, null, "img/cards/waletPik.png"));
            cards.add(new Card(10, null, "img/cards/damaPik.png"));
            cards.add(new Card(10, null, "img/cards/krolPik.png"));
            cards.add(new Card(1, 11, "img/cards/asPik.png"));

            // Kier
            cards.add(new Card(2, null, "img/cards/kier2.png"));
            cards.add(new Card(3, null, "img/cards/kier3.png"));
            cards.add(new Card(4, null, "img/cards/kier4.png"));
            cards.add(new Card(5, null, "img/cards/kier5.png"));
            cards.add(new Card(6, null, "img/cards/kier6.png"));
            cards.add(new Card(7, null, "img/cards/kier7.png"));
            cards.add(new Card(8, null, "img/cards/kier8.png"));
            cards.add(new Card(9, null, "img/cards/kier9.png"));
            cards.add(new Card(10, null, "img/cards/kier10.png"));
            cards.add(new Card(10, null, "img/cards/waletKier.png"));
            cards.add(new Card(10, null, "img/cards/damaKier.png"));
            cards.add(new Card(10, null, "img/cards/krolKier.png"));
            cards.add(new Card(1, 11, "img/cards/asKier.png"));
        }
        {
            // Karo
            cards.add(new Card(2, null, "img/cards/karo2.png"));
            cards.add(new Card(3, null, "img/cards/karo3.png"));
            cards.add(new Card(4, null, "img/cards/karo4.png"));
            cards.add(new Card(5, null, "img/cards/karo5.png"));
            cards.add(new Card(6, null, "img/cards/karo6.png"));
            cards.add(new Card(7, null, "img/cards/karo7.png"));
            cards.add(new Card(8, null, "img/cards/karo8.png"));
            cards.add(new Card(9, null, "img/cards/karo9.png"));
            cards.add(new Card(10, null, "img/cards/karo10.png"));
            cards.add(new Card(10, null, "img/cards/waletKaro.png"));
            cards.add(new Card(10, null, "img/cards/damaKaro.png"));
            cards.add(new Card(10, null, "img/cards/krolKaro.png"));
            cards.add(new Card(1, 11, "img/cards/asKaro.png"));

            // Trefl
            cards.add(new Card(2, null, "img/cards/trefl2.png"));
            cards.add(new Card(3, null, "img/cards/trefl3.png"));
            cards.add(new Card(4, null, "img/cards/trefl4.png"));
            cards.add(new Card(5, null, "img/cards/trefl5.png"));
            cards.add(new Card(6, null, "img/cards/trefl6.png"));
            cards.add(new Card(7, null, "img/cards/trefl7.png"));
            cards.add(new Card(8, null, "img/cards/trefl8.png"));
            cards.add(new Card(9, null, "img/cards/trefl9.png"));
            cards.add(new Card(10, null, "img/cards/trefl10.png"));
            cards.add(new Card(10, null, "img/cards/waletTrefl.png"));
            cards.add(new Card(10, null, "img/cards/damaTrefl.png"));
            cards.add(new Card(10, null, "img/cards/krolTrefl.png"));
            cards.add(new Card(1, 11, "img/cards/asTrefl.png"));

            // Pik
            cards.add(new Card(2, null, "img/cards/pik2.png"));
            cards.add(new Card(3, null, "img/cards/pik3.png"));
            cards.add(new Card(4, null, "img/cards/pik4.png"));
            cards.add(new Card(5, null, "img/cards/pik5.png"));
            cards.add(new Card(6, null, "img/cards/pik6.png"));
            cards.add(new Card(7, null, "img/cards/pik7.png"));
            cards.add(new Card(8, null, "img/cards/pik8.png"));
            cards.add(new Card(9, null, "img/cards/pik9.png"));
            cards.add(new Card(10, null, "img/cards/pik10.png"));
            cards.add(new Card(10, null, "img/cards/waletPik.png"));
            cards.add(new Card(10, null, "img/cards/damaPik.png"));
            cards.add(new Card(10, null, "img/cards/krolPik.png"));
            cards.add(new Card(1, 11, "img/cards/asPik.png"));

            // Kier
            cards.add(new Card(2, null, "img/cards/kier2.png"));
            cards.add(new Card(3, null, "img/cards/kier3.png"));
            cards.add(new Card(4, null, "img/cards/kier4.png"));
            cards.add(new Card(5, null, "img/cards/kier5.png"));
            cards.add(new Card(6, null, "img/cards/kier6.png"));
            cards.add(new Card(7, null, "img/cards/kier7.png"));
            cards.add(new Card(8, null, "img/cards/kier8.png"));
            cards.add(new Card(9, null, "img/cards/kier9.png"));
            cards.add(new Card(10, null, "img/cards/kier10.png"));
            cards.add(new Card(10, null, "img/cards/waletKier.png"));
            cards.add(new Card(10, null, "img/cards/damaKier.png"));
            cards.add(new Card(10, null, "img/cards/krolKier.png"));
            cards.add(new Card(1, 11, "img/cards/asKier.png"));
        }
    }

    private void createArrayOfUsedCardsIndexes() {
        for (int i = 0; i < 208; i++) {
            usedCardsIndexes.add(null);
        }
    }

    public Card randomCard(){
        while(true){
            var index = r.nextInt(cards.size());
            if(usedCardsIndexes.get(index) == null){
                usedCardsIndexes.add(index, index);
                return cards.get(index);
            }
        }
    }

}
