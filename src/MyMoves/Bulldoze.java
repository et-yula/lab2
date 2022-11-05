package MyMoves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze () {
        super(Type.GROUND, 60,100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().turns(-1).stat(Stat.SPEED,-1);
        pokemon.addEffect(e);
    }
    @Override
    protected String describe () {
        return "использует Bulldoze";
    }
}
