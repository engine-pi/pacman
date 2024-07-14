package de.pirckheimer_gymnasium.pacman.debug;

import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.engine_pi.actor.ImageFont;
import de.pirckheimer_gymnasium.engine_pi.actor.ImageFontText;

import de.pirckheimer_gymnasium.pacman.Font;
import de.pirckheimer_gymnasium.pacman.Pacman;

public class FontDebugScene extends Scene
{
    public FontDebugScene()
    {
        getCamera().setMeter(16);
        ImageFont font = Font.getFont();
        setBackgroundColor("gray");
        ImageFontText text = new ImageFontText(font, "Blinky");
        add(text);
    }

    public static void main(String[] args)
    {
        Pacman.start(new FontDebugScene(), 3);
    }
}
