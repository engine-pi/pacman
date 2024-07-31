package de.pirckheimer_gymnasium.pacman.scenes;

import static de.pirckheimer_gymnasium.pacman.actors.GhostState.DOWN;
import static de.pirckheimer_gymnasium.pacman.actors.GhostState.LEFT;
import static de.pirckheimer_gymnasium.pacman.actors.GhostState.RIGHT;
import static de.pirckheimer_gymnasium.pacman.actors.GhostState.STAND;
import static de.pirckheimer_gymnasium.pacman.actors.GhostState.UP;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_B;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.OUTER_CORNER_BL;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.OUTER_CORNER_BR;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_L;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_R;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.SINGLE_T;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.OUTER_CORNER_TL;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.OUTER_CORNER_TR;
import static de.pirckheimer_gymnasium.pacman.scenes.Brick.*;

import java.awt.event.KeyEvent;

import de.pirckheimer_gymnasium.engine_pi.Game;
import de.pirckheimer_gymnasium.engine_pi.actor.Image;
import de.pirckheimer_gymnasium.engine_pi.event.KeyStrokeListener;
import de.pirckheimer_gymnasium.pacman.Main;
import de.pirckheimer_gymnasium.pacman.actors.Blinky;
import de.pirckheimer_gymnasium.pacman.actors.Ghost;

public class IngameScene extends BaseScene implements KeyStrokeListener
{
    Ghost ghost;

    Image screenshot;

