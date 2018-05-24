/**
 * 
 */
package edu.cnm.deepdive;

import java.util.Arrays;

/**
 * @author lacey
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] deck = createDeck(100);
		ArrayShuffles.shuffle(deck);
		reveal(deck);
	}

	private static int[] createDeck(int size) {
		int[] deck = new int[size];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		return deck;
	}

	private static void reveal(int[] deck) {
		System.out.println(Arrays.toString(deck));
	}

}
