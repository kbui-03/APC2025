package Homework7.hangman;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class WordFinder extends Timer {
	public String chooseRandomWordFromFile(int length) throws IOException {
		List<String> words = new ArrayList<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("words.txt"));
			for (String line; (line = reader.readLine()) != null;) {
				if (line.trim().length() == length) {
					words.add(line.trim());
				}
			}
		} finally {
			if (reader != null) {
				reader.close();
			}
		}

		if (words.isEmpty()) {
			return null;
		} else {
			String randomWord = words.get((int) (Math.random() * words.size()));
			words.remove(randomWord);
			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new FileWriter("words.txt"));
				writer.write(String.join("\n", words));
			} finally {
				if (writer != null) {
					writer.close();
				}
			}
			return randomWord;
		}
	}

	@Override
	protected void startGame() {
	    int length = 4;
	    try {
	        currentWord = chooseRandomWordFromFile(length);

	        if (currentWord == null) {
	            System.out.println("No word found.");
	            System.exit(0); 
	            return;
	        }

	        currentWord = currentWord.toLowerCase();
	        guessedLetters.clear();
	        attemptsLeft = 6;
			
			timeLeft = 60; 
			updateDisplay(); 
			inputField.setEnabled(true);
			inputField.requestFocus();
			 
			startTimer();
			 

	    } catch (IOException e) {

	        System.err.println(e.getMessage());
	        System.exit(0); 
	    }
	}
}

