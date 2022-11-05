package MyPockemons;

import MyMoves.DoubleKick;
import ru.ifmo.se.pokemon.Type;

public class Nidoking extends Nidorino {
    public Nidoking (String name, int level) {
        super(name,level);
        setType(Type.POISON, Type.GROUND);
        setStats(81,102,77,85,75,85);
        addMove(new DoubleKick());
    }
}
