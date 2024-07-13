package de.pirckheimer_gymnasium.pacman.debug;

import de.pirckheimer_gymnasium.engine_pi.Game;
import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.engine_pi.event.FrameUpdateListener;
import de.pirckheimer_gymnasium.engine_pi.event.KeyStrokeListener;
import de.pirckheimer_gymnasium.pacman.actors.Ghost;
import de.pirckheimer_gymnasium.pacman.actors.Blinky;
import de.pirckheimer_gymnasium.pacman.actors.Clyde;
import de.pirckheimer_gymnasium.pacman.actors.GhostState;

import java.awt.event.KeyEvent;

public class GhostsDebugScene extends Scene
        implements KeyStrokeListener, FrameUpdateListener
{
    Ghost ghost;

    public GhostsDebugScene()
    {
        getCamera().setMeter(16);
        ghost = new Clyde();
        add(ghost);
    }

    @Override
    public void onKeyDown(KeyEvent event)
    {
        switch (event.getKeyCode())
        {
        case KeyEvent.VK_DOWN -> ghost.setState(GhostState.DOWN);
        case KeyEvent.VK_UP -> ghost.setState(GhostState.UP);
        case KeyEvent.VK_LEFT -> ghost.setState(GhostState.LEFT);
        case KeyEvent.VK_RIGHT -> ghost.setState(GhostState.RIGHT);
        }
    }

    @Override
    public void onFrameUpdate(double pastTime)
    {
        switch (ghost.getState())
        {
        case DOWN -> ghost.moveBy(0, -0.05);
        case UP -> ghost.moveBy(0, 0.05);
        case LEFT -> ghost.moveBy(-0.05, 0);
        case RIGHT -> ghost.moveBy(0.05, 0);
        }
    }

    public static void main(String[] args)
    {
        Game.start(new GhostsDebugScene(), 224, 288, 3);
    }
}
