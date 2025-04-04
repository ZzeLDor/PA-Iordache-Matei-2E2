import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();
    }
}

class Window extends JFrame {
    private java.util.List<Point> redDots = new java.util.ArrayList<>();
    private java.util.List<Point> blueDots = new java.util.ArrayList<>();
    public Window() {
        super("Bideo Game");

        generateDots();

        JButton newGame = new JButton("New Game");
        newGame.setPreferredSize(new Dimension(200, 50));
        newGame.setVerticalAlignment(SwingConstants.CENTER);
        newGame.setHorizontalAlignment(SwingConstants.LEFT);

        JLabel nrDots = new JLabel("Number of Dots:");
        nrDots.setVerticalAlignment(SwingConstants.CENTER);
        nrDots.setHorizontalAlignment(SwingConstants.RIGHT);

        JTextField nrDotsField = new JTextField(5);
        nrDotsField.setPreferredSize(new Dimension(40, 40));
        nrDotsField.setHorizontalAlignment(SwingConstants.CENTER);
        nrDotsField.setText("5");

        JButton saveGame = new JButton("Save");
        saveGame.setPreferredSize(new Dimension(200, 50));
        saveGame.setVerticalAlignment(SwingConstants.CENTER);
        saveGame.setHorizontalAlignment(SwingConstants.LEFT);

        JButton loadGame = new JButton("Load");
        loadGame.setPreferredSize(new Dimension(200, 50));
        loadGame.setVerticalAlignment(SwingConstants.CENTER);
        loadGame.setHorizontalAlignment(SwingConstants.CENTER);

        JButton exitGame = new JButton("Exit");
        exitGame.setPreferredSize(new Dimension(200, 50));
        exitGame.setVerticalAlignment(SwingConstants.CENTER);
        exitGame.setHorizontalAlignment(SwingConstants.RIGHT);


        JPanel config = new JPanel();
        config.setBackground(new Color(187, 212, 76));
        config.setPreferredSize(new Dimension(800, 100));
//        config.setLayout(new BorderLayout());
        config.add(nrDots, BorderLayout.WEST);
        config.add(nrDotsField, BorderLayout.WEST);
        config.add(newGame, BorderLayout.EAST);

        JPanel content = new JPanel()
        {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                for (Point p : redDots) {
                    g.fillOval(p.x, p.y, 10, 10);
                }
                g.setColor(Color.BLUE);
                for (Point p : blueDots) {
                    g.fillOval(p.x, p.y, 10, 10);
                }
            }
        };
        content.setBackground(new Color(254, 250, 224));
        content.setPreferredSize(new Dimension(800, 400));
        content.setLayout(new BorderLayout());

        JPanel control = new JPanel();
        control.setBackground(new Color(212, 144, 76));
        control.setPreferredSize(new Dimension(800, 100));
        control.setLayout(new BorderLayout());
        control.add(saveGame, BorderLayout.WEST);
        control.add(loadGame, BorderLayout.CENTER);
        control.add(exitGame, BorderLayout.EAST);



        setTitle("Lab 6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600);
        getContentPane().setBackground(new Color(254, 250, 224));
        add(config, BorderLayout.NORTH);
        add(control, BorderLayout.SOUTH);
        add(content, BorderLayout.CENTER);


        setVisible(true);
    }
    private void generateDots() {
        int count = 5;
        redDots.clear();
        blueDots.clear();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            redDots.add(new Point(random.nextInt(700), random.nextInt(350)));
            blueDots.add(new Point(random.nextInt(700), random.nextInt(350)));
        }
    }
}