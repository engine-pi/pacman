package de.pirckheimer_gymnasium.pacman.scenes;

import de.pirckheimer_gymnasium.engine_pi.actor.Image;

public enum Brick
{

    // double
    DOUBLE_B("double_B", "R 0, 0, 1, 0.5"),
    DOUBLE_BL("double_BL", "R0,0,0.5,1 & R0.5,0,0.5,0.5"),
    DOUBLE_BR("double_BR", "R0,0,0.5,0.5 & R0.5,0,0.5,1"),
    DOUBLE_L("double_L", "R 0, 0, 0.5, 1"),
    DOUBLE_R("double_R", "R 0.5, 0, 0.5, 1"),
    DOUBLE_T("double_T", "R 0, 0.5, 1, 0.5"),
    DOUBLE_TL("double_TL", "R0,0,0.5,0.5 & R0,0.5,1,0.5"),
    DOUBLE_TR("double_TR", "R0.5,0,0.5,0.5 & R0,0.5,1,0.5"),
    DOUBLE_L_STRAIGHT_T_BL("double_LShape_straightT_BL", "R 0.5,0,0.5,0.5 & R0,0.5,1,0.5"),
    DOUBLE_L_STRAIGHT_T_BR("double_LShape_straightT_BR", "R 0,0,0.5,0.5 & R0,0.5,1,0.5"),

    // single
    SINGLE_B("single_B", "R 0, 0.5, 1, 0.5"),
    SINGLE_BL("single_BL", "R 0.5, 0.5, 0.5, 0.5"),
    SINGLE_BR("single_BR", "R 0, 0.5, 0.5, 0.5"),
    SINGLE_L("single_L", "R 0.5, 0, 0.5, 1"),
    SINGLE_R("single_R", "R 0, 0, 0.5, 1"),
    SINGLE_T("single_T", "R 0, 0, 1, 0.5"),
    SINGLE_TL("single_TL", "R 0.5, 0, 0.5, 0.5"),
    SINGLE_TR("single_TR", "R 0, 0, 0.5, 0.5"),
    // bulge = Ausbuchtung
    SINGLE_BULGE_BL("single_bulge_BL", "R 0.5, 0.5, 0.5, 0.5"),
    SINGLE_BULGE_BR("single_bulge_BR", "R 0.5, 0.5, 0.5, 0.5"),
    SINGLE_BULGE_TL("single_bulge_TL", "R0,0,1,0.5 & R0.5,0.5,0.5,0.5"),
    SINGLE_BULGE_TR("single_bulge_TR", "R0,0,1,0.5 & R0,0.5,0.5,0.5");

    private final String filename;

    private final String fixture;

    Brick(String filename, String fixture)
    {
        this.filename = filename;
        this.fixture = fixture;
    }

    public Image getImage()
    {
        Image image = new Image("images/maze/" + filename + ".png", 8);
        image.setFixtures(fixture);
        return image;
    }
}
