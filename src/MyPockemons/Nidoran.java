package MyPockemons;

import MyMoves.IceBeam;
import MyMoves.PoisonSting;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoran extends Pokemon {
    public Nidoran(String name, int level) {
        super(name,level);
        setType(Type.POISON);
        setStats(46,57,40,40,40,50);
        setMove(new PoisonSting(), new IceBeam());


    }
}
