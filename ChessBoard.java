import javax.swing.*;
import java.awt.*;

public class ChessBoard extends JPanel {

    public ChessBoard() {
        setLayout(new GridLayout(8, 8));
        setPreferredSize(new Dimension(800, 800)); // Set a preferred size for the board

        Color lightBrown = new Color(222, 184, 135);
        Color darkBrown = new Color(139, 69, 19);

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel square = new JPanel();
                if ((row + col) % 2 == 0) {
                    square.setBackground(lightBrown);
                } else {
                    square.setBackground(darkBrown);
                }
                add(square);
            }
        }
    }
}
