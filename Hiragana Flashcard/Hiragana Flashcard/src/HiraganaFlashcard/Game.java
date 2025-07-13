package HiraganaFlashcard;

import java.util.Scanner;

public class Game {

    private Deck deck;
    private Scanner scanner;
    private int score;

    public Game() {
        this.deck = new Deck();
        this.scanner = new Scanner(System.in);
        this.score = 0;
    }

    public void start() {
        System.out.println("\uD83C\uDFB4 Hiragana Flashcard Quiz \uD83C\uDFB4");
        System.out.println("Type the romaji for the hiragana shown.");
        System.out.println("Type 'quit' to exit anytime");

        while (true) {
            Flashcard card = deck.getRandomCard();
            System.out.print("What is the romaji for '" + card.getHiragana() + "'? → ");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("quit")) {
                break;
            }
            if (answer.equals(card.getRomaji())) {
                System.out.println("✅ Correct!\n");
                score++;
            }

            else {
                System.out.println("❌ Wrong. The correct answer is: " + card.getRomaji() + "\n");
            }
        }
        System.out.println("👋 Quiz ended. Your score: " + score);
    }
}
