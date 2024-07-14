package de.pirckheimer_gymnasium.pacman.scenes;

import de.pirckheimer_gymnasium.pacman.Pacman;
import de.pirckheimer_gymnasium.pacman.actors.Blinky;
import de.pirckheimer_gymnasium.pacman.actors.Clyde;
import de.pirckheimer_gymnasium.pacman.actors.Ghost;
import de.pirckheimer_gymnasium.pacman.actors.Inky;
import de.pirckheimer_gymnasium.pacman.actors.Pinky;
import de.pirckheimer_gymnasium.pacman.actors.Text;

public class TitleScene extends BaseScene
{
    public TitleScene()
    {
        int BLINKY_Y = 2;
        int PINKY_Y = 0;
        int INKY_Y = -2;
        int CLYDE_Y = -4;
        // Blinky
        addGhost(Blinky.class, BLINKY_Y);
        addText("Blinky", "red", 0, BLINKY_Y);
        // Pinky
        addGhost(Pinky.class, PINKY_Y);
        addText("Pinky", "pink", 0, PINKY_Y);
        // Inky
        addGhost(Inky.class, INKY_Y);
        addText("Inky", "cyan", 0, INKY_Y);
        // Clyde
        addGhost(Clyde.class, CLYDE_Y);
        addText("Clyde", "orange", 0, CLYDE_Y);
    }

    public void addGhost(Class<? extends Ghost> clazz, double y)
    {
        Ghost ghost = Ghost.createGhost(clazz);
        assert ghost != null;
        ghost.setPosition(-4, y);
        add(ghost);
    }

    public void addText(String content, String color, int x, int y)
    {
        Text text = new Text(content, color);
        text.setPosition(x, y + 0.25);
        add(text);
    }

    public static void main(String[] args)
    {
        Pacman.start(new TitleScene(), 3);
    }
}
