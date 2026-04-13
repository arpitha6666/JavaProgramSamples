package wiproCodingQuestions;

public class GameTheory {
    /*
    * Let’s assume two people are playing the game where they both get a set of ‘N’ distinct integers.
    * They take turns to make a move where each can choose ‘X’ and ‘Y’ distinct integers from the sets
    *  in a way that the set does not end up containing the absolute difference which is X-Y.
    * The player making the move currently then adds the integer X-Y to the set,
    *  making the size of the set grow by one. In the case where the current player cannot make a valid move,
    * the player loses.
    * Who will win the game, the player who goes first or the player who goes second? in java
    */
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b= a%b;
            a= temp;
        }
        return a;
    }

    public static int findGcd(int[] arr){
        int g = arr[0];
        for(int i=1;i<arr.length;i++){
            g = gcd(g,arr[i]);
        }
        return g;
    }

    public static String findWinner(int[] arr){
        int n = arr.length;
        int g = findGcd(arr);
        int max=0;
        for(int a : arr){
            max = Math.max(max,a);
        }
        int finalSize = max/g;
        int moves = finalSize-n;
        if(moves%2==1){
            return "First Player Wins";
        }else{
            return "Second Player wins";
        }

    }
    public static void main(String[] args){
       /*
        Picking two distinct numbers X and Y
        Adding |X - Y| only if it’s not already in the set
        So over time, the set keeps growing with absolute differences.
        Critical Insight
        If you keep taking differences of numbers, eventually the set will contain:
        All multiples of the GCD (Greatest Common Divisor) of the original numbers.
        Let:
        g = gcd of all elements in the initial array
        Then the final set will become: { g, 2g, 3g, ..., maxElement }
        Total Possible Numbers: Number of elements in the final set: finalSize = maxElement / g
        Initial size = N,So total moves possible: moves = finalSize - N
        Who Wins? If moves is odd → First player wins, If moves is even → Second player wins

        Because: Players alternate turns,Last move wins,Classic parity game */
        int[] arr = {6, 10, 14,15};

        System.out.println(findWinner(arr));

    }
}
