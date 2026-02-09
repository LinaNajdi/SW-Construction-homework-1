package Java;
// the purpose of this class is to create a card and check if the answer is correct or not

public class CardCreator {
    // we made the viriable private because we want to make sure that it can only be accessed through the class and not outside of it
    // we made it final because we want to make sure that the value of the variable cannot be changed after it is set in the constructor
    private final boolean correct;

public CardCreator(boolean correct) {
    this.correct = correct;
}
    public boolean isCorrect() {
        return this.correct;
    }
}
