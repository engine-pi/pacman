package de.pirckheimer_gymnasium.pacman.actors;

import de.pirckheimer_gymnasium.engine_pi.actor.Animation;
import de.pirckheimer_gymnasium.engine_pi.actor.StatefulAnimation;

public class Ghost extends StatefulAnimation<GhostState>
{
    private final String name;

    public Ghost(String name)
    {
        super(1, 1);
        this.name = name;

        for (GhostState state : GhostState.values())
        {
            addState(state, Animation.createFromImages(0.1, 1, 1, state.getImageLocation(name, 1), state.getImageLocation(name, 2)));
        }
    }

    public String getName()
    {
        return name;
    }
}
