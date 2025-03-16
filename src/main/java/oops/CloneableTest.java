package oops;

public class CloneableTest implements Cloneable{

    int i ;

    public CloneableTest(int i ){
        this.i=i;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Test{
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableTest a = new CloneableTest(20);
        CloneableTest b = (CloneableTest) a.clone();
        System.out.println(b.i);
    }
}
