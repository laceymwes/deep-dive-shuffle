/**
 * 
 */
package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

/**
 * @author lacey
 *
 */
public class Shuffle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] deck = createDeck(100);
		shuffle(deck);
		reveal(deck);
	}

	private static int[] createDeck(int size) {
		int[] deck = new int[size];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		return deck;
	}

	private static void shuffle(int[] deck) {
		Random rng = new Random();
		for (int i = deck.length - 1; i > 0; i--) {
			int source = rng.nextInt(i + 1);
			int temp = deck[i];
			deck[i] = deck[source];
			deck[source] = temp;
		}
	}

	private static void reveal(int[] deck) {
		System.out.println(Arrays.toString(deck));
	}

}
