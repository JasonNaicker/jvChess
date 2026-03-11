package board;
public class Board {

    //private Square[][] board = new Square[8][8];
    private long[] board = new long[12];
    private final String startingPosition = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";
    /* @Deprecated
    public void CreateBoard() {
        for(int rank = 0; rank < 8; rank++) {
            for(int file = 0; file < 8; file++) {
                boolean isLightSquare = (file + rank) % 2 != 0 ;
                String notation = Utilities.createNotation(file, rank);
                if(isLightSquare) {
                    board[rank][file] = new Square(enums.BoardColor.LIGHT, notation);
                } else {
                    board[rank][file] = new Square(enums.BoardColor.DARK, notation);
                }
            }
        }
        SetupPieces();
        Utilities.printBoard(board);
    }

    public void SetupPieces() {
        String startingPieces = startingPosition.split(" ")[0];

        int rank = 0;
        int file = 0;

        for(int i = 0; i < startingPieces.length(); i++) {
            char c = startingPieces.charAt(i);
            if (c == '/') {
                rank++;
                file = 0;
                continue;
            } 

            if (Character.isDigit(c)) {
                file += Character.getNumericValue(c);
                continue;
            }

            if (Character.isAlphabetic(c)) {
                Piece piece = new Piece(Utilities.pieceFromFen(c));
                board[rank][file].setPiece(piece);
                file++;
            }
        }
    }
*/
}
