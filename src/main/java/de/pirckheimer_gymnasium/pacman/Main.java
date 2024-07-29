package de.pirckheimer_gymnasium.pacman;

import de.pirckheimer_gymnasium.engine_pi.Direction;
import de.pirckheimer_gymnasium.engine_pi.Game;
import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.engine_pi.debug.DebugConfiguration;

public class Main
{
    public static void start(Scene scene, int pixelMultiplication)
    {
        DebugConfiguration.enableDebugMode = true;
        DebugConfiguration.coordinateSystemLinesEveryNMeter = 1;
        DebugConfiguration.windowPosition = Direction.RIGHT;
        scene.getCamera().setMeter(8);
        // 224 = 28 * 8
        // 288 = 36 * 8
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
