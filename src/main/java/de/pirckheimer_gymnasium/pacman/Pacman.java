package de.pirckheimer_gymnasium.pacman;

import de.pirckheimer_gymnasium.engine_pi.Game;
import de.pirckheimer_gymnasium.engine_pi.Resources;
import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.engine_pi.resources.ColorContainer;

public class Pacman
{
    static
    {
        System.out.println("static");
        ColorContainer container = Resources.COLORS;
        container.clear();
        // AllAssetsPalettes.png
        container.add("Black", 0, 0, 0, "schwarz");
        container.add("Red", 255, 0, 0, "rot");
        container.add("Brown", 222, 151, 81, "braun");
        container.add("Pink", 255, 183, 255, "rosa");
        container.add("Cyan", 0, 255, 255, "blaugrün");
        container.add("Blue", 71, 183, 255, "blau");
        container.add("Orange", 255, 183, 81, "orange");
        container.add("Yellow", 255, 255, 0, "gelb");
        container.add("Indigo", 33, 33, 255, "indigo");
        container.add("Green", 0, 255, 255, "grün");
        container.add("Teal", 71, 183, 174, "türkis");
        container.add("Salmon", 255, 183, 174, "lachsfarben");
        container.add("White", 222, 222, 255, "weiß");
    }

    public static void start(Scene scene, int pixelMultiplication)
    {
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
