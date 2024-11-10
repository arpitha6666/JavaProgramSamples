package immutables;

import java.util.ArrayList;
import java.util.List;
 final class CreateImmutableListExample {

    private final String name;
    private final Integer employeeId;

    private final List<String> tokens;

    public CreateImmutableListExample(String name, Integer employeeId, List<String> tokens) {
        this.name = name;
        this.employeeId = employeeId;
        // Defensively copy the input data list to ensure immutability
        this.tokens = new ArrayList<>(tokens);
    }

    public String getName() {
        return name;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public List<String> getTokens() {
        return new ArrayList<String>(this.tokens);
    }

    @Override
    public String toString() {
        return "CreateImmutable{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", tokens=" + tokens +
                '}';
    }
}

 class TestCreateImmutableListExample {
    public static void main(String[] args){
        ArrayList<String> tokenList = new ArrayList();
        tokenList.add("Active");
        CreateImmutableListExample testObj = new CreateImmutableListExample("Arpitha",201,tokenList);
        System.out.println("testObj "+testObj);
        /*
        output :
        testObj CreateImmutable{name='Arpitha', employeeId=201, tokens=[Active]}
         */
        testObj.getTokens().add("New Token");
        System.out.println("New token added to List, lets see what holds the testObj"+testObj);

        /*
        output :
        testObj CreateImmutable{name='Arpitha', employeeId=201, tokens=[Active]}
        New token added to List, lets see what holds the testObjCreateImmutable{name='Arpitha', employeeId=201, tokens=[Active]}

         */
    }
}