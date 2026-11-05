package labs.lab09;
    import java.awt.*;
    import java.awt.event.*;
    import java.util.*;
    import java.util.Timer;
    import javax.swing.*;
    
    public class Game extends Canvas {

        public static void main(String[] args) {
            new Game();
        }
    // create an array of 3 balls
    Ball[] balls = {new Ball(50,50,20,20), new Ball(100,100,20,20), new Ball(150,150,20,20)};
    // call this array balls
    Game() {
    JFrame frame = new JFrame();
    this.setSize(400, 400);
    Ball.setWorld(300, 300);
    
    frame.add(this);
    frame.pack();
    frame.setVisible(true);
    Timer t = new Timer();
    TimerTask tt = new TimerTask() {
    @Override
    public void run() {
    draw();
    }
    };
    t.schedule(tt, 0, 50);
    frame.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
    t.cancel();
    tt.cancel();
    }
    });
    }
    public void draw() {
    // call the move() method of each balls
    // Tip: use an enhanced for loop to pick
    // each ball in the balls array.
    for (Ball b : balls) {b.move();}
    this.repaint();
    }
    public void paint(Graphics g) {
    g.drawRect(0, 0, Ball.worldW, Ball.worldH);
    // move and draw each ball in balls array
    // Tip: use an enhanced for loop to pick
    // each ball in the balls array.
    for (Ball b : balls) {g.fillOval(b.x, b.y, b.w, b.h);}
    }
    }