package de.pirckheimer_gymnasium.pacman;

import de.pirckheimer_gymnasium.engine_pi.actor.ImageFont;
import de.pirckheimer_gymnasium.engine_pi.actor.ImageFontCaseSensitivity;

public class Font
{
    public static ImageFont getFont()
    {
        return new ImageFont("images/glyphs",
                ImageFontCaseSensitivity.TO_UPPER);
    }
}
