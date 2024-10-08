package packagetic;

import java.util.Scanner;

public class TicTacToe {
	 static char[][] Board = new char[3][3];
	 int firstInput;
	 
	 
	public void showBoard() {    //displaying the initial board
		System.out.println("|--|--|--|");
		System.out.println("|1 |2 |3 |");
		System.out.println("|--------|");
		System.out.println("|4 |5 |6 |");
		System.out.println("|--------|");
		System.out.println("|7 |8 |9 |");
		System.out.println("|--|--|--|");
	}
	
	
	public void placeX(int firstInput) {   //placing X on the board cell
		this.firstInput = firstInput;
		for(int i =0 ; i<=2; i++) {
			System.out.println("|--|--|--|");
			System.out.print("|");
			for(int j =0 ; j<=2; j++) {
				if((i*3)+(j+1) == firstInput) {
					Board[i][j] = 'X';
				}
				System.out.print(Board[i][j]+" |");
			}
			System.out.println();
		}
		
	}
	
	public void placeO(int firstInput) {     //placing O on the board cell
		this.firstInput = firstInput;
		for(int i =0 ; i<=2; i++) {
			System.out.println("|--|--|--|");
			System.out.print("|");
			for(int j =0 ; j<=2; j++) {
				if((i*3)+(j+1) == firstInput) {
					Board[i][j] = 'O';
				}
				System.out.print(Board[i][j]+" |");
			}
			System.out.println();
		}
		
	}
	
	public boolean winner() { //deciding the winner analysing the X's and O's
		
		return false;
	}
	
	
	public static void main(String[] args) {
		TicTacToe obj1 = new TicTacToe();
		obj1.showBoard();	
//============================================================		
		Board[0][0] = '1';
		Board[0][1] = '2';
		Board[0][2] = '3';
		Board[1][0] = '4';
		Board[1][1] = '5';
		Board[1][2] = '6';
		Board[2][0] = '7';
		Board[2][1] = '8';
		Board[2][2] = '9';
//=============================================================		
		while(obj1.winner()) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Player1 enter the cell you want to place 'X' in:");
			int input1 = scanner.nextInt();
			obj1.placeX(input1);
			
			
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Player2 enter the cell you want to place 'O' in:");
			int input2 = scanner2.nextInt();
			obj1.placeO(input2);
			
			
			scanner.close();
			scanner2.close();
		}
		
	}
	
}
