package Homework7.hangman;

public class Timer extends Game{
    protected Thread timerThread;
    protected boolean timerRunning; 

@Override
    protected void startGame () {
        super.startGame();
        timerRunning = false;
        startTimer();
    }
    
    protected void startTimer(){
        timerRunning = true;
        timerThread = new Thread(new TimerRunable(this));
        timerThread.start();
    }

    public void setTimeLeft(int seconds) {
        this.timeLeft = seconds;
        updateDisplay();
    }

    public int getTimeLeft() {
        return timeLeft;
    }
}
