package Homework7.hangman;
import javax.swing.SwingUtilities;

public class TimerRunable implements Runnable {
    private final Timer game;

    public TimerRunable (Timer game){
        this.game = game; 
    }

    @Override
    public void run() {
        for (int i = game.getTimeLeft(); i >= 0; i--) {
            final int secondsLeft = i;
            game.setTimeLeft(secondsLeft);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return; 
            }
        }
        SwingUtilities.invokeLater(() -> game.endGame(false));
    }
}
