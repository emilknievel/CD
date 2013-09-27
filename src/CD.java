import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CD
{
    public static void main(String[] args) throws IOException {
	int N;
	int M;
	ArrayList<Integer> counters = new ArrayList<Integer>();
	int caseCounter = 0;

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	// Read and store input
	String line1 = input.readLine();

	while (!line1.equals("0 0")) {
	    counters.add(0);
	    N = Integer.valueOf(line1.split(" ")[0]);
	    M = Integer.valueOf(line1.split(" ")[1]);

	    int[] nArray = new int[N];
	    int[] mArray = new int[M];

	    for (int i = 0; i < N; i++) {
		String line2 = input.readLine();
		boolean exists = false;

		// Store value
		for (int j = 0; j < N; j++) {
		    if (nArray[j] == Integer.valueOf(line2)) {
			exists = true;
			nArray[j] = 0;
			break;
		    }
		}
		if (!exists)
		    nArray[i] = Integer.valueOf(line2);
	    }

	    for (int i = 0; i < M; i++) {
		String line3 = input.readLine();
		boolean exists = false;

		// Store value
		for (int j = 0; j < M; j++) {
		    if (mArray[j] == Integer.valueOf(line3)) {
			exists = true;
			mArray[j] = 0;
			break;
		    }
		}
		if (!exists)
		    mArray[i] = Integer.valueOf(line3);
	    }
	    if (N <= 1000000 && M <= 1000000) {
		// Compare and count the number of collisions
		for (int i = 0; i < N; i++) {
		    for (int j = 0; j < M; j++) {
			if (nArray[i] > 0 && mArray[j] > 0 && nArray[i] < 1000000000 && mArray[j] < 1000000000
			    && nArray[i] == mArray[j]) {
			    counters.set(caseCounter, counters.get(caseCounter) + 1);
			}
		    }
		}
	    }
	    caseCounter++;
	    line1 = input.readLine();
	}

	for (int i = 0; i < caseCounter; i++) {
	    System.out.println(counters.get(i));
	}
    }
}
