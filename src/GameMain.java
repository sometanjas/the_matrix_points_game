import javax.swing.*;

public class GameMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("The Matrix Points Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new GamePanel();
        frame.getContentPane().add(panel);

        frame.setSize(1000,500);
        //frame.pack();
        frame.setVisible(true);
    }
}