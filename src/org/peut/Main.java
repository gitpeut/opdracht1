package org.peut;

public class Main {

    static int[] inputs = { 1,-1,0,2,3};
    static int   goal = 2;

    // how many combinations of three numbers in inputs
    // add up to goal

    static void threeToGoal(){
        int count = 0;
        for ( int i = 0 ; i < inputs.length; ++i ){
            for( int j = i +1; j < inputs.length; ++j ){
                for ( int k = j+1; k < inputs.length; ++k){
                    if ( goal == inputs[i] + inputs[j] + inputs[k] ){
                        System.out.println( goal + " reached with " + inputs[i] +","+  inputs[j] + " and " + inputs[k] );
                        count++;
                    }
                }
            }
        }
        System.out.println("Found "+ count + " combinations of three inputs that add up to " + goal );
    }

    public static void main(String[] args) {
	// write your code here
        threeToGoal();
    }
}
