import java.util.ArrayList;

/**********************************
 * Texas Hold-em! Your task is to determine if the cards in the list makes up a
 * straight (five cards of sequential rank) or not. The cards will always have
 * values ranging from 2-14, where 14 is the ace.
 * 
 * Be aware that the ace (14) also should count as value 1!
 * 
 * The number of cards will vary, but will never be more than 7 (the board (5) +
 * player hand (2))
 * 
 * Examples:
 * 
 * straight: 9-10-11-12-13
 * 
 * straight: 14-2-3-4-5
 * 
 * straight: 2-7-8-5-10-9-11
 * 
 * not straight: 7-8-12-13-14
 *
 ***********************/
public final class PokerHand {

	public static boolean IsStraight(ArrayList<Integer> cards) {
		boolean swap = true;
		int middleman = 0;
		int middleman2 = 0;
		boolean finalStage = true;
		while (swap == true) {

			swap = false;
			for (int i = 0; i < cards.size() - 1; i++) {
				if (cards.get(i) > cards.get(i + 1)) {
					swap = true;
					middleman = cards.get(i);
					middleman2 = cards.get(i + 1);

					cards.set(i, middleman2);
					cards.set(i + 1, middleman);

				}
			}
		}
		if (cards.size() == 5) {
			int current = 0;
			int expected = 0;

			for (int i = 0; i < cards.size(); i++) {
				current = i;
				if (cards.get(i) == current) {
					if (cards.get(i + 1) != current + 1) {
						finalStage = false;
					}
				}
			}
		} else {
			finalStage = false;
		}

		System.out.println(cards.toString());
		return finalStage;
	}
}