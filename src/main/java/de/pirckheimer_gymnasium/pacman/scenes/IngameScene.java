package de.pirckheimer_gymnasium.pacman.scenes;

import de.pirckheimer_gymnasium.engine_pi.actor.Image;
import de.pirckheimer_gymnasium.engine_pi.event.KeyStrokeListener;
import de.pirckheimer_gymnasium.pacman.Main;
import de.pirckheimer_gymnasium.pacman.actors.Blinky;
import de.pirckheimer_gymnasium.pacman.actors.Ghost;

import java.awt.event.KeyEvent;

import static de.pirckheimer_gymnasium.pacman.actors.GhostState.*;

class Wall extends Image
{
    public Wall(String filename)
    {
        super("images/maze/" + filename + ".png", 8);
    }
}

public class IngameScene extends BaseScene implements KeyStrokeListener
{
    Ghost ghost;

    public IngameScene()
    {
        ghost = new Blinky();
        ghost.setPosition(10, 10);
        ghost.addCollisionListener((event) -> {
            if (event.getColliding() instanceof Wall)
            {
                ghost.reverse();
                System.out.println(event);
            }
        });
        add(ghost);
        // abgerundete Rechtecke, Querformat
        // von links nach rechts
        drawRoundedRectangle(2, 26, 4, 3);
        drawRoundedRectangle(7, 26, 5, 3);
        drawRoundedRectangle(16, 26, 5, 3);
        drawRoundedRectangle(22, 26, 4, 3);
        // abgerundete Rechtecke, Querformat
        // von links nach rechts
        drawRoundedRectangle(2, 23, 4, 2);
        drawRoundedRectangle(22, 23, 4, 2);
        // abgerundete Rechtecke, Hochformat
        // von links nach rechts
        drawRoundedRectangle(7, 12, 2, 5);
        drawRoundedRectangle(19, 12, 2, 5);
        // abgerundete Rechtecke, Querformat
        // von links nach rechts
        drawRoundedRectangle(7, 8, 5, 2);
        drawRoundedRectangle(16, 8, 5, 2);
    }

    private void draw(String fileName, double x, double y)
    {
        Wall wall = new Wall(fileName);
        wall.setPosition(x, y);
        wall.makeStatic();
        add(wall);
    }

    /**
     * Zeichne horizontal von links nach rechts.
     *
     * @param filename Der Dateiname ohne Dateierweiterung des gewünschten
     *                 Bildes.
     * @param x        Die x-Koordinate der linken Ecke.
     * @param y        Die y-Koordinate der linken Ecke.
     * @param length   Die Länge der Linie.
     */
    private void drawHorizontal(String filename, int x, int y, int length)
    {
        for (int i = 0; i < length; i++)
        {
            draw(filename, x + i, y);
        }
    }

    /**
     * Zeichne vertikal von unten nach oben.
     *
     * @param filename Der Dateiname ohne Dateierweiterung des gewünschten
     *                 Bildes.
     * @param x        Die x-Koordinate der unteren Ecke.
     * @param y        Die y-Koordinate der unteren Ecke.
     * @param length   Die Länge der Linie.
     */
    private void drawVertical(String filename, int x, int y, int length)
    {
        for (int i = 0; i < length; i++)
        {
            draw(filename, x, y + i);
        }
    }

    private void drawRoundedRectangle(int x, int y, int width, int height)
    {
        if (width < 2 || height < 2)
        {
            throw new RuntimeException(
                    "width und height muss mindestens 2 sein.");
        }
        // linke untere Ecke
        draw("single_TR", x, y);
        drawHorizontal("single_T", x + 1, y, width - 2);
        // linke untere Ecke
        draw("single_TL", x + width - 1, y);
        drawVertical("single_L", x + width - 1, y + 1, height - 2);
        // linke obere Ecke
        draw("single_BR", x, y + height - 1);
        drawHorizontal("single_B", x + 1, y + height - 1, width - 2);
        // rechte obere Ecke
        draw("single_BL", x + width - 1, y + height - 1);
        drawVertical("single_R", x, y + 1, height - 2);
    }

    @Override
    public void onKeyDown(KeyEvent event)
    {
        switch (event.getKeyCode())
        {
        case KeyEvent.VK_SPACE -> ghost.setState(STAND);
        case KeyEvent.VK_DOWN -> ghost.setState(DOWN);
        case KeyEvent.VK_UP -> ghost.setState(UP);
        case KeyEvent.VK_LEFT -> ghost.setState(LEFT);
        case KeyEvent.VK_RIGHT -> ghost.setState(RIGHT);
        }
    }

    public static void main(String[] args)
    {
        Main.start(new IngameScene(), 4);
    }
}
