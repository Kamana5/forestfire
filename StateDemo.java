package soc;

import java.util.Arrays;

public class StateDemo {

	public static void main(String[] args) {
		State s = State.EMPTY;
        State t = State.BURNING;
        // print states
        System.out.println(s);      // prints EMPTY
        System.out.println(t);      // prints BURNING

        // test if states are equal
        if (s == t) {
            System.out.println("equal states");
        }
        else {
            System.out.println("different states");
        }
        
        // make a 2D array of State
        int numRows = 10;
        int numCols = 8;
        State[][] cells = new State[numRows][numCols];
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                cells[r][c] = State.EMPTY;
            }
        }
        
        // set one of the array elements to occupied
        cells[1][1] = State.OCCUPIED;
        
        // print the array
        String str = Arrays.deepToString(cells);
        System.out.println(str);
	}

}
