import java.awt.*;

public class MainFrame extends javax.swing.JFrame{

    public MainFrame(){
        GamePannel panel = new GamePannel();
        panel.setLocation(0, 0);
        panel.setSize(this.getSize());
        panel.setBackground(Color.CYAN);
        panel.setVisible(true);
        this.add(panel);

        addKeyListener(new KeyChecker(panel)); // add key listener to the frame
    }

}
