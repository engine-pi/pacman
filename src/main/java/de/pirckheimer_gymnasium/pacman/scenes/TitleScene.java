package de.pirckheimer_gymnasium.pacman.scenes;

import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.engine_pi.actor.ImageFont;
import de.pirckheimer_gymnasium.engine_pi.actor.ImageFontText;
import de.pirckheimer_gymnasium.pacman.Font;
import de.pirckheimer_gymnasium.pacman.Pacman;
import de.pirckheimer_gymnasium.pacman.actors.Blinky;

public class TitleScene extends Scene
{
    ImageFont font;

    public TitleScene()
    {
        font = Font.getFont();
        setBackgroundColor("gray");
        ImageFontText text = new ImageFontText(font, "Blinky");
        text.setImageSize(32);
        text.setPosition(0, 2);
        add(text);
        add(new Blinky());
    }

    public static void main(String[] args)
    {
        Pacman.start(new TitleScene(), 1);
    }
}
