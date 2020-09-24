package com.bridgelabz.snakeandladder;

public class snakeAndLadder {
	//constants
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int player_A_Position=0;
		int player_B_Position=0;
		int counter=0;

		//Welcome statement
		System.out.println("Welcome to Snake and Ladder Simulator");

		while(player_A_Position<100 && player_B_Position<100) {
			counter+=1;
			//computation
			int numberOfMoveByA=(int) (Math.floor(Math.random()*10)%7);
			int numberOfMoveByB=(int) (Math.floor(Math.random()*10)%7);

			int optionOfPlay=(int) (Math.floor(Math.random()*10)%3);

			switch(optionOfPlay) {
			case noPlay:
				player_A_Position=player_A_Position;
				player_B_Position=player_B_Position;
				break;
			case ladder:
				if (player_A_Position+numberOfMoveByA>100)
					player_A_Position=player_A_Position;
				else if(player_B_Position+numberOfMoveByB>100)
					player_B_Position=player_B_Position;
				else {
					player_A_Position+=numberOfMoveByA;
					player_B_Position+=numberOfMoveByB;

					//Extra move computation
					int extraNumberOfMoveByA=(int) (Math.floor(Math.random()*10)%7);
					int extraNumberOfMoveByB=(int) (Math.floor(Math.random()*10)%7);
					counter+=1;
					if (player_A_Position+extraNumberOfMoveByA>100)
						player_A_Position=player_A_Position;
					else if(player_B_Position+extraNumberOfMoveByB>100)
						player_B_Position=player_B_Position;
					else {
						player_A_Position+=extraNumberOfMoveByA;
						player_B_Position+=extraNumberOfMoveByB;
					}
				}
				break;
			case snake:
				if (player_A_Position-numberOfMoveByA>=0)
					player_A_Position-=numberOfMoveByA;
				else if(player_B_Position-numberOfMoveByB>=0)
					player_B_Position-=player_B_Position;
				else {
					player_A_Position=0;
					player_B_Position=0;
				}
				break;
			}
		}
		System.out.println("Player A position "+player_A_Position+"\t Player B position :"+player_B_Position);
		System.out.println("Total number of moves is :"+counter);
		if(player_B_Position==100 && player_A_Position==100)
			System.out.println("Both the player are winner");
		else if (player_B_Position==100 && player_A_Position<100)
			System.out.println("Player B is the winner");
		else if (player_A_Position==100 && player_B_Position<100)
			System.out.println("Player A is the winner");

	}
}
