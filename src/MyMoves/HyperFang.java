package MyMoves;
import ru.ifmo.se.pokemon.*;

public class HyperFang extends PhysicalMove {
    public HyperFang () {
        super(Type.NORMAL, 80, 90);
    }
    @Override
    protected void applyOppEffects (Pokemon pokemon) {
        Effect e = new Effect().chance(0.1);
        if (e.success()) {
            Effect.flinch(pokemon);
        }
    }
    @Override
    protected String describe () {
        return "использует Hyper Fang";
    }
}
