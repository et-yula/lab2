import MyPockemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String [] args) {
        Battle b = new Battle();
        Celesteela p1 = new Celesteela("Юля", 1);
        Yungoos p2 = new Yungoos("Настя",1);
        Gumshoos p3 = new Gumshoos("Рома", 1);
        Nidoran p4 = new Nidoran("Арсений",1);
        Nidorino p5 = new Nidorino("Кирилл",1);
        Nidoking p6 = new Nidoking("Миша",1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
