package collectionPgrms;


import java.util.Set;

public class EnumSet {
    enum Gfg {
        CODE,
        LEARN,
        CONTRIBUTE,
        QUIZ,
        MCQ
    };

    public static void main(String[] args) {
        Set<Gfg> s1;
        s1 = java.util.EnumSet.of(Gfg.CODE, Gfg.LEARN, Gfg.CONTRIBUTE, Gfg.QUIZ);

        System.out.println("Set 1: " + s1);

    }
}
