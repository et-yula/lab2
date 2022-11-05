package MyMoves;
import ru.ifmo.se.pokemon.*;

public class SignalBeam extends SpecialMove {
    public SignalBeam (){
        super(Type.BUG, 75, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1);
        if (e.success()) {
            Effect.confuse(pokemon);
        }
    }
    @Override
    protected String describe() {
        return "использует Signal Beam";
    }

}