    public IngameScene()
    {
        ghost = new Blinky();
        ghost.setPosition(10, 10);
        ghost.addCollisionListener((event) -> {
            if (event.getColliding() instanceof Image)
            {
                ghost.reverse();
                System.out.println(event);
            }
        });
        // add(ghost);
        setRow(32, DOUBLE_CORNER_TL, // 0
                DOUBLE_T, // 1
                DOUBLE_T, // 2
                DOUBLE_T, // 3
                DOUBLE_T, // 4
                DOUBLE_T, // 5
                DOUBLE_T, // 6
                DOUBLE_T, // 7
                DOUBLE_T, // 8
                DOUBLE_T, // 9
                DOUBLE_T, // 10
                DOUBLE_T, // 11
                DOUBLE_T, // 12
                INNER_CORNER_BL_BORDER_T, // 13
                INNER_CORNER_BR_BORDER_T, // 14
                DOUBLE_T, // 15
                DOUBLE_T, // 16
                DOUBLE_T, // 17
                DOUBLE_T, // 18
                DOUBLE_T, // 19
                DOUBLE_T, // 20
                DOUBLE_T, // 21
                DOUBLE_T, // 22
                DOUBLE_T, // 23
                DOUBLE_T, // 24
                DOUBLE_T, // 25
                DOUBLE_T, // 26
                DOUBLE_CORNER_TR // 27
        );
        setRow(31, DOUBLE_L, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                SINGLE_L, // 13
                SINGLE_R, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(30, DOUBLE_L, // 0
                null, // 1
                OUTER_CORNER_TL, // 2
                SINGLE_T, // 3
                SINGLE_T, // 4
                OUTER_CORNER_TR, // 5
                null, // 6
                OUTER_CORNER_TL, // 7
                SINGLE_T, // 8
                SINGLE_T, // 9
                SINGLE_T, // 10
                OUTER_CORNER_TR, // 11
                null, // 12
                SINGLE_L, // 13
                SINGLE_R, // 14
                null, // 15
                OUTER_CORNER_TL, // 16
                SINGLE_T, // 17
                SINGLE_T, // 18
                SINGLE_T, // 19
                OUTER_CORNER_TR, // 20
                null, // 21
                OUTER_CORNER_TL, // 22
                SINGLE_T, // 23
                SINGLE_T, // 24
                OUTER_CORNER_TR, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(29, DOUBLE_L, // 0
                null, // 1
                SINGLE_L, // 2
                null, // 3
                null, // 4
                SINGLE_R, // 5
                null, // 6
                SINGLE_L, // 7
                null, // 8
                null, // 9
                null, // 10
                SINGLE_R, // 11
                null, // 12
                SINGLE_L, // 13
                SINGLE_R, // 14
                null, // 15
                SINGLE_L, // 16
                null, // 17
                null, // 18
                null, // 19
                SINGLE_R, // 20
                null, // 21
                SINGLE_L, // 22
                null, // 23
                null, // 24
                SINGLE_R, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(28, DOUBLE_L, // 0
                null, // 1
                OUTER_CORNER_BL, // 2
                SINGLE_B, // 3
                SINGLE_B, // 4
                OUTER_CORNER_BR, // 5
                null, // 6
                OUTER_CORNER_BL, // 7
                SINGLE_B, // 8
                SINGLE_B, // 9
                SINGLE_B, // 10
                OUTER_CORNER_BR, // 11
                null, // 12
                OUTER_CORNER_BL, // 13
                OUTER_CORNER_BR, // 14
                null, // 15
                OUTER_CORNER_BL, // 16
                SINGLE_B, // 17
                SINGLE_B, // 18
                SINGLE_B, // 19
                OUTER_CORNER_BR, // 20
                null, // 21
                OUTER_CORNER_BL, // 22
                SINGLE_B, // 23
                SINGLE_B, // 24
                OUTER_CORNER_BR, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(27, DOUBLE_L, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(26, DOUBLE_L, // 0
                null, // 1
                OUTER_CORNER_TL, // 2
                SINGLE_T, // 3
                SINGLE_T, // 4
                OUTER_CORNER_TR, // 5
                null, // 6
                OUTER_CORNER_TL, // 7
                OUTER_CORNER_TR, // 8
                null, // 9
                OUTER_CORNER_TL, // 10
                SINGLE_T, // 11
                SINGLE_T, // 12
                SINGLE_T, // 13
                SINGLE_T, // 14
                SINGLE_T, // 15
                SINGLE_T, // 16
                OUTER_CORNER_TR, // 17
                null, // 18
                OUTER_CORNER_TL, // 19
                OUTER_CORNER_TR, // 20
                null, // 21
                OUTER_CORNER_TL, // 22
                SINGLE_T, // 23
                SINGLE_T, // 24
                OUTER_CORNER_TR, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(25, DOUBLE_L, // 0
                null, // 1
                OUTER_CORNER_BL, // 2
                SINGLE_B, // 3
                SINGLE_B, // 4
                OUTER_CORNER_BR, // 5
                null, // 6
                SINGLE_L, // 7
                SINGLE_R, // 8
                null, // 9
                OUTER_CORNER_BL, // 10
                SINGLE_B, // 11
                SINGLE_B, // 12
                INNER_CORNER_BL, // 13
                INNER_CORNER_BR, // 14
                SINGLE_B, // 15
                SINGLE_B, // 16
                OUTER_CORNER_BR, // 17
                null, // 18
                SINGLE_L, // 19
                SINGLE_R, // 20
                null, // 21
                OUTER_CORNER_BL, // 22
                SINGLE_B, // 23
                SINGLE_B, // 24
                OUTER_CORNER_BR, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(24, DOUBLE_L, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                SINGLE_L, // 7
                SINGLE_R, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                SINGLE_L, // 13
                SINGLE_R, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                SINGLE_L, // 19
                SINGLE_R, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(23, DOUBLE_CORNER_BL, // 0
                DOUBLE_B, // 1
                DOUBLE_B, // 2
                DOUBLE_B, // 3
                DOUBLE_B, // 4
                null, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                null, // 22
                DOUBLE_B, // 23
                DOUBLE_B, // 24
                DOUBLE_B, // 25
                DOUBLE_B, // 26
                DOUBLE_CORNER_BR // 27
        );
        setRow(22, null, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                null // 27
        );
        setRow(21, null, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                DOUBLE_L, // 5
                null, // 6
                SINGLE_L, // 7
                SINGLE_R, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                SINGLE_L, // 19
                SINGLE_R, // 20
                null, // 21
                DOUBLE_R, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                null // 27
        );
        setRow(20, null, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                null // 27
        );
        setRow(19, null, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                null // 27
        );
        setRow(18, null, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                null // 27
        );
        setRow(17, null, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                null // 27
        );
        setRow(16, null, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                DOUBLE_L, // 5
                null, // 6
                SINGLE_L, // 7
                SINGLE_R, // 8
                null, // 9
                CORNER_BL, // 10
                DOUBLE_T, // 11
                DOUBLE_T, // 12
                DOUBLE_T, // 13
                DOUBLE_T, // 14
                DOUBLE_T, // 15
                DOUBLE_T, // 16
                CORNER_BR, // 17
                null, // 18
                SINGLE_L, // 19
                SINGLE_R, // 20
                null, // 21
                DOUBLE_R, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                null // 27
        );
        setRow(15, null, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                DOUBLE_L, // 5
                null, // 6
                SINGLE_L, // 7
                SINGLE_R, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                SINGLE_L, // 19
                SINGLE_R, // 20
                null, // 21
                DOUBLE_R, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                null // 27
        );
        setRow(14, null, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                DOUBLE_L, // 5
                null, // 6
                SINGLE_L, // 7
                SINGLE_R, // 8
                null, // 9
                OUTER_CORNER_TL, // 10
                SINGLE_T, // 11
                SINGLE_T, // 12
                SINGLE_T, // 13
                SINGLE_T, // 14
                SINGLE_T, // 15
                SINGLE_T, // 16
                OUTER_CORNER_TR, // 17
                null, // 18
                SINGLE_L, // 19
                SINGLE_R, // 20
                null, // 21
                DOUBLE_R, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                null // 27
        );
        setRow(13, DOUBLE_CORNER_TL, // 0
                DOUBLE_T, // 1
                DOUBLE_T, // 2
                DOUBLE_T, // 3
                DOUBLE_T, // 4
                OUTER_CORNER_BR, // 5
                null, // 6
                OUTER_CORNER_BL, // 7
                OUTER_CORNER_BR, // 8
                null, // 9
                OUTER_CORNER_BL, // 10
                SINGLE_B, // 11
                SINGLE_B, // 12
                INNER_CORNER_BL, // 13
                INNER_CORNER_BR, // 14
                SINGLE_B, // 15
                SINGLE_B, // 16
                OUTER_CORNER_BR, // 17
                null, // 18
                OUTER_CORNER_BL, // 19
                OUTER_CORNER_BR, // 20
                null, // 21
                OUTER_CORNER_BL, // 22
                DOUBLE_T, // 23
                DOUBLE_T, // 24
                DOUBLE_T, // 25
                DOUBLE_T, // 26
                DOUBLE_CORNER_TR // 27
        );
        setRow(12, DOUBLE_L, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                SINGLE_L, // 13
                SINGLE_R, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(11, DOUBLE_L, // 0
                null, // 1
                OUTER_CORNER_TL, // 2
                SINGLE_T, // 3
                SINGLE_T, // 4
                OUTER_CORNER_TR, // 5
                null, // 6
                OUTER_CORNER_TL, // 7
                SINGLE_T, // 8
                SINGLE_T, // 9
                SINGLE_T, // 10
                OUTER_CORNER_TR, // 11
                null, // 12
                SINGLE_L, // 13
                SINGLE_R, // 14
                null, // 15
                OUTER_CORNER_TL, // 16
                SINGLE_T, // 17
                SINGLE_T, // 18
                SINGLE_T, // 19
                OUTER_CORNER_TR, // 20
                null, // 21
                OUTER_CORNER_TL, // 22
                SINGLE_T, // 23
                SINGLE_T, // 24
                OUTER_CORNER_TR, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(10, DOUBLE_L, // 0
                null, // 1
                OUTER_CORNER_BL, // 2
                SINGLE_B, // 3
                INNER_CORNER_BL, // 4
                SINGLE_R, // 5
                null, // 6
                OUTER_CORNER_BL, // 7
                SINGLE_B, // 8
                SINGLE_B, // 9
                SINGLE_B, // 10
                OUTER_CORNER_BR, // 11
                null, // 12
                OUTER_CORNER_BL, // 13
                OUTER_CORNER_BR, // 14
                null, // 15
                OUTER_CORNER_BL, // 16
                SINGLE_B, // 17
                SINGLE_B, // 18
                SINGLE_B, // 19
                OUTER_CORNER_BR, // 20
                null, // 21
                SINGLE_L, // 22
                INNER_CORNER_BR, // 23
                SINGLE_B, // 24
                OUTER_CORNER_BR, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(9, DOUBLE_L, // 0
                null, // 1
                null, // 2
                null, // 3
                SINGLE_L, // 4
                SINGLE_R, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                SINGLE_L, // 22
                SINGLE_R, // 23
                null, // 24
                null, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(8, INNER_CORNER_TR_BORDER_L, // 0
                SINGLE_T, // 1
                OUTER_CORNER_TR, // 2
                null, // 3
                SINGLE_L, // 4
                SINGLE_R, // 5
                null, // 6
                OUTER_CORNER_TL, // 7
                OUTER_CORNER_TR, // 8
                null, // 9
                OUTER_CORNER_TL, // 10
                SINGLE_T, // 11
                SINGLE_T, // 12
                SINGLE_T, // 13
                SINGLE_T, // 14
                SINGLE_T, // 15
                SINGLE_T, // 16
                OUTER_CORNER_TR, // 17
                null, // 18
                OUTER_CORNER_TL, // 19
                OUTER_CORNER_TR, // 20
                null, // 21
                SINGLE_L, // 22
                SINGLE_R, // 23
                null, // 24
                OUTER_CORNER_TL, // 25
                SINGLE_T, // 26
                INNER_CORNER_TL_BORDER_R // 27
        );
        setRow(7, INNER_CORNER_BR_BORDER_L, // 0
                SINGLE_B, // 1
                OUTER_CORNER_BR, // 2
                null, // 3
                OUTER_CORNER_BL, // 4
                OUTER_CORNER_BR, // 5
                null, // 6
                SINGLE_L, // 7
                SINGLE_R, // 8
                null, // 9
                OUTER_CORNER_BL, // 10
                SINGLE_B, // 11
                SINGLE_B, // 12
                INNER_CORNER_BL, // 13
                INNER_CORNER_BR, // 14
                SINGLE_B, // 15
                SINGLE_B, // 16
                OUTER_CORNER_BR, // 17
                null, // 18
                SINGLE_L, // 19
                SINGLE_R, // 20
                null, // 21
                OUTER_CORNER_BL, // 22
                OUTER_CORNER_BR, // 23
                null, // 24
                OUTER_CORNER_BL, // 25
                SINGLE_B, // 26
                INNER_CORNER_BL_BORDER_R // 27
        );
        setRow(6, DOUBLE_L, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                SINGLE_L, // 7
                SINGLE_R, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                SINGLE_L, // 13
                SINGLE_R, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                SINGLE_L, // 19
                SINGLE_R, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(5, DOUBLE_L, // 0
                null, // 1
                OUTER_CORNER_TL, // 2
                SINGLE_T, // 3
                SINGLE_T, // 4
                SINGLE_T, // 5
                SINGLE_T, // 6
                INNER_CORNER_TL, // 7
                INNER_CORNER_TR, // 8
                SINGLE_T, // 9
                SINGLE_T, // 10
                OUTER_CORNER_TR, // 11
                null, // 12
                SINGLE_L, // 13
                SINGLE_R, // 14
                null, // 15
                OUTER_CORNER_TL, // 16
                SINGLE_T, // 17
                SINGLE_T, // 18
                INNER_CORNER_TL, // 19
                INNER_CORNER_TR, // 20
                SINGLE_T, // 21
                SINGLE_T, // 22
                SINGLE_T, // 23
                SINGLE_T, // 24
                OUTER_CORNER_TR, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(4, DOUBLE_L, // 0
                null, // 1
                OUTER_CORNER_BL, // 2
                SINGLE_B, // 3
                SINGLE_B, // 4
                SINGLE_B, // 5
                SINGLE_B, // 6
                SINGLE_B, // 7
                SINGLE_B, // 8
                SINGLE_B, // 9
                SINGLE_B, // 10
                OUTER_CORNER_BR, // 11
                null, // 12
                OUTER_CORNER_BL, // 13
                OUTER_CORNER_BR, // 14
                null, // 15
                OUTER_CORNER_BL, // 16
                SINGLE_B, // 17
                SINGLE_B, // 18
                SINGLE_B, // 19
                SINGLE_B, // 20
                SINGLE_B, // 21
                SINGLE_B, // 22
                SINGLE_B, // 23
                SINGLE_B, // 24
                OUTER_CORNER_BR, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(3, DOUBLE_L, // 0
                null, // 1
                null, // 2
                null, // 3
                null, // 4
                null, // 5
                null, // 6
                null, // 7
                null, // 8
                null, // 9
                null, // 10
                null, // 11
                null, // 12
                null, // 13
                null, // 14
                null, // 15
                null, // 16
                null, // 17
                null, // 18
                null, // 19
                null, // 20
                null, // 21
                null, // 22
                null, // 23
                null, // 24
                null, // 25
                null, // 26
                DOUBLE_R // 27
        );
        setRow(2, DOUBLE_CORNER_BL, // 0
                DOUBLE_B, // 1
                DOUBLE_B, // 2
                DOUBLE_B, // 3
                DOUBLE_B, // 4
                DOUBLE_B, // 5
                DOUBLE_B, // 6
                DOUBLE_B, // 7
                DOUBLE_B, // 8
                DOUBLE_B, // 9
                DOUBLE_B, // 10
                DOUBLE_B, // 11
                DOUBLE_B, // 12
                DOUBLE_B, // 13
                DOUBLE_B, // 14
                DOUBLE_B, // 15
                DOUBLE_B, // 16
                DOUBLE_B, // 17
                DOUBLE_B, // 18
                DOUBLE_B, // 19
                DOUBLE_B, // 20
                DOUBLE_B, // 21
                DOUBLE_B, // 22
                DOUBLE_B, // 23
                DOUBLE_B, // 24
                DOUBLE_B, // 25
                DOUBLE_B, // 26
                DOUBLE_CORNER_BR // 27
        );
        screenshot = new Image("images/screenshots/IngameReady.png", 8);
        screenshot.setVisible(false);
        add(screenshot);
    }

    private void setRow(int y, Brick... bricks)
    {
        for (int x = 0; x < bricks.length; x++)
        {
            Brick brick = bricks[x];
            if (brick != null)
            {
                setBrick(bricks[x], x, y);
            }
        }
    }

    private void setBrick(Brick brick, double x, double y)
    {
        Image image = brick.getImage();
        image.setPosition(x, y);
        image.makeStatic();
        add(image);
    }

    @Override
    public void onKeyDown(KeyEvent event)
    {
        switch (event.getKeyCode())
        {
        case KeyEvent.VK_SPACE -> ghost.setState(STAND);
        case KeyEvent.VK_DOWN -> ghost.setState(DOWN);
        case KeyEvent.VK_UP -> ghost.setState(UP);
        case KeyEvent.VK_LEFT -> ghost.setState(LEFT);
        case KeyEvent.VK_RIGHT -> ghost.setState(RIGHT);
        case KeyEvent.VK_S -> screenshot.toggleVisible();
        }
    }

    public static void main(String[] args)
    {
        Game.debug();
        Main.start(new IngameScene(), 4);
    }
}
