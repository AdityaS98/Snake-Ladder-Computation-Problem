package com.laddersnake;

public class SnakeLadderUC7 {

	public static void main(String[] args) {
		int player = 1;
		int count1 = 0;
		int count2 = 0;
		int count = 0;

		
		for (; player <= 2; player++) {

			
			int position = 0;

			
			while (position != 100) {

				
				int dicenumber = (int) Math.floor(Math.random() * 6 + 1);

				
				int value = (int) Math.floor(Math.random() * 3);

				
				if (value == 1) {

					
					if (position < 95) {
						position += dicenumber;
						
					} else if ((position == 95 && dicenumber == 5) || (position == 96 && dicenumber == 4)
							|| (position == 97 && dicenumber == 3) || (position == 98 && dicenumber == 2)
							|| (position == 99 && dicenumber == 1)) {
						position += dicenumber;
						
					} else {
						continue;
					}

					/*
					 * If player get a ladder he get one more chance
					 */

					int position2 = getrandom();
					position += position2;
				} else if (value == 2) {
					position -= dicenumber;

					
					if (position < 0) {
						position = 0;
					}

				} else {
					continue;
				}
                count++;
			}
			
	
			if (player == 1) {
				count2 = count;
				System.out.println("Roll of dice needed to win player1 " + count);
			} else if (player == 2) {
				count2 = count;
				System.out.println("Roll of dice needed to win player2 " + count);
			}

		}
		if (count1 < count2) {
			System.out.println("Player one is winner");
		} else {
			System.out.println("Player two is winner");
		}
	}


	public static int getrandom() {

		int dice = (int) Math.floor(Math.random() * 6 + 1);

		int result = (int) Math.floor(Math.random() * 3);

		if (result == 1) {
			return dice;
		} else if (result == 2) {
			return -dice;
		} else {
			return 0;
		}
	}
}
