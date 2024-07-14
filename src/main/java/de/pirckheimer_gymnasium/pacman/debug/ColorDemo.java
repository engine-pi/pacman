package de.pirckheimer_gymnasium.pacman.debug;

import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.engine_pi.debug.ColorContainerVisualizer;
import de.pirckheimer_gymnasium.pacman.ColorManagement;
import de.pirckheimer_gymnasium.pacman.Pacman;

public class ColorDemo extends Scene
{
    public ColorDemo()
    {
        new ColorContainerVisualizer(this);
    }

    public static void main(String[] args)
    {
        Pacman.start(new ColorDemo(), 3);
    }
}
