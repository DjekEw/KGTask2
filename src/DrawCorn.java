import javax.swing.*;

public class DrawCorn {
    public static void drawEllipse(int x, int y, int width, int height) {
        JFrame frame = new JFrame("Ellipse Drawer (Co)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new EllipseDrawer(x, y, width, height));
        frame.setVisible(true);
    }
}
