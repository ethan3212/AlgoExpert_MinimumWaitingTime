import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create & populate our 'queries' array
        int[] queries = {3, 2, 1, 2, 6};
        // call our method & display the output
        System.out.println(minimumWaitingTime(queries));        // O(nLog(n)) time | O(1) space
    }

    // O(nLog(n)) time | O(1) space
    public static int minimumWaitingTime(int[] queries) {
        // sort the 'queries' in ascending order
        Arrays.sort(queries);       // O(nLog(n)) time
        // create a runningSum variable
        int runningSum = 0;
        // iterate through the queries
        for(int i = 0; i < queries.length; i++) {       // O(n) time
            // hold the value of the current query length
            int query = queries[i];
            // determine how many elements come AFTER the current query. This is our multiplier
            int multiplier = queries.length - (i + 1);
            // multiply the query by the multiplier and add it to the runningSum
            runningSum += (query * multiplier);
        }
        // return the value of the runningSum variable
        return runningSum;
    }
}