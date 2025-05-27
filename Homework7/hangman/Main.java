package Homework7.hangman;
import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new WordFinder();
        });
    }
}

