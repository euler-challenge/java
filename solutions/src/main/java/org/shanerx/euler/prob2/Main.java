public class Main {

    public static void main(String []args){
        long prev = 1;
	    long next = 2;
	    long sum = 2;

	    while (next <= 4e+6) {
		    long temp = prev;
		    prev = next;
		    next += temp;

	    	if (next % 2 == 0) {
	    	    sum += next;
	        }
        }
	    System.out.println(sum);
    }
}
