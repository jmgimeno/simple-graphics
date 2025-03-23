package main;

import com.codeforall.online.simplegraphics.graphics.Canvas;
import com.codeforall.online.simplegraphics.graphics.Color;
import com.codeforall.online.simplegraphics.graphics.Ellipse;
import com.codeforall.online.simplegraphics.graphics.Rectangle;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Canvas.setMaxX(800);
        Canvas.setMaxY(600);
        Rectangle box = new Rectangle(5, 10, 60, 80);
        box.draw();
        Ellipse egg = new Ellipse(100, 100, 40, 60);
        egg.setColor(Color.YELLOW);
        egg.fill();
        for (int i = 0; i < 30; i++) {
            Thread.sleep(100);
            box.translate(10, 0);
        }
        Thread.sleep(1000);
        Canvas.setMaxX(300);
        Canvas.setMaxY(200);
        Canvas.getInstance().repaint();
    }
}
