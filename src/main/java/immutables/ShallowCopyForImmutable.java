package immutables;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopyForImmutable {

    private final String name;
    private final Integer employeeId;
    private final List<String> tokens;

    public ShallowCopyForImmutable(String name, Integer employeeId, List<String> tokens) {
        this.name = name;
        this.employeeId = employeeId;
        this.tokens = tokens;
    }

    public String getName() {
        return name;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public List<String> getTokens() {
        return tokens;
    }

    @Override
    public String toString() {
        return "ShallowCopyForImmutable{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", tokens=" + tokens +
                '}';
    }
}

class TestShallowCopyForImmutable{
    public static void main(String[] args){
        ArrayList<String> tokenList = new ArrayList();
        tokenList.add("Active");
        ShallowCopyForImmutable testObj = new ShallowCopyForImmutable("Arpitha",201,tokenList);
        System.out.println("testObj "+testObj);
        /*
        output:
        testObj ShallowCopyForImmutable{name='Arpitha', employeeId=201, tokens=[Active]}
         */
        tokenList.add("InActive");
        System.out.println("InActive token added to List, lets see what holds the testObj "+testObj);
        /*
        output:
        InActive token added to List, lets see what holds the
        testObj ShallowCopyForImmutable{name='Arpitha', employeeId=201, tokens=[Active, InActive]}
         */
    }
}
