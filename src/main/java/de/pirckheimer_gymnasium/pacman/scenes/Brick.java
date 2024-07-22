package de.pirckheimer_gymnasium.pacman.scenes;

import de.pirckheimer_gymnasium.engine_pi.actor.Image;

public enum Brick
{
    SINGLE_B("single_B", "R 0, 0.5, 1, 0.5"),
    SINGLE_BL("single_BL", "R 0.5, 0.5, 0.5, 0.5"),
    SINGLE_BR("single_BR", "R 0, 0.5, 0.5, 0.5"),
    SINGLE_L("single_L", "R 0.5, 0, 0.5, 1"),
    SINGLE_R("single_R", "R 0, 0, 0.5, 1"),
    SINGLE_T("single_T", "R 0, 0, 1, 0.5"),
    SINGLE_TL("single_TL", "R 0.5, 0, 0.5, 0.5"),
    SINGLE_TR("single_TR", "R 0, 0, 0.5, 0.5");

    private String filename;

    private String fixture;

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
