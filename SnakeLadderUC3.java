package com.laddersnake;

public class SnakeLadderUC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dicevalue = (int) (Math.random() * 6 + 1);
		int value = (int) (Math.random() * 3);
		int position = 0;
		if (value == 0) {
			System.out.println("Players position did not change");
		} else if (value == 1) {
			int newvalue = (int) (position + dicevalue);
			System.out.println("Player moved further");
		} else {
			int newvalue1 = (int) (position - dicevalue);
			System.out.println("Player got stuck");
		}

	}

}
