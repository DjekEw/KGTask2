import java.awt.*;
import javax.swing.*;

public class EllipseDrawer extends JPanel {
    private int x, y, width, height;
    public Color startColor, endColor;

    // Конструктор для координат верхнего левого угла
    public EllipseDrawer(int x, int y, int width, int height, Color startColor, Color endColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.startColor = startColor;
        this.endColor = endColor;
    }

    // Конструктор для центра и полуосей
    public EllipseDrawer(int centerX, int centerY, int a, int b, Color startColor, Color endColor, boolean isCenter) {
        if (isCenter) {
            this.x = centerX - a;
            this.y = centerY - b;
            this.width = 2 * a;
            this.height = 2 * b;
        }
        this.startColor = startColor;
        this.endColor = endColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Интерполяция цвета
        int steps = 100; // Шаги интерполяции
        for (int i = 0; i < steps; i++) {
            double t1 = (double) i / steps;
            double t2 = (double) (i + 1) / steps;

            // Вычисление промежуточных цветов
            Color interpolatedColor = interpolateColor(startColor, endColor, t1);

            // Уголовые координаты дуги
            double angle1 = 2 * Math.PI * t1;
            double angle2 = 2 * Math.PI * t2;

            int x1 = (int) (x + width / 2 + (width / 2) * Math.cos(angle1));
            int y1 = (int) (y + height / 2 + (height / 2) * Math.sin(angle1));
            int x2 = (int) (x + width / 2 + (width / 2) * Math.cos(angle2));
            int y2 = (int) (y + height / 2 + (height / 2) * Math.sin(angle2));

            // Установка цвета
            g2d.setColor(interpolatedColor);
            //Рисование линии
            g2d.drawLine(x1, y1, x2, y2);
        }
    }

    // Метод интерполяции
    private Color interpolateColor(Color start, Color end, double t) {
        int r = (int) (start.getRed() + t * (end.getRed() - start.getRed()));
        int g = (int) (start.getGreen() + t * (end.getGreen() - start.getGreen()));
        int b = (int) (start.getBlue() + t * (end.getBlue() - start.getBlue()));
        return new Color(r, g, b);
    }
}