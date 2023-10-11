package soc;

public class Demo2 {

	 public static void main(String[] args) {

		 
	        State[][] cells = {
	                {State.OCCUPIED, State.EMPTY,    State.BURNING,  State.EMPTY},
	                {State.EMPTY,    State.EMPTY,    State.OCCUPIED, State.EMPTY},
	                {State.BURNING,  State.EMPTY,    State.OCCUPIED, State.OCCUPIED},
	                {State.EMPTY,    State.EMPTY,    State.EMPTY,    State.EMPTY},
	                {State.EMPTY,    State.OCCUPIED, State.EMPTY,    State.EMPTY},
	        };
	        for (int time = 0; time <= 5; time++) {
	            System.out.println("Time t = " + time);
	            ForestFire.printForest(cells);
	            ForestFire.update(cells);
	            System.out.println();
	        }
	    }
	 
}
