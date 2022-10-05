package datastructure;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TicTacToe TicTacToe = new TicTacToe();

        System.out.println("Here is the board.");

        TicTacToe.printBoard();

        int currentPlayer = X;


        do{
            System.out.println("Enter the indices for X");
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            TicTacToe.putMark(i,j);
            TicTacToe.printBoard();

            if(isWinner(currentPlayer)){
                System.out.println("The winner is " + TicTacToe.getWinner());
            }
            if(!(TicTacToe.isAvailablePositionExists()) && TicTacToe.getWinner() == EMPTY){
                System.out.println("It's a tie");
                break;
            }


            currentPlayer = O;

            System.out.println("Enter the indices for O");
            i = scanner.nextInt();
            j = scanner.nextInt();
            TicTacToe.putMark(i,j);
            TicTacToe.printBoard();


            if(isWinner(currentPlayer)){
                System.out.println("The winner is " + TicTacToe.getWinner());
            }


            currentPlayer = X;

            if(!(TicTacToe.isAvailablePositionExists()) && TicTacToe.getWinner() == EMPTY){
                System.out.println("It's a tie");
                break;
            }

        }
        while (TicTacToe.isAvailablePositionExists());




    }


    public static final int X = 1, O = -1, EMPTY = 0;
    private static int[][] board;
    private int currentPlayer;

    private final static int[][][] winnerIndices = {
            {{0,0}, {0,1}, {0,2}},
            {{1,0}, {1,1}, {1,2}},
            {{2,0}, {2,1}, {2,2}},

            {{0,0}, {1,0}, {2,0}},
            {{0,1}, {1,1}, {2,1}},
            {{0,2}, {1,2}, {2,2}},

            {{0,0}, {1,1}, {2,2}},
            {{0,2}, {1,1}, {2,0}},
    };

    public TicTacToe() {
        this.board = new int[3][3];
        this.currentPlayer = X;
    }

    public void putMark(int i, int j) throws IllegalArgumentException {
        if ((i < 0) || (i > 2) || (j < 0) || (j > 2))
            throw new IllegalArgumentException("Invalid board position");
        if (board[i][j] != EMPTY)
            throw new IllegalArgumentException("Board position occupied");

        board[i][j] = currentPlayer;
        currentPlayer = -1 * currentPlayer;
    }

    public static boolean isWinner(int player) {

        for(int[][] positions: winnerIndices){
            int sum = 0;
            for(int[] position: positions){
                sum += board[position[0]][position[1]];
            }
            if(sum == player *3)
                return true;
        }
        return false;
    }


    public int getWinner(){
        if (isWinner(X))
            return X;
        else if (isWinner(O))
            return O;
        else
            return EMPTY;
    }

    public void printBoard() {
        for(int[] line: this.board){
            for(int cell: line){
                if(cell == X){
                    System.out.print("X");
                }
                else if(cell == O){
                    System.out.print("O");
                }
                else if(cell == EMPTY){
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }


    public boolean isAvailablePositionExists(){
        for(int[] line: this.board){
            for(int cell: line){
                if(cell == 0)
                    return true;
            }
        }
        return false;
    }


}

