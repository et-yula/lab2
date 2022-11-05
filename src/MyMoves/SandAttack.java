package MyMoves;
import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {
    public SandAttack () {
        super(Type.GROUND, 0,100);
    }
    @Override
    protected void applyOppEffects (Pokemon pokemon) {
        Effect e = new Effect().turns(-1).stat(Stat.ACCURACY,-1);
        pokemon.addEffect(e);
    }
    @Override
    protected String describe () {
        return "использует Sand Attack";
    }
}
