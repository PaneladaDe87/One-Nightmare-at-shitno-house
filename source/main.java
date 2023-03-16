import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame {
    
    private ImageIcon[] animationFrames;
    private JLabel animationLabel;
    private Timer animationTimer;
    private int currentFrame;

    public Main() {
        super("Animation Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Carregar os frames da animação
        animationFrames = new ImageIcon[21];
        for (int i = 0; i < animationFrames.length; i++) {
            animationFrames[i] = new ImageIcon("path/to/frame_" + i + ".png");
        }

        // Configurar o label que exibirá a animação
        animationLabel = new JLabel(animationFrames[0]);
        getContentPane().add(animationLabel);

        // Configurar o timer que atualiza a animação
        animationTimer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % animationFrames.length;
                animationLabel.setIcon(animationFrames[currentFrame]);
            }
        });
    }

    public void startAnimation() {
        animationTimer.start();
    }

    public void stopAnimation() {
        animationTimer.stop();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setSize(200, 200);
        main.setVisible(true);
        main.startAnimation();
    }
}
