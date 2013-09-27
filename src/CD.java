import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD
{
    public static void main(String[] args) throws IOException {
	int N;
	int M;
	int counter = 0;

	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	// Read and store input
	String line1 = input.readLine();
	N = Integer.valueOf(line1.split(" ")[0]);
	M = Integer.valueOf(line1.split(" ")[1]);

	int[] nArray = new int[N];
	int[] mArray = new int[M];

	for (int i = 0; i < N; i++) {
	    String line2 = input.readLine();

	    // Store value
	    nArray[i] = Integer.valueOf(line2);
	}



	for (int i = 0; i < M; i++) {
	    String line3 = input.readLine();

	    // Store value
	    mArray[i] = Integer.valueOf(line3);
	}

	String terminationLine = input.readLine();

	if (terminationLine.equals("0 0")) {
	    // Compare and count the number of collisions
	    for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
		    if (nArray[i] != 0 && mArray[j] != 0 && nArray[i] == mArray[j])
			counter++;
		}
	    }

	    // Then print the number
	    System.out.println(counter);
	}
    }
}
