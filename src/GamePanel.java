import javax.swing.*;
import java.awt.*;
import java.awt.Point;
import java.awt.event.*;
import java.util.ArrayList;

public class GamePanel extends JPanel {

    private Color background = new Color(0, 0, 0);
    private Point p = null;

    private int pointsNo = 0;
    private JLabel showCount = new JLabel("Points");
    private ArrayList<Point> points = new ArrayList<>();

    public GamePanel() {
        showCount.setForeground(Color.GREEN);
        add(showCount);
        setBackground(background);
        JButton button = new JButton("Reset"); // Text auf dem Button
        add(button);
        ActionListener l = new ButtonListener(); // unser ButtonListener - wir implementieren
        button.addActionListener(l);

        MyMouseListener mml = new MyMouseListener();
        addMouseListener(mml);
        addMouseMotionListener(mml);

    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            points.clear();
            repaint();
            showCount.setText("Count: " + points.size());
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // mark the point p with a small red circle
        g.setColor(Color.GREEN);
        for (Point p : points) {
            if (p != null) {
                g.fillOval(p.x, p.y, 10, 10);
            }
        }

    }

    private class MyMouseListener implements MouseListener,
            MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mousePressed(MouseEvent e) {
            p = e.getPoint();
            System.out.println("Mouse pressed at point " + p);
            points.add(p);
            pointsNo = points.size();
            showCount.setText("Count: " + pointsNo);
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseDragged(MouseEvent e) {
            // TODO Auto-generated method stub
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // TODO Auto-generated method stub

        }
    }
}
