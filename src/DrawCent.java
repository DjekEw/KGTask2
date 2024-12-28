import javax.swing.*;

public class DrawCent {
    public static void drawEllipse(int centerX, int centerY, int a, int b) {
        JFrame frame = new JFrame("Ellipse Drawer (Ce)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new EllipseDrawer(centerX, centerY, a, b, true));
        frame.setVisible(true);
    }
}
