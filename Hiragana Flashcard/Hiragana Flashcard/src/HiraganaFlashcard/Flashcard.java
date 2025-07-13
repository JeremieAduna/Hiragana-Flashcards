package HiraganaFlashcard;

public class Flashcard {
    private String hiragana;
    private String romaji;

    public Flashcard(String hiragana, String romaji) {
        this.hiragana = hiragana;
        this.romaji = romaji;
    }

    public String getHiragana() {
        return hiragana;
    }

    public String getRomaji() {
        return romaji;
    }
}
