package de.pirckheimer_gymnasium.pacman.scenes;

import static de.pirckheimer_gymnasium.pacman.actors.GhostState.DOWN;
import static de.pirckheimer_gymnasium.pacman.actors.GhostState.LEFT;
import static de.pirckheimer_gymnasium.pacman.actors.GhostState.RIGHT;
import static de.pirckheimer_gymnasium.pacman.actors.GhostState.STAND;
import static de.pirckheimer_gymnasium.pacman.actors.GhostState.UP;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_B;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_BL;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_BR;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_L;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_R;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_T;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_TL;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_TR;

import java.awt.event.KeyEvent;

import de.pirckheimer_gymnasium.engine_pi.Game;
import de.pirckheimer_gymnasium.engine_pi.actor.Image;
import de.pirckheimer_gymnasium.engine_pi.event.KeyStrokeListener;
import de.pirckheimer_gymnasium.pacman.Main;
import de.pirckheimer_gymnasium.pacman.actors.Blinky;
import de.pirckheimer_gymnasium.pacman.actors.Ghost;

public class IngameScene extends BaseScene implements KeyStrokeListener
{
    Ghost ghost;

    public IngameScene()
    {
        ghost = new Blinky();
        ghost.setPosition(10, 10);
        ghost.addCollisionListener((event) -> {
            if (event.getColliding() instanceof Image)
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

    private void setBrick(Brick brick, double x, double y)
    {
        Image image = brick.getImage();
        image.setPosition(x, y);
        image.makeStatic();
        add(image);
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
    private void drawHorizontal(Brick brick, int x, int y, int length)
    {
        for (int i = 0; i < length; i++)
        {
            setBrick(brick, x + i, y);
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
    private void drawVertical(Brick brick, int x, int y, int length)
    {
        for (int i = 0; i < length; i++)
        {
            setBrick(brick, x, y + i);
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
        setBrick(SINGLE_BL, x, y);
        drawHorizontal(SINGLE_B, x + 1, y, width - 2);
        // linke untere Ecke
        setBrick(SINGLE_BR, x + width - 1, y);
        drawVertical(SINGLE_R, x + width - 1, y + 1, height - 2);
        // linke obere Ecke
        setBrick(SINGLE_TL, x, y + height - 1);
        drawHorizontal(SINGLE_T, x + 1, y + height - 1, width - 2);
        // rechte obere Ecke
        setBrick(SINGLE_TR, x + width - 1, y + height - 1);
        drawVertical(SINGLE_L, x, y + 1, height - 2);
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
        Game.debug();
        Main.start(new IngameScene(), 4);
    }
}
