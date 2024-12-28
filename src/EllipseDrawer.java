import java.awt.*;
import javax.swing.*;
public class EllipseDrawer extends JPanel {
    private int x, y, width, height;

    // Конструктор для координат верхнего левого угла
    public EllipseDrawer(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Конструктор для центра и полуосей
    public EllipseDrawer(int centerX, int centerY, int a, int b, boolean isCenter) {
        if (isCenter) {
            this.x = centerX - a;
            this.y = centerY - b;
            this.width = 2 * a;
            this.height = 2 * b;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.drawOval(x, y, width, height); // Рисование границы эллипса
    }
}
