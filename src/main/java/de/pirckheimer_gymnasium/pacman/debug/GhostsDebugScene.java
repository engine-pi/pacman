package de.pirckheimer_gymnasium.pacman.debug;

import de.pirckheimer_gymnasium.engine_pi.Game;
import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.engine_pi.event.FrameUpdateListener;
import de.pirckheimer_gymnasium.engine_pi.event.KeyStrokeListener;
import de.pirckheimer_gymnasium.pacman.actors.Ghost;
import de.pirckheimer_gymnasium.pacman.actors.GhostState;

import java.awt.event.KeyEvent;

public class GhostsDebugScene extends Scene implements KeyStrokeListener, FrameUpdateListener
{

    Ghost blinky;

    public GhostsDebugScene()
    {
        blinky = new Ghost("Blinky");
        add(blinky);
    }

    @Override
    public void onKeyDown(KeyEvent event)
    {
        switch (event.getKeyCode())
        {
            case KeyEvent.VK_DOWN -> blinky.setState(GhostState.DOWN);
            case KeyEvent.VK_UP -> blinky.setState(GhostState.UP);
            case KeyEvent.VK_LEFT -> blinky.setState(GhostState.LEFT);
            case KeyEvent.VK_RIGHT -> blinky.setState(GhostState.RIGHT);
        }
    }

    @Override
    public void onFrameUpdate(double pastTime)
    {
        switch (blinky.getState())
        {
            case DOWN -> blinky.moveBy(0, -0.05);
            case UP -> blinky.moveBy(0, 0.05);
            case LEFT -> blinky.moveBy(-0.05, 0);
            case RIGHT -> blinky.moveBy(0.05, 0);
        }
    }

    public static void main(String[] args)
    {
        Game.start(new GhostsDebugScene());
    }
}
