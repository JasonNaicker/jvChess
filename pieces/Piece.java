package pieces;

public class Piece {
    private int piece; //Color | Piece Type

    public Piece (int piece) {this.piece = piece;}

    public Piece (int type, int color) {this.piece = color | type;}

    public int getType() {return this.piece & 0b111;}

    public int getColor() {return this.piece & 0b1000;}
    
    public boolean isBlack() {return (piece & PieceConfig.BLACK) != 0;}

    public boolean isWhite() {return !isBlack();}

    public char getSymbol() {

        char symbol = switch (getType()) {
            case PieceConfig.PAWN -> 'p';
            case PieceConfig.KNIGHT -> 'n';
            case PieceConfig.BISHOP -> 'b';
            case PieceConfig.ROOK -> 'r';
            case PieceConfig.QUEEN -> 'q';
            case PieceConfig.KING -> 'k';
            default -> '.';
        };

        if (isWhite()) {
            symbol = Character.toUpperCase(symbol);
        }

        return symbol;
    }
}
