import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class GamePannel extends javax.swing.JPanel implements ActionListener {

    Player player;

    ArrayList<Wall> walls = new ArrayList<>();

    Timer gameTimer;

    public GamePannel(){

        player = new Player(400, 300, this);

        makeWalls();

        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                player.set();
                repaint();

            }
        }, 0, 17);
    }

    private void makeWalls() {
        for(int i = 50; i<1250; i+=50){
            walls.add(new Wall(i, 500, 50, 50));
        }
        walls.add(new Wall(50, 450, 50, 50));
        walls.add(new Wall(50, 400, 50, 50));
        walls.add(new Wall(50, 350, 50, 50));

        walls.add(new Wall(500, 450, 50, 50));
        walls.add(new Wall(600, 400, 50, 100));
        walls.add(new Wall(700, 350, 50, 150));
        walls.add(new Wall(800, 400, 50, 100));
        walls.add(new Wall(900, 450, 50, 50));
    }

    public void paint(Graphics g){
        super.paint(g);

        Graphics2D gtd = (Graphics2D) g;

        player.draw(gtd);

        for(Wall wall: walls){
            wall.draw(gtd);
        }
    }



    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT) player.keyLeft=true;
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) player.keyRight=true;
        if(e.getKeyCode() == KeyEvent.VK_UP) player.keyUp=true;
        if(e.getKeyCode() == KeyEvent.VK_DOWN) player.keyDown=true;
    }

    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT) player.keyLeft=false;
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) player.keyRight=false;
        if(e.getKeyCode() == KeyEvent.VK_UP) player.keyUp=false;
        if(e.getKeyCode() == KeyEvent.VK_DOWN) player.keyDown=false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
