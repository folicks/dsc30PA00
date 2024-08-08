/* 
* NAME: Felix Najera
* PID: A17618969
*/

/*
Class that uses remainder like a number if a is less than b


*/
public class Mystery {

    // TODO: Fix the bugs in mystery
    public static double mystery(double a, double b) {
        /*
        where the modulo and addition happens
        @param both just decimal values
        @return the resulting answer from doin class
        */
        
        if (a >= b) {
            return (a + b);
        } else if (b > a) {
            return (a % b) * 2;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    // No need to touch main!
    public static void main(String[] args) {
        System.out.println(mystery(3.0, 4.0));
    }
}
