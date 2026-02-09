package Java;
import java.util.ArrayList;
import java.util.List;
// we used both import beacause we to store the cards in a list and to use the array list to create the list of cards
public class Main {


    public static void main(String[] args){

        // first we need to create the cards

        CardCreator card1  = new CardCreator (true ,"is the capital of saudi riyadh? ");
        CardCreator card2  = new CardCreator (false ,"is 1+1=3? ");
        CardCreator card3  = new CardCreator (true, "are sw students Engineers ? ");
        CardCreator card4  = new CardCreator (false, "is the day 25 hours? ");
        CardCreator card5  = new CardCreator (true ,"3+9=12? ");
        CardCreator card6  = new CardCreator (true,"is the sky blue? ");

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
            System.out.println("Q : " + card.getQuestion() +"Card is " + card.isCorrect());
    }
    
}}
