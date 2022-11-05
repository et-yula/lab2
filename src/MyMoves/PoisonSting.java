package MyMoves;
import ru.ifmo.se.pokemon.*;

public class PoisonSting extends PhysicalMove {
    public PoisonSting () {
        super(Type.POISON,15,100);
    }
    @Override
    protected void applyOppEffects (Pokemon pokemon) {
        Effect e = new Effect().chance(0.3);
        if (e.success()) {
            Effect.poison(pokemon);
        }
    }
    @Override
    protected String describe () {
        return "использует Poison Sting";
    }
}
