package com.laddersnake;

import java.util.*;

public class SnakeladderUC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int position = 0;
		while (position != 100) {
			int dicenumber = (int) Math.floor(Math.random() * 6 + 1);
			int value = (int) Math.floor(Math.random() * 3);

			if (value == 1) {
				position += dicenumber;
				System.out.println("Player got ladder");
				System.out.println("Player moved ahead by" + dicenumber);
			} else {
				if (value == 2) {
					position -= dicenumber;
					System.out.println("Player got snake");
					System.out.println("Player moved down by" + dicenumber);
				}
				if (position < 0) {
					position = 0;
				} else {
					System.out.println("Player should stay on same position");
				}
			}
		}
		System.out.println("Player won the game");
	}

}
