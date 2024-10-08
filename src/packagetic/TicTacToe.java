package packagetic;

import java.util.Scanner;

public class TicTacToe {
	 static char[][] Board = new char[3][3];
	 int emptySpace = 9;
	 
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
		for(int i =0 ; i<=2; i++) {
			System.out.println("|--|--|--|");
			System.out.print("|");
			for(int j =0 ; j<=2; j++) {
				if((i*3)+(j+1) == firstInput) {
					if(Board[i][j] == ' ') {
						Board[i][j] = 'X';
						emptySpace--;
					}
					else {
						System.out.println("Cell already taken");					
					}
					
				}
				System.out.print(Board[i][j]+" |");
			}
			System.out.println();
		}
		
	}
	
	public void placeO(int firstInput) {     //placing O on the board cell
		for(int i =0 ; i<=2; i++) {
			System.out.println("|--|--|--|");
			System.out.print("|");
			for(int j =0 ; j<=2; j++) {
				if((i*3)+(j+1) == firstInput) {
					if(Board[i][j] == ' ') {
						Board[i][j] = 'O';
						emptySpace--;
					}
					else {
						System.out.println("Cell already taken");					
					}
				}
				
				System.out.print(Board[i][j]+" |");
			}
			System.out.println();
		}
		
	}
	
	public  boolean winner() { //deciding the winner analysing the X's and O's
		int n = 2;
		for(int i = 0; i <=n ;i++) {  //checking the row
			if(Board[i][0] != ' ' && Board[i][0]==Board[i][1] && Board[i][1]==Board[i][2]  ) {
				System.out.println("Player " + Board[i][0]+" won!");
				return true;
			}
		}
		for(int j=0; j<=n ; j++) { //checking column
			if(Board[0][j] != ' ' && Board[0][j]==Board[1][j] &&  Board[1][j]==Board[2][j]  ) {
				System.out.println("Player "+Board[0][j]+" won!");
				return true;
			}	
		}
		  //checking the diagonal
		if(Board[0][0] != ' ' && Board[0][0]==Board[1][1] && Board[1][1]==Board[2][2]) {
			System.out.println("Player "+Board[1][1]+" won!");
			return true;
			}
		if(Board[0][2] != ' ' && Board[0][2]==Board[1][1] && Board[1][1]==Board[2][0]) {
			System.out.println("Player "+Board[1][1]+" won!");
			return true;
		}
		
		return false;
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TicTacToe obj1 = new TicTacToe();
		obj1.showBoard();
//============================================================		

		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        Board[i][j] = ' ';
		    }
		}
//=============================================================
		
		while(!obj1.winner() && obj1.emptySpace > 0) {
			    
	        System.out.println("Player X enter the cell you want to place 'X' in:");
	        int input1 = scanner.nextInt();
	        obj1.placeX(input1);
	        
	        if (obj1.winner()) break; // Check if Player X won after placing

	        // If there's still space left, Player O takes a turn
	        if (obj1.emptySpace > 0) {
	            System.out.println("Player O enter the cell you want to place 'O' in:");
	            int input2 = scanner.nextInt();
	            obj1.placeO(input2);
	        }
	    }

	    if (!obj1.winner()) {
	        System.out.println("It is a draw!");
	    }

	    scanner.close();
		
	}
	
}
