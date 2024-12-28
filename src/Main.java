import java.awt.*;

public class Main {
    public static void main(String[] args) {
                // Рисование по верхнему левому углу
                DrawCorn.drawEllipse(50, 50, 200, 100, Color.RED, Color.BLUE);

                // Рисование по центру и полуосям
                DrawCent.drawEllipse(200, 200, 100, 50, Color.BLUE, Color.GREEN);
            }
}