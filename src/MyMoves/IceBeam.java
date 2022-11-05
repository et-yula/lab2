package MyMoves;
import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam () {
        super(Type.BUG,75,100);
    }
    @Override
    protected void applyOppEffects (Pokemon pokemon) {
        Effect e = new Effect().chance(0.1);
        if (e.success()) {
            Effect.freeze(pokemon);
        }
    }
    @Override
    protected String describe () {
        return "использует Ice Beam";
    }
}
