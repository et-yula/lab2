package MyMoves;
import ru.ifmo.se.pokemon.*;

public class Flatter extends StatusMove {
    public Flatter () {
        super(Type.DARK,0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK,1);
        pokemon.addEffect(e);
    }
    @Override
    protected String describe () {
        return "использует Flatter";
    }
}
