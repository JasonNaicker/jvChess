package board;
import enums.BoardColor;
import pieces.Piece;
public class Square {
        private Piece piece;
        private BoardColor color;
        private String notation;

        public Square(BoardColor color, String notation) {
            this.color = color;
            this.notation = notation;
        }

        public Piece getPiece() {return this.piece;}
        
        public void setPiece(Piece piece) {this.piece = piece;}

        public BoardColor getColor() {return this.color;}

        public String getNotation() {return this.notation;}

    }