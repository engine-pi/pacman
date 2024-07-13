package de.pirckheimer_gymnasium.pacman.debug;

import de.pirckheimer_gymnasium.engine_pi.Game;
import de.pirckheimer_gymnasium.engine_pi.Scene;
import de.pirckheimer_gymnasium.engine_pi.event.FrameUpdateListener;
import de.pirckheimer_gymnasium.engine_pi.event.KeyStrokeListener;
import de.pirckheimer_gymnasium.pacman.actors.Ghost;
import de.pirckheimer_gymnasium.pacman.actors.Blinky;
import de.pirckheimer_gymnasium.pacman.actors.Clyde;
import de.pirckheimer_gymnasium.pacman.actors.Inky;
import de.pirckheimer_gymnasium.pacman.actors.Pinky;
import de.pirckheimer_gymnasium.pacman.actors.GhostState;

import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;

public class GhostsDebugScene extends Scene
        implements KeyStrokeListener, FrameUpdateListener
{
    Ghost blinky;

    Ghost clyde;

    Ghost inky;

    Ghost pinky;

    Ghost current;

    public GhostsDebugScene()
    {
        getCamera().setMeter(16);
        blinky = addGhost(Blinky.class, 2, 2);
        clyde = addGhost(Clyde.class, -2, 2);
        inky = addGhost(Inky.class, -2, -2);
        pinky = addGhost(Pinky.class, 2, -2);
        current = clyde;
    }

    private Ghost addGhost(Class<? extends Ghost> clazz, int x, int y)
    {
        Ghost ghost;
        try
        {
            ghost = clazz.getDeclaredConstructor().newInstance();
            ghost.setPosition(x, y);
            add(ghost);
            return ghost;
        }
        catch (InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void onKeyDown(KeyEvent event)
    {
        switch (event.getKeyCode())
        {
        case KeyEvent.VK_DOWN -> current.setState(GhostState.DOWN);
        case KeyEvent.VK_UP -> current.setState(GhostState.UP);
        case KeyEvent.VK_LEFT -> current.setState(GhostState.LEFT);
        case KeyEvent.VK_RIGHT -> current.setState(GhostState.RIGHT);
        }
    }

    @Override
    public void onFrameUpdate(double pastTime)
    {
        switch (current.getState())
        {
        case DOWN -> current.moveBy(0, -0.05);
        case UP -> current.moveBy(0, 0.05);
        case LEFT -> current.moveBy(-0.05, 0);
        case RIGHT -> current.moveBy(0.05, 0);
        }
    }

    public static void main(String[] args)
    {
        Game.start(new GhostsDebugScene(), 224, 288, 3);
    }
}
