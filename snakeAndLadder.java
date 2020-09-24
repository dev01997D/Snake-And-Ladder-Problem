package com.bridgelabz.snakeandladder;

public class snakeAndLadder {
	//constants
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int player_Position=0;

		//Welcome statement
		System.out.println("Welcome to Snake and Ladder Simulator");

		while(player_Position<100) {
			//computation
			int numberOfMove=(int) (Math.floor(Math.random()*10)%7);
			int optionOfPlay=(int) (Math.floor(Math.random()*10)%3);

			switch(optionOfPlay) {
			case noPlay:
				player_Position=player_Position;
				break;
			case ladder:
				player_Position+=numberOfMove;
				break;
			case snake:
				if (player_Position-numberOfMove>=0)
					player_Position-=numberOfMove;
				else
					player_Position=0;
				break;
			}
		}
	}

}
