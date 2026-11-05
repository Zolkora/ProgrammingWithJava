
package labs.lab09;

import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class Game extends Canvas {

    public static void main(String[] args) {
        new Game();
    }

    Shape[] shapes = {
        new Shape(50, 50, 30, 30, 2, 3,
                SHAPE_TYPE.Rectangle, Color.RED),
        new Shape(100, 100, 30, 30, 3, 2,
                SHAPE_TYPE.ThreeDRectangle, Color.BLUE),
        new Shape(150, 150, 30, 30, -2, 3,
                SHAPE_TYPE.RoundRectangle, Color.GREEN),
        new Shape(200, 200, 30, 30, 3, -2,
                SHAPE_TYPE.Oval, Color.MAGENTA),
        new Shape(250, 250, 30, 30, -3, -3,
                SHAPE_TYPE.Arc, Color.ORANGE)
    };

    Game() {
        JFrame frame = new JFrame();
        this.setSize(400, 400);
        Shape.setWorld(300, 300);

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
                frame.dispose();
            }
        });
    }

    public void draw() {
        for (Shape s : shapes) {
            s.move();
        }
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, Shape.worldW, Shape.worldH);

        for (Shape s : shapes) {
            g.setColor(s.getColour());

            switch (s.getShapeType()) {
                case Rectangle:
                    g.fillRect(s.x, s.y, s.w, s.h);
                    break;

                case ThreeDRectangle:
                    g.fill3DRect(s.x, s.y, s.w, s.h, true);
                    break;

                case RoundRectangle:
                    g.fillRoundRect(s.x, s.y, s.w, s.h, 10, 10);
                    break;

                case Oval:
                    g.fillOval(s.x, s.y, s.w, s.h);
                    break;

                case Arc:
                    g.fillArc(s.x, s.y, s.w, s.h, 0, 180);
                    break;
            }
        }
    }
}
