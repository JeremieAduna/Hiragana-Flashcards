package HiraganaFlashcard;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Flashcard> cards = new ArrayList<>();

    public Deck() {
        cards.add(new Flashcard("あ", "a"));
        cards.add(new Flashcard("い", "i"));
        cards.add(new Flashcard("う", "u"));
        cards.add(new Flashcard("え", "e"));
        cards.add(new Flashcard("お", "o"));
        cards.add(new Flashcard("か", "ka"));
        cards.add(new Flashcard("き", "ki"));
        cards.add(new Flashcard("く", "ku"));
        cards.add(new Flashcard("け", "ke"));
        cards.add(new Flashcard("こ", "ko"));
        // Add more if you want!
    }

    public Flashcard getRandomCard() {
        Random rand = new Random();
        return cards.get(rand.nextInt(cards.size()));
    }
}
