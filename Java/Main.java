package Java;
import java.util.ArrayList;
import java.util.List;
// we used both import beacause we to store the cards in a list and to use the array list to create the list of cards
public class Main {


    public static void main(String[] args){

        // first we need to create the cards

        CardCreator card1  = new CardCreator (true);
        CardCreator card2  = new CardCreator (false);
        CardCreator card3  = new CardCreator (true);
        CardCreator card4  = new CardCreator (false);
        CardCreator card5  = new CardCreator (true);
        CardCreator card6  = new CardCreator (true);

        // now we need to store them

           List<CardCreator> CardList = new ArrayList<>();
              CardList.add(card1);
              CardList.add(card2);
              CardList.add(card3);
              CardList.add(card4);
              CardList.add(card5);
              CardList.add(card6);

        // now we sort them
        RecentMistakesFirstSorter sorter = new RecentMistakesFirstSorter();
        List<CardCreator> sortedCards = sorter.organize(CardList);

        // last thing we print :)

        System.out.println("Sorted Cards:");
        for (CardCreator card : sortedCards) {
            System.out.println("Card is " + card.isCorrect());
    }
    
}}
