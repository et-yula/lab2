package MyMoves;
import ru.ifmo.se.pokemon.*;

public class TailGlow extends StatusMove {
    public TailGlow () {
        super(Type.BUG,0,0);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK, -3);
        pokemon.addEffect(e);
    }
    @Override
    protected String describe () {
        return "использует Tail Glow";
    }
}
