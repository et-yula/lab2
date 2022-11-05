package MyPockemons;

import MyMoves.Flatter;
import ru.ifmo.se.pokemon.Type;

public class Nidorino extends Nidoran {
    public Nidorino (String name, int level) {
        super(name, level);
        setType(Type.POISON);
        setStats(61,72,57,55,55,65);
        addMove(new Flatter());
    }
}
