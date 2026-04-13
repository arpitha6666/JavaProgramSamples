package wiproCodingQuestions;

public class PythagoreanTriplets {

    public void findPyTriplets(int limit){
        int a, b,c=0;
        int m=2;
        while (c<limit){
            for(int n=1;n<m;++n) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;

                if (c > limit)
                    break;
                System.out.println(a + " " + b + " " + c);
            }
            m++;
        }
    }

    public static void main(String[] args){
        PythagoreanTriplets obj = new PythagoreanTriplets();
        obj.findPyTriplets(20);
    }
}
