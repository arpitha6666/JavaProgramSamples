package immutables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public final class ListImmutable {

    private final List<String>  strLis;

    public ListImmutable( List<String> strLis) {

        this.strLis = new ArrayList<>(strLis);
    }


    public List<String> getStrLis() {
        return new ArrayList<>(strLis);
    }

}

class Test{
    public static void main(String[] args){
        ListImmutable obj = new ListImmutable(new ArrayList<>(Arrays.asList(new String[]{"Arpitha", "Nitte", "BE"})));

        obj.getStrLis().stream().forEach(System.out::println);
        obj.getStrLis().add("Yelahanka");
        obj.getStrLis().stream().forEach(System.out::println);
    }
}
