package Part12;

import java.util.ArrayList;
import java.util.Random;

    public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
    	return this.numbers.contains(number);
    }

    public void randomizeNumbers() {
    	Random rand = new Random();
        this.numbers = new ArrayList<>();
        for (int i=0; i < 7; i++) {
        	this.numbers.add(rand.nextInt(50) + 50);
        }
    }

    public boolean equals(Object other) {
        return false;
    }
}