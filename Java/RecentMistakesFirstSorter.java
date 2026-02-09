package Java;
import java.util.Collections;
import java.util.List;


public class RecentMistakesFirstSorter implements OrganizerInterface {
    
    @Override
    public List<CardCreator> organize(List<CardCreator> cards) {

        // we put a before the b so we can sort it and put the uncorrect answer first
        Collections.sort(cards, (a, b) -> Boolean.compare(a.isCorrect(), b.isCorrect()));
        return cards;
    }
    
}
