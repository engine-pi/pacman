package de.pirckheimer_gymnasium.pacman;

import de.pirckheimer_gymnasium.engine_pi.Game;
import de.pirckheimer_gymnasium.engine_pi.Scene;

public class Pacman
{
    public static void start(Scene scene, int pixelMultiplication)
    {
        ColorManagement.setColors();
        scene.getCamera().setMeter(16);
        Game.start(scene, 224, 288, pixelMultiplication);
    }

    /**
     * Start die Szene mit einer Pixelvervielfältigung von 2.
     *
     * @param scene Die Szene, die gestartet werden soll.
     */
    public static void start(Scene scene)
    {
        start(scene, 2);
    }

    public static void main(String[] args)
    {
        Game.start();
    }
}
