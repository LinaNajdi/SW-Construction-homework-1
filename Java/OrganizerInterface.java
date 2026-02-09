package Java;
import java.util.List;

// we used import because we need to store the cards in a list

public interface  OrganizerInterface {
    
  List<CardCreator> organize(List<CardCreator> cards);

}

