package MyMoves;
import ru.ifmo.se.pokemon.*;


public class Confide extends StatusMove {
    public Confide () {
        super(Type.NORMAL,0,0);
    }
    @Override
    protected void applyOppEffects (Pokemon pokemon) {
        Effect e = new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK,-1);
        pokemon.addEffect(e);
    }
    @Override
    protected String describe () {
        return "использует Confide";
    }
}
