import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        MainFrame frame = new MainFrame();

        frame.setSize(1280, 720); // frame size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //center frame
        frame.setLocation((int)(screenSize.getWidth()/2 - frame.getWidth()/2),
                (int)(screenSize.getHeight()/2 - frame.getHeight()/2));

        frame.setResizable(false);
        frame.setTitle("test");
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close program when frame is closed
    }
}
