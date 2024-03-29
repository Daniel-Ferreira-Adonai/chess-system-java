package application;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import boardgame.*;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner entrada = new Scanner(System.in);
    while(true) {
        UI.printBoard(chessMatch.getPieces());
        System.out.println();
        System.out.print("Source: ");
        ChessPosition source = UI.readChessPosition(entrada);

        System.out.println();
        System.out.print("Target: ");
        ChessPosition target = UI.readChessPosition(entrada);
        ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
    }
    }

}
