package MyPockemons;

import MyMoves.Confide;
import MyMoves.HyperFang;
import MyMoves.SandAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Yungoos extends Pokemon {
    public Yungoos (String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(48, 70, 30, 30, 30, 45);
        setMove(new SandAttack(), new HyperFang(), new Confide());
    }

}
