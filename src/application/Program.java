package application;

import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import boardgame.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner entrada = new Scanner(System.in);
        List<ChessPiece> captured =  new ArrayList<>();
        while (!chessMatch.getCheckMate()) {
        try {
            UI.clearScreen();
            UI.printMatch(chessMatch, captured);
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(entrada);

            boolean[][] possibleMoves = chessMatch.possibleMoves(source);
            UI.clearScreen();
            UI.printBoard(chessMatch.getPieces(),possibleMoves);


            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(entrada);
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            if (capturedPiece != null) {
                captured.add(capturedPiece);
            }

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
        UI.clearScreen();
        UI.printMatch(chessMatch,captured);
    }

}
