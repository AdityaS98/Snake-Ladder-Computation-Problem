package com.laddersnake;

public class SnakeLadderUC5 {

	public static void main(String[] args) {
		
		int position=0;
		while(position!=100) {
			int dicenumber= (int)Math.floor(Math.random()*6+1);
			int value=(int)Math.floor(Math.random()*3);
			if(value==1) {
				if(position<95) {
					position+=dicenumber;
					System.out.println("Player got ladder");
					System.out.println("Player shifted forward by:"+dicenumber);
				}
				else 
					else if{
						((position <= 95 && dicenumber == 5) || (position <= 96 && dicenumber == 4)
	                || (position <= 97 && dicenumber == 3) || (position <= 98 && dicenumber == 2)
	                || (position <= 99 && dicenumber == 1))
						position+=dicenumber;
						System.out.println("Player got ladder");
						System.out.println("Player shifted forwardby:"+dicenumber);
				}
			
				
					else {
						continue;
					}
				
						
					else if 
						((position <= 95 && dicenumber == 5) || (position <= 96 && dicenumber == 4)
	        || (position <= 97 && dicenumber == 3) || (position <= 98 && dicenumber == 2)
	        || (position <= 99 && dicenumber == 1)) {
						
					
					
						position+=dicenumber;
						System.out.println("Player got ladder");
						System.out.println("Player shifted forwardby:"+dicenumber);
					}
					
					else {
						continue;
					}
					else if(value==2) {
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
						System.out.println("Player won the game");
			}
		}
	}