package MyPockemons;

import MyMoves.Bulldoze;

public class Gumshoos extends Yungoos {
    public Gumshoos (String name, int level) {
        super(name,level);
        setStats(88,110,60,55,60,45);
        addMove(new Bulldoze());
    }
}
