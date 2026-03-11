/* @Deprecated
package utilities;
import board.Square;
import pieces.PieceConfig;

public class Utilities {

    public static int pieceFromFen(char c) {
        int color = Character.isUpperCase(c) ? PieceConfig.WHITE : PieceConfig.BLACK;

        switch(Character.toLowerCase(c)) {
            case 'p': return color | PieceConfig.PAWN;
            case 'n': return color | PieceConfig.KNIGHT;
            case 'b': return color | PieceConfig.BISHOP;
            case 'r': return color | PieceConfig.ROOK;
            case 'q': return color | PieceConfig.QUEEN;
            case 'k': return color | PieceConfig.KING;
        }
        return PieceConfig.NONE;
    }

    //For display purposes not for internal use
    public static String createNotation(int file, int rank) {      
        String fileString = Character.toString('a' + file);
        String rankString = Integer.toString(8 - rank);
        return fileString.concat(rankString);
    }

    private static void printSquare(Square square) {
        String color = (square.getColor() == enums.BoardColor.LIGHT) ? "L" : "D";
        String symbol = (square.getPiece() != null) ? String.valueOf(square.getPiece().getSymbol()) : ".";
        System.err.printf("%s%s:%s", color, square.getNotation(), symbol);
        System.out.print(" ");
    }

    public static void printBoard(Square[][] board) {
        for(int rank = 0; rank < 8; rank++) {
            for(int file = 0; file < 8; file++) {
                printSquare(board[rank][file]);
            }
            System.out.println("");
        }
    }
}
*/