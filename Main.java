import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        frame.setTitle("Chess");
        frame.add(new ChessBoard());
        frame.setMinimumSize(new Dimension(820,820));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // f
    }
}