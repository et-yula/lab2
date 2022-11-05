package MyMoves;

import ru.ifmo.se.pokemon.*;

public class PowerWhip extends PhysicalMove {
    public PowerWhip () {
        super(Type.GRASS, 120,85);
    }
    @Override
    protected String describe () {
        return "использует Power Whip";
    }
}
