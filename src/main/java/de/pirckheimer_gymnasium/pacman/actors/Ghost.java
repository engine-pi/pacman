package de.pirckheimer_gymnasium.pacman.actors;

import java.awt.Color;
import java.awt.image.BufferedImage;

import de.pirckheimer_gymnasium.engine_pi.Resources;
import de.pirckheimer_gymnasium.engine_pi.actor.StatefulImagesAnimation;
import de.pirckheimer_gymnasium.engine_pi.util.ImageUtil;

public abstract class Ghost extends StatefulImagesAnimation<GhostState>
{
    private final String name;

    private final Color color;

    private final Color fromColor = new Color(255, 0, 0);

    public Ghost(String name, Color color)
    {
        super(1, 1, 0.1);
        this.name = name;
        this.color = color;
        for (GhostState state : GhostState.values())
        {
            addGhostState(state);
        }
    }

    private void addGhostState(GhostState state)
    {
        if (state == GhostState.STAND)
        {
            addState(state, getImage(state, 1));
        }
        else
        {
            addState(state, getImage(state, 1), getImage(state, 2));
        }
    }

    public BufferedImage getImage(GhostState state, int no)
    {
        String realPath = state.getImagePath(no);
        String virtualPath = realPath + "__" + name;
        if (Resources.IMAGES.contains(virtualPath))
        {
            return Resources.IMAGES.get(virtualPath);
        }
        return ImageUtil.replaceColor(Resources.IMAGES.get(realPath), fromColor,
                color);
    }

    public String getName()
    {
        return name;
    }
}
