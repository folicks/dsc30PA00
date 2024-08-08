/* 
* NAME: Felix Najera
* PID: A17618969
*/

/**
* Description of ReturnTrue
* 
* @author Felix Najera
* @since ${8/7/2024}
*/
public class ReturnTrue {

    
    public static boolean returnTrue(int i) {

        /**
         * Boolean that results after iterations take
         * varies depending on choices less than 10
         *
         * @param i : a start point for 
         * @return boolean of whether or not int is "correct"
         */
        int s = 10; 
        while (i < s) { 
            if (i + 4 > s) { 
                return true; 
            }
            i += 1; 
        }
        return false; 
    }

    // No need to touch main!
    public static void main(String[] args) {
        System.out.println(ReturnTrue.returnTrue(1)); 
        System.out.println(ReturnTrue.returnTrue(5)); 
    }
}
