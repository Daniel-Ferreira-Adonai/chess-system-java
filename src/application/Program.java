package application;

import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import boardgame.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner entrada = new Scanner(System.in);
    while(true) {
        try {
            UI.clearScreen();
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(entrada);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(entrada);
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
        catch (ChessException e) {
            System.out.println(e.getMessage());
            entrada.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            entrada.nextLine();
        }
    }
    }

}
