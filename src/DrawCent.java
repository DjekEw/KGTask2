import javax.swing.*;
import java.awt.*;

public class DrawCent {
    public static void drawEllipse(int centerX, int centerY, int a, int b, Color startColor, Color endColor) {
        JFrame frame = new JFrame("Ellipse Drawer (Ce)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new EllipseDrawer(centerX, centerY, a, b, startColor, endColor,true));
        frame.setVisible(true);
    }
}
