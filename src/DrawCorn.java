import javax.swing.*;
import java.awt.*;

public class DrawCorn {
    public static void drawEllipse(int x, int y, int width, int height, Color startColor, Color endColor) {
        JFrame frame = new JFrame("Ellipse Drawer (Co)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new EllipseDrawer(x, y, width, height, startColor, endColor));
        frame.setVisible(true);
    }
}
