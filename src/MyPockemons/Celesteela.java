package MyPockemons;
import MyMoves.PowerWhip;
import MyMoves.SignalBeam;
import MyMoves.TailGlow;
import MyMoves.WildCharge;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Celesteela extends Pokemon {
    public Celesteela (String name, int level) {
        super(name,level);
        setType(Type.STEEL, Type.FLYING);
        setStats(97,101,103,107,101,61);
        setMove(new SignalBeam(),new TailGlow(), new WildCharge(),new PowerWhip());
    }

}
